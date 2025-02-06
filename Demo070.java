public class Demo070 {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 10, 13, 15, 17};

        System.out.println("Prime numbers in the array are:");

        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }
}


