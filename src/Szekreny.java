import java.util.ArrayList;
import java.util.List;

public class Szekreny {
    List<Ruha> ruhak = new ArrayList<>();

    public List<Ruha> getRuhak() {
        return ruhak;
    }
    public void addRuha(Ruha ruha){
        this.ruhak.add(ruha);
    }
    public void removeRuha(Ruha ruha){
        this.ruhak.remove(ruha);
    }
}
