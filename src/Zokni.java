public class Zokni extends Ruha {
    ZokniTipus zokniTipus;

    public Zokni(String name, Fajta fajta, Allapot allapot, ZokniTipus zokniTipus) {
        super(name, fajta, allapot);
        this.zokniTipus = zokniTipus;
    }
}
