package siparis;

public class OdemeIslemci extends SiparisIslemci {
    @Override
    public void siparisiIsle(Siparis siparis) {
        if (siparis.isOdendi()) {
            if (nextHandler != null) {
                nextHandler.siparisiIsle(siparis);
            }
        }
    }
}
