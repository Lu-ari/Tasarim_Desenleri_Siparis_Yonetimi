package siparis;

public class KargoIslemci extends SiparisIslemci {
    @Override
    public void siparisiIsle(Siparis siparis) {
        // kargo işlemi yap
        if (nextHandler != null) {
            nextHandler.siparisiIsle(siparis);
        }
    }
}
