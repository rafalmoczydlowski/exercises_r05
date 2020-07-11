import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DoublesReader {

    public ArrayList<Double> readValues(String filename) throws IOException{
        if (filename == null || filename.isEmpty()) {
            throw new IllegalArgumentException("Brak nazwy pliku!"); // Wyjątek wyrzucany, gdy parametr w konstruktorze jest pusty
        }
        ArrayList<Double> doubles = new ArrayList<>();
        File file = new File(filename);
        if (! file.exists()) {
            throw new FileNotFoundException("Nie można znaleźć pliku!"); // wyjątek wyrzucany, gdy program nie może znaleźć pliku
        }
        if (file.length() == 0) {
            throw new NullPointerException("Brak danych!"); // wyjątek wyrzucany, gdy plik wysłany do programu jest pusty
        }
        Scanner sc = new Scanner(file);
        while(sc.hasNextDouble()) {
            doubles.add(sc.nextDouble());
        }
        if (sc.hasNext() && !(sc.hasNextDouble())){
            throw new IllegalArgumentException("W pliku oprócz danych zmiennoprzecinkowych znajdują się inne wartości!"); // wyjątek wyrzucany, gdy w pliku znajdują się daane inne niż typu zmiennoprzecinkowego
        }
        return doubles;
    }
}
