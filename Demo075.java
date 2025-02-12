public class Demo075 {
    public static void main(String[] args) {
        int[] numbers = {3,6,8,7,1,9};
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
        }

        System.out.println("The maximum number is: " + max);
    }
}
