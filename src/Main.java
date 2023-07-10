import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //file olvasóval beolvassuk a sorokat
        List<String> lines = FileReader.fileReadHandler("res/person.txt");
        //példányosítunk egy szekrényt
        List<Szekreny> szekreny = new ArrayList<>();
        //soronként belerakjuk a szekrénybea sorokból példányosított ruhákat
        for (var line : lines) {
            String[] linesAsArray = line.split(",");

            switch ("") {
                case "polo" -> new Polo(linesAsArray[0],
                        linesAsArray[1].equals("férfi") ? Fajta.FERFI : Fajta.NOI,
                        linesAsArray[2].equals("kiváló") ? Allapot.KIVALO : Allapot.JO,
                        linesAsArray[3],
                        Boolean.parseBoolean(linesAsArray[4]));
                szekreny.add(Ruha );
                }
            }
        }
    }
}