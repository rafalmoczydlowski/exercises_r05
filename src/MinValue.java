import java.util.Arrays;

public class MinValue {
    private MinValue(){}
    public static int min (int[] values) {
        int smallestValue = values[0];
        for (int value : values) {
            if (value < smallestValue) {
                smallestValue = value;
            }
        }
        int finalSmallest = smallestValue;
        assert Arrays.stream(values).allMatch(value -> value >= finalSmallest);
        return finalSmallest;
    }
}
