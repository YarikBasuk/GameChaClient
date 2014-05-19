
package newpackage;


public class UserFriend {
   private int frienrID;
    private String friendName;

    public UserFriend(int friendID, String friendName) {
        this.frienrID = friendID;
        this.friendName = friendName;
    }

    public int getFrienrID(){
        return frienrID;
    }

    public String getFriendName(){
        return friendName;
    }
    
    
}
