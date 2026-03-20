import java.util.*;

//Addition Of Two Numbers
public class Sum {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a = scanner.nextInt();
        System.out.print("Enter Second Number:");
        int b = scanner.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("The Sum Of The Two Numbers is:" + sum);
    }
}
