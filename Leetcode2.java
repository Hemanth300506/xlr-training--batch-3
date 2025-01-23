class Leetcode2 {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && x % 10 > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && x % 10 < -8)) {
                return 0;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Leetcode2 solution = new Leetcode2();

        int input = 123;
        int result = solution.reverse(input);
        System.out.println("Reversed number: " + result);

        input = -123;
        result = solution.reverse(input);
        System.out.println("Reversed number: " + result);
        
        input = 120;
        result = solution.reverse(input);
        System.out.println("Reversed number: " + result);
    }
}
