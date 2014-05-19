/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package network.handlers;

import com.google.protobuf.InvalidProtocolBufferException;
import com.protocol.GameChatProtocol;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import newpackage.User;
import newpackage.UserFriend;

/**
 *
 * @author Windows
 */
public class UpdateFriendListHandler extends IncomingMessageHandler {
   private GameChatProtocol.UpdateFriendsList packet;
   
   public  UpdateFriendListHandler(byte[] data){
       try {
           packet = GameChatProtocol.UpdateFriendsList.parseFrom(data);
       } catch (InvalidProtocolBufferException ex) {
         ex.printStackTrace();
       }
   }
   
    @Override
    public void handle() {
         
     List<GameChatProtocol.UserFriend>  newFriendListProto =  packet.getNewFriendsListList();
     List<UserFriend> newFriendList = new ArrayList<UserFriend>();
     
     for(GameChatProtocol.UserFriend protoFriend: newFriendListProto){
         int friendID = protoFriend.getFriendID();
         String friendName = protoFriend.getFriendName();
         UserFriend newFriend = new UserFriend(friendID,friendName);
         newFriendList.add(newFriend);
     }
     
     User.getInstans().setUserFriendsList(newFriendList);
     
    }
    
}
