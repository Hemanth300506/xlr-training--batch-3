import java.util.Scanner;
public class Main8 {
    String Cust_Name = "Hemanth";
    Long Account_no = 12345678;
    Double Balance = 10000.00;
    void accept_details(){
        System.out.println("Enter Your Name , Account_Number");
        Scanner sc = new Scanner(System.in);
        Cust_Name = sc.nextLine();
        Account_no = sc.nextLong();
    }
    void Display_details(){
        System.out.println("Hello"+Cust_Name);
        System.out.println("ur balance is "+ Balance);
    }
    public static void main(String[] args) {
        Main8 obj  = new Main8();
        obj.accept_details();
        obj.accept_details();
    }
    

    }

    

