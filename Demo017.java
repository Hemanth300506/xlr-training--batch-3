import java.util.Scanner;

public class Demo017  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first digit: ");
        int digit1 = scanner.nextInt();

        System.out.print("Enter the second digit: ");
        int digit2 = scanner.nextInt();

        int sum = digit1 + digit2;

        System.out.println("The sum of " + digit1 + " and " + digit2 + " is: " + sum);
    }
}

