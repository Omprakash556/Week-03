package singlilinkedlist.socialmediafriendconnections;
import java.util.ArrayList;

class User {
    int userID;
    String name;
    int age;
    ArrayList<Integer> friendIDs; // List of friend IDs
    User next;

    // Constructor
    public User(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friendIDs = new ArrayList<>();
        this.next = null;
    }
}
