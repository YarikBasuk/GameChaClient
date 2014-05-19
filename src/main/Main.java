/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Interfaces.IUsers;
import graphicobjects.frames.MainFrame;
import java.util.ArrayList;
import java.util.List;
import newpackage.User;
import newpackage.UserFriend;
import newpackage.UserGroup;

/**
 *
 * @author Windows
 */
public class Main {

    public static void main(String args[]) {

        //  IUsers user=User.getInstans();

        //   setDataInUser();
        //    user.printData();
           MainFrame.getInstans();

        
    }

    public static String clienStatus(String name) {
        int endNameIndex = name.indexOf("(");
        if (endNameIndex > 0) {
            String cleanName = name.substring(0, endNameIndex);
             return cleanName;
        }
        return name;
    }

    public static void setDataInUser() {
        IUsers users = User.getInstans();
        users.setUserID(1256);
        users.setUserName("Yarik");


        UserFriend friend1 = new UserFriend(1, "friend_1");
        UserFriend friend2 = new UserFriend(2, "friend_2");
        UserFriend friend3 = new UserFriend(3, "friend_3");
        UserFriend friend4 = new UserFriend(4, "friend_4");
        UserFriend friend5 = new UserFriend(5, "friend_5");
        UserFriend friend6 = new UserFriend(6, "friend_6");
        UserFriend friend7 = new UserFriend(7, "friend_7");
        UserFriend friend8 = new UserFriend(8, "friend_8");
        UserFriend friend9 = new UserFriend(9, "friend_9");
        UserFriend friend10 = new UserFriend(10, "friend_10");

        List<UserFriend> userListFriend = new ArrayList<UserFriend>();
        userListFriend.add(friend1);
        userListFriend.add(friend2);
        userListFriend.add(friend3);
        userListFriend.add(friend4);
        userListFriend.add(friend5);
        userListFriend.add(friend6);
        userListFriend.add(friend7);
        userListFriend.add(friend8);
        userListFriend.add(friend9);
        userListFriend.add(friend10);


        users.setUserFriendsList(userListFriend);


        UserGroup group1 = new UserGroup(156, "group1");
        List<UserFriend> group1MemberList = new ArrayList<UserFriend>();
        group1MemberList.add(friend1);
        group1.setMembersGroupList(group1MemberList);

        UserGroup group2 = new UserGroup(189, "group2");
        List<UserFriend> group2MemberList = new ArrayList<UserFriend>();
        group2MemberList.add(friend1);
        group2MemberList.add(friend2);
        group2.setMembersGroupList(group2MemberList);

        UserGroup group3 = new UserGroup(65, "group3");
        List<UserFriend> group3MemberList = new ArrayList<UserFriend>();
        group3MemberList.add(friend1);
        group3MemberList.add(friend2);
        group3MemberList.add(friend3);
        group3.setMembersGroupList(group3MemberList);

        List<UserGroup> userGroupList = new ArrayList<UserGroup>();
        userGroupList.add(group1);
        userGroupList.add(group2);
        userGroupList.add(group3);


        users.setUserGroupsList(userGroupList);


    }
}
