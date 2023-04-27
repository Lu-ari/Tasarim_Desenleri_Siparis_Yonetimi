package siparis;

public abstract class SiparisIslemci {
    protected SiparisIslemci nextHandler;

    public void setNextHandler(SiparisIslemci nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void siparisiIsle(Siparis siparis);
}
