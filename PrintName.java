import java.util.Scanner;

public class PrintName {

    // Function to print name
    public static void printMyName(String name) {
        System.out.println("Your name is: " + name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // better than next()

        printMyName(name);

        scanner.close(); // good practice
    }
}