import java.util.Scanner;

public class TestMaximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Three String value");
        String x = in.next();
        String y = in.next();
        String z = in.next();
        String max = testMaximumNumber(x, y, z);
        System.out.println("Maximum String is: " + max);

    }

    private static Integer testMaximumNumber(Integer x, Integer y, Integer z) {
        Integer max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    private static Float testMaximumNumber(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }

    private static String testMaximumNumber(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;

    }
}