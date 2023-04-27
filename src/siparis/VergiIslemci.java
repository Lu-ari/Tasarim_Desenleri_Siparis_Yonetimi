package siparis;

public class VergiIslemci extends SiparisIslemci {
    @Override
    public void siparisiIsle(Siparis siparis) {
        // vergi hesaplama işlemi yap
        if (nextHandler != null) {
            nextHandler.siparisiIsle(siparis);
        }
    }
}
