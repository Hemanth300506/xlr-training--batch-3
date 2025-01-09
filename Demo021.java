public class Demo021 {
    public static void main(String[] args) {
        System.out.println(getFizzBizz(15));
        System.out.println(getFizzBizz(9));
        System.out.println(getFizzBizz(10));
        System.out.println(getFizzBizz(7));
    }
    
    public static String getFizzBizz(int inputNum) {
        if (inputNum % 3 == 0 && inputNum % 5 == 0) {
            return "FIZZBIZZ";
        } else if (inputNum % 3 == 0) {
            return "FIZZ";
        } else if (inputNum % 5 == 0) {
            return "BIZZ";
        } else {
            return String.valueOf(inputNum);
        }
    }
}
