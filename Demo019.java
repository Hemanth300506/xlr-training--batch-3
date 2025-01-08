class NextMultipleOf5 {
    
    public static int getNextMultipleOf5(int num) {
         if (num <= 0)
             return -1;
         return ((num / 5) + 1) * 5;
    }
}

public class Demo019 {
    public static void main(String[] args) {
        NextMultipleOf5 obj = new NextMultipleOf5();
        int num = 47;
        System.out.println(obj.getNextMultipleOf5(num));
    }
    
}