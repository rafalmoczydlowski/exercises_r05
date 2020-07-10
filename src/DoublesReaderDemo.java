import java.io.IOException;

public class DoublesReaderDemo {
    public static void main (String[] args){
        DoublesReader dr = new DoublesReader();
        try {
            dr.readValues("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
