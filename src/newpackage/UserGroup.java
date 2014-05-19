
package newpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class UserGroup {
    private int groupID;
    private String groupName;
    private List<UserFriend> membersGroupList;

    public UserGroup(int groupID, String groupName) {
        this.groupID = groupID;
        this.groupName = groupName;
        membersGroupList = new ArrayList<UserFriend>();
    }

    public int getGroupID(){
        return groupID;
    }

    public String getNameGroup(){
        return groupName;
    }

    public void setMembersGroupList(List<UserFriend> membersGroupList){
          this.membersGroupList = membersGroupList;
    }

    public  List<UserFriend> getMembersGroupList(){
        return membersGroupList;
    }
    
    public  Vector<String> getListNameMembersGroup(){
        Vector<String> ListNameMembersGroup = new Vector<String>();
        
        for(UserFriend member:membersGroupList ){
          ListNameMembersGroup.add(member.getFriendName());
        }
       return  ListNameMembersGroup;
    }
}
