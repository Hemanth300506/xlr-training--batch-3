import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        String correctId = "user123";
        String correctPassword = "password456";
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        if (id.equals(correctId) && password.equals(correctPassword)) {
            System.out.println("Happy New Year!");
        } else {
            System.out.println("Invalid ID or password.");
        }
    
        scanner.close();
    }
}
