public class Polo extends Ruha {
    String szine;
    boolean minta;

    public Polo(String name, Fajta fajta, Allapot allapot, String szine, boolean minta) {
        super(name, fajta, allapot);
        this.szine = szine;
        this.minta = minta;
    }


}
