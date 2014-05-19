/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import graphicobjects.panel.AddNewFriendPanel;
import graphicobjects.panel.ChatPanel;
import java.util.List;
import java.util.Vector;
import newpackage.UserFriend;
import newpackage.UserGroup;

/**
 *
 * @author Windows
 */
public interface IUsers {

    public int getUserID();

    public void setUserID(int userID);

    public String getUserName();

    public void setUserName(String userName);

    
    public List<UserFriend> getUserFriendsList();

    public void setUserFriendsList(List<UserFriend> userFriendsList);

    
    public List<UserGroup> getUserGroupsList();

    public void setUserGroupsList(List<UserGroup> userGroupsList);
    
    public Vector <String> getListNamesFriend();  
    
    public Vector <String> getListNamesGroup();
    
    public Vector <String> getListNamesMemberGroup(String nameGroup); 
    
    public int getFriendIdByName(String name);
    
    public void printData();
    
    public void setChatPanel(ChatPanel chatPanel);
    
    public ChatPanel getChatPanel();
    
     public void setAddNewFriendPanel(AddNewFriendPanel addNewFriendPanel);
     
     public void setQouickSearheFriendList( Vector<String> qouickSearheFriendList);
    
   
}
