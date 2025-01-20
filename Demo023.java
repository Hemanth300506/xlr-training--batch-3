import java.util.ArrayList;

public class Demo023 {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("praneeth");
        friends.add("kowshik");
        friends.add("karthik");
        friends.add("sai");
        friends.add("rohit");
        friends.add("charan");
        friends.add("rahul");
        friends.add("naresh");
        friends.add("harish");
        friends.add("rishi");

        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}


