import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DoublesReaderDemo {
    public static void main (String... args) throws IOException {
        SumValues sv = new SumValues();
        Scanner sc = new Scanner(System.in);
        String arg = null;
        System.out.println("Podaj nazwę pliku");
        while((arg = sc.nextLine()).isEmpty()) {
            System.err.println("Nazwa pliku nie może być pusta!");
            return;
        }
        try {
            System.out.println(sv.sumOfValues(arg));
        } catch (FileNotFoundException ex) {
            System.err.println(String.format("Plik \"%s\" nie został znaleziony. ", arg) + ex.getMessage());
        }
        catch (IllegalArgumentException ex) {
            System.err.println(String.format("W pliku \"%s\" znajdują się niedozwolone wartości. ", arg) + ex.getMessage());
        }
        catch (NullPointerException ex) {
            System.err.println(String.format("Plik \"%s\" jest pusty. ", arg) + ex.getMessage());
        }
    }
}
