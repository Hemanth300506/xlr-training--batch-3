import java.util.HashSet;
public class Demo073 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 8, 5, 2, 7, 9, 4};
        HashSet<Integer> set = new HashSet<>();
        
        System.out.println("Duplicate elements in the array are:");
        
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }
}

