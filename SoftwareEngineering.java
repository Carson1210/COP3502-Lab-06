import java.util.Scanner;

public class SoftwareEngineering {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Addition\n2. Subtraction\nPick and option:");
        int menuOption = scanner.nextInt();

        System.out.print("First number: ");
        int value1 = scanner.nextInt();
        System.out.print("Second number: ");
        int value2 = scanner.nextInt();

        if (menuOption == 1)
            System.out.print("Sum: " + (value1 + value2));
        else if (menuOption == 2)
            System.out.print("Difference: " + (value1 - value2));
    }
}
