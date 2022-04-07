import java.util.Scanner;

public class TestMaximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Three numbers");
        Integer x = in.nextInt();
        Integer y = in.nextInt();
        Integer z = in.nextInt();

        Integer max = testMaximumNumber(x, y, z);
        System.out.println("maximum number is: " + max);

    }

    public static Integer testMaximumNumber(Integer x, Integer y, Integer z) {
        Integer max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
