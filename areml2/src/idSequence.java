import java.util.Random;

/**
 * Created by suneth on 12/16/2017.
 */
public class idSequence {
    public static int getNextValue() {
        Random id = new Random();
        int  n = id.nextInt(50)*1000 + 1;
        return n;
    }

    public static int getNextValueAsString() {
        return getNextValue();
    }
}
