import java.util.Scanner;

public class Demo022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter monthly salary, HRA, and PF: ");
        double monthlySalary = scanner.nextDouble();
        double hra = scanner.nextDouble();
        double pf = scanner.nextDouble();

        double annualSalary = monthlySalary * 12;
        double taxableIncome = annualSalary - (hra + pf);
        
        double tax = taxableIncome <= 500000 ? taxableIncome * 0.10 :
                    taxableIncome <= 1000000 ? (50000 + (taxableIncome - 500000) * 0.20) :
                    (150000 + (taxableIncome - 1000000) * 0.30);

        System.out.println("Annual Income Tax: Rs " + tax);
        scanner.close();
    }
}

