import java.util.Scanner;
public class Test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hii, welcome");
        System.out.print("Reply yes or no: ");
        String n=sc.nextLine();
        while (n.equals("yes")){
            System.out.println("Happy Sankranti");
            System.out.print("Reply yes or no: ");
            n=sc.nextLine();
        }
    }
}