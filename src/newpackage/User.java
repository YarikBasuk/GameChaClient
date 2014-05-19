package newpackage;

import Interfaces.IUsers;
import graphicobjects.panel.AddNewFriendPanel;
import graphicobjects.panel.ChatPanel;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Vector;

public class User implements IUsers {

    private static IUsers user = new User();
    private int userID;
    private String userName;
    private List<UserFriend> userFriendsList;
    private List<UserGroup> userGroupsList;
    private ChatPanel chatPanel =null;
    private AddNewFriendPanel addNewFriendPanel = null;
    private Vector<String> quickSearchFriengsResult;

   

    public static IUsers getInstans() {
        return user;
    }

    private User() {
        
    }
    
    @Override
   public void setQouickSearheFriendList( Vector<String> qouickSearheFriendList){
        this.quickSearchFriengsResult = qouickSearheFriendList;
        if(addNewFriendPanel != null){
              quickSearchFriengsResult.removeAll(getListNamesFriend());
              quickSearchFriengsResult.remove(getUserName());
            addNewFriendPanel.showFoundFriendsList(this.quickSearchFriengsResult);
        }
    }

     @Override
    public void setChatPanel(ChatPanel chatPanel) {
        this.chatPanel = chatPanel;
    }
    

    @Override
    public ChatPanel getChatPanel() {
        return chatPanel;
    }
    
    
      @Override
    public void setAddNewFriendPanel(AddNewFriendPanel addNewFriendPanel) {
       this.addNewFriendPanel = addNewFriendPanel;
    }
    
    @Override
    public int getUserID() {
        return userID;
    }

    @Override
    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void setUserFriendsList(List<UserFriend> userFriendsList) {
        this.userFriendsList = userFriendsList;
        if(chatPanel != null){
         chatPanel.updateFriendsList();
        }
    }

    @Override
    public List<UserFriend> getUserFriendsList() {
        return userFriendsList;
    }

    @Override
    public void setUserGroupsList(List<UserGroup> userGroupsList) {
        this.userGroupsList = userGroupsList;
    }

    @Override
    public List<UserGroup> getUserGroupsList() {
        return userGroupsList;
    }

    @Override
    public Vector<String> getListNamesFriend() {
        Vector<String> listUserFriendName = new Vector<String>();

        for (UserFriend friend : userFriendsList) {
            listUserFriendName.add(friend.getFriendName());
        }
        return listUserFriendName;
    }

    @Override
    public Vector<String> getListNamesGroup() {
        Vector<String> listUserGroupName = new Vector<String>();

        for (UserGroup group : userGroupsList) {
            listUserGroupName.add(group.getNameGroup());
        }
        return listUserGroupName;
    }

    @Override
    public Vector<String> getListNamesMemberGroup(String nameGroup) {
        Vector<String> listMemeberNameGroup = null;

        for (UserGroup group : userGroupsList) {
            if (nameGroup.equals(group.getNameGroup())) {
                listMemeberNameGroup = group.getListNameMembersGroup();
            }
        }
        return listMemeberNameGroup;
    }

    public void printData() {
        System.out.println("UserID: " + userID);
        System.out.println("UserName: " + userName);
        System.out.println();
        System.out.println("USER FRIENDS");
        for (int i = 0; i < userFriendsList.size(); i++) {
            System.out.println(userFriendsList.get(i).getFriendName());
        }

        System.out.println();
        for (int i = 0; i < userGroupsList.size(); i++) {
            System.out.println("GROUP NAME: " + userGroupsList.get(i).getNameGroup());
            for (int j = 0; j < userGroupsList.get(i).getMembersGroupList().size(); j++) {
                System.out.println(userGroupsList.get(i).getMembersGroupList().get(j).getFriendName());
            }
            System.out.println();
        }
    }

    @Override
    public int getFriendIdByName(String name) {
       int friendID = -1;
       for(UserFriend friend : userFriendsList){
           if(friend.getFriendName().equals(name)){
               return friend.getFrienrID();
           }
       }
       
       return friendID; 
    }

  
}
