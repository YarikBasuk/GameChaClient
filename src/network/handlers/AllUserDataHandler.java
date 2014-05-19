/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package network.handlers;

import Interfaces.IUsers;
import com.google.protobuf.InvalidProtocolBufferException;
import com.protocol.GameChatProtocol;
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
public class AllUserDataHandler extends IncomingMessageHandler {
    private GameChatProtocol.AllUserData packet;
    
    public AllUserDataHandler(byte data[]) {
        try {
            packet =  GameChatProtocol.AllUserData.parseFrom(data);
        } catch (InvalidProtocolBufferException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void handle() {
         IUsers currentUser = User.getInstans();
        currentUser.setUserID(packet.getUserID());
        currentUser.setUserName(packet.getUserLogin());
        currentUser.setUserFriendsList(extractUserFriendList(packet));
        currentUser.setUserGroupsList(extractUserGroupList(packet));
         MainFrame.getInstans().showChatPanel();
        currentUser.printData();
    }
    
    
      private List<UserFriend> extractUserFriendList(GameChatProtocol.AllUserData userChatDataMessage) {

        List<UserFriend> userFriendList = new ArrayList<UserFriend>();
        List<GameChatProtocol.UserFriend> protoFriendList = userChatDataMessage.getAllUserFriendsList();

        for (int i = 0; i < protoFriendList.size(); i++) {
            int currentFriendID = protoFriendList.get(i).getFriendID();
            String currentFriendName = protoFriendList.get(i).getFriendName();

            UserFriend currentUserFriend = new UserFriend(currentFriendID, currentFriendName);
            userFriendList.add(currentUserFriend);
        }
        return userFriendList;
    }

    
    
    private List<UserGroup> extractUserGroupList(GameChatProtocol.AllUserData userChatDataMessage) {

        List<UserGroup> userGroupList = new ArrayList<UserGroup>();
        List<GameChatProtocol.UserGroup> protoGroupList = userChatDataMessage.getAllUserGroupList();

        for (int i = 0; i < protoGroupList.size(); i++) {
           
            int currentUserGruopID = protoGroupList.get(i).getGroupID();
            String currentUserGruopName = protoGroupList.get(i).getGroupName();
            
            UserGroup currentUserGruop = new UserGroup(currentUserGruopID, currentUserGruopName);

            List<GameChatProtocol.UserFriend> protoGroupMemberList = protoGroupList.get(i).getMembersGroupList();
            List<UserFriend> currentGroupMemberList = new ArrayList<UserFriend>();
            
            for (int j = 0; j < protoGroupMemberList.size(); j++) {
                int currentGroupMemberID = protoGroupMemberList.get(j).getFriendID();
                String currentGroupMemberName = protoGroupMemberList.get(j).getFriendName();
                UserFriend GroupMember = new UserFriend(currentGroupMemberID, currentGroupMemberName);
                currentGroupMemberList.add(GroupMember);
            }

            currentUserGruop.setMembersGroupList(currentGroupMemberList);
            userGroupList.add(currentUserGruop);
        }

        return userGroupList;
    }
    
    
}
