import java.util.*;

//Product Of Two Number
public class Product {
    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt();
        int product = calculateProduct(a, b);
        System.out.println("The Product Of Two Numbers:" + product);

    }
}