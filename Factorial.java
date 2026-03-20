import java.util.*;

//Factorial Of The Number
public class Factorial {
    public static int printFactorial(int n) {
        if (n < 0) {
            System.out.print("Invalid Number");
            return -1;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = scanner.nextInt();
        int factorial = printFactorial(n);
        if (factorial != -1) {
            System.out.print("The Factorial Of The Given Number is:" + factorial);
        }

    }
}
