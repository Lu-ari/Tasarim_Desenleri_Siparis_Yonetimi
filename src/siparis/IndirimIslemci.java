package siparis;

public class IndirimIslemci extends SiparisIslemci {
    @Override
    public void siparisiIsle(Siparis siparis) {
        // indirim işlemi yap
        if (nextHandler != null) {
            nextHandler.siparisiIsle(siparis);
        }
    }
}
