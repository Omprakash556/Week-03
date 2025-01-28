package singlilinkedlist.socialmediafriendconnections;

public class SocialMedia {
    User head;

    public SocialMedia(){
        head = null;
    }

    // Add a user to the list
    public void addUser(int userID, String name, int age) {
        User newUser = new User(userID, name, age);
        if (head == null) {
            head = newUser;
            return;
        } else {
            User current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newUser;
        }
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);
        if (user1 != null && user2 != null) {
            if (!user1.friendIDs.contains(userID2)) {
                user1.friendIDs.add(userID2);
            }
            if (!user2.friendIDs.contains(userID1)){
                user2.friendIDs.add(userID1);
            }
        }
    }

    // Display all friends of a specific user in the desired format
    public void displayFriends(int userID) {
        User user = findUserByID(userID);
        if (user != null) {
            System.out.print(user.name + "'s friends: ");
            for (int friendID : user.friendIDs) {
                User friend = findUserByID(friendID);
                if (friend != null) {
                    System.out.print(friend.userID + " ");
                }
            }
            System.out.println();
        }
    }

    // Display all users in the desired format
    public void displayAllUsers() {
        User current = head;
        while (current != null) {
            System.out.println("User ID: " + current.userID + " Name: " + current.name);
            current = current.next;
        }
    }

    // Helper method: Find user by ID
    private User findUserByID(int userID) {
        User current = head;
        while (current != null) {
            if (current.userID == userID) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
