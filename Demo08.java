import java.util.Scanner;
public class Demo08 {
    String Cust_Name = "Hemanth";
    long Account_No = 12345678;
    Double Balance = 10000.00;
    void accept_details(){
        System.out.println("Enter Your Name , Account_Number");
        Scanner sc = new Scanner(System.in);
        Cust_Name = sc.nextLine();
        Account_No = sc.nextLong();
    }
    void Display_details(){
        System.out.println("Hello"+Cust_Name);
        System.out.println("ur balance is "+ Balance);
    }
    public static void main(String[] args) {
        Demo08 obj  = new Demo08();
        obj.accept_details();
        obj.accept_details();
    }
    

    }

    

