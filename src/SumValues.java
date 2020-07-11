import java.io.IOException;

public class SumValues {
    public double sumOfValues (String filename) throws IOException {
        DoublesReader dr = new DoublesReader();
        var values = dr.readValues(filename);
        double result = 0.0;
        for (double value : values) {
            result += value;
        }
        return result;
    }
}
