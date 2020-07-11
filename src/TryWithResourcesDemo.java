import java.io.File;

public class TryWithResourcesDemo {
    public static void main (String [] args) {
        TryWithResources.copyText(new File("source.txt"), new File("destination.txt"));
    }
}
