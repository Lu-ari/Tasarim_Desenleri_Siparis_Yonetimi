package siparis;

public class Siparis {
    private int siparisNo;
    private String musteriAdi;
    private double tutar;
    private boolean odendi;

    public Siparis(int siparisNo, String musteriAdi, double tutar, boolean odendi) {
        this.siparisNo = siparisNo;
        this.musteriAdi = musteriAdi;
        this.tutar = tutar;
        this.odendi = odendi;
    }

    public int getSiparisNo() {
        return siparisNo;
    }

    public void setSiparisNo(int siparisNo) {
        this.siparisNo = siparisNo;
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    public boolean isOdendi() {
        return odendi;
    }

    public void setOdendi(boolean odendi) {
        this.odendi = odendi;
    }

    public static void main(String[] args) {
        // Siparis objesi oluşturma
        Siparis siparis = new Siparis(1, "Ahmet", 100.0, true);
        

        // İşlemcileri oluşturma
        OdemeIslemci odemeIslemci = new OdemeIslemci();
        IndirimIslemci indirimIslemci = new IndirimIslemci();
        VergiIslemci vergiIslemci = new VergiIslemci();
        KargoIslemci kargoIslemci = new KargoIslemci();

        // İşlemcileri zincirleme bağlama
        odemeIslemci.setNextHandler(indirimIslemci);
        indirimIslemci.setNextHandler(vergiIslemci);
        vergiIslemci.setNextHandler(kargoIslemci);

        // Sipariş işleme zincirini başlatma
        odemeIslemci.siparisiIsle(siparis);

        // Siparişin son durumunu ekrana yazdırma
        System.out.println("Siparişin Son Durumu:");
        System.out.println("Sipariş No: " + siparis.getSiparisNo());
        System.out.println("Müşteri Adı: " + siparis.getMusteriAdi());
        System.out.println("Tutar: " + siparis.getTutar());
        System.out.println("Ödendi mi?: " + siparis.isOdendi());
    }
}

