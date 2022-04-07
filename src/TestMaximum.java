import java.util.Scanner;

public class TestMaximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Three Decimal numbers");
        Float x = in.nextFloat();
        Float y = in.nextFloat();
        Float z = in.nextFloat();

        Float max = testMaximumNumber(x, y, z);
        System.out.println("Maximum float number is: " + max);

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
        if(y.compareTo(max)>0)
            max=y;
        if(z.compareTo(max)>0)
            max=z;
        return max;
    }

}
