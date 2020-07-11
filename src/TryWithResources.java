import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {

    private TryWithResources () {}

    public static void copyText(File input, File output) {
        if (input == null || output == null) {
            System.err.printf("Nie można znaleźć pliku %s lub %s", input, output);
            return;
        }
        Scanner in = null;
        PrintWriter out = null;
        try {
            in = new Scanner(input);
            out = new PrintWriter(output);
            while(in.hasNextLine()) {
                out.print(in.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.printf("Nie można znaleźć pliku %s lub %s", input, output);
        }
        finally {
            if (in != null) {
                in.close(); // zobacz checkError() w klasie PrintWriter
            }
            if (out != null) {
                out.close(); // zobacz checkError() w klasie PrintWriter
            }
        }
    }
}