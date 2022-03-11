import java.util.Scanner;

public class SoftwareEngineering {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int value1 = scanner.nextInt();
        System.out.print("Second number: ");
        int value2 = scanner.nextInt();

        System.out.print("Sum: " + (value1 + value2));
    }
}
