package singlilinkedlist.socialmediafriendconnections;

public class SocialMediaManager {
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();

        // Add users
        socialMedia.addUser(1, "Om Prakash", 25);
        socialMedia.addUser(2, "Deepansh", 30);
        socialMedia.addUser(3, "Kuldeep", 20);

        // Add friend connections
        socialMedia.addFriendConnection(1, 2);
        socialMedia.addFriendConnection(1, 3);

        // Display all users
        socialMedia.displayAllUsers();

        // Display friends for each user
        socialMedia.displayFriends(1); // ABC
        socialMedia.displayFriends(2); // DEF
    }
}
