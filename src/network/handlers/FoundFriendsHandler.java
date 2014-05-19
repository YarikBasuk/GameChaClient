
package network.handlers;

import com.google.protobuf.InvalidProtocolBufferException;
import com.protocol.GameChatProtocol;
import graphicobjects.panel.AddNewFriendPanel;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import newpackage.User;


public class FoundFriendsHandler  extends IncomingMessageHandler {
    private GameChatProtocol.FoundFriends packet;
    
    public  FoundFriendsHandler(byte[] data) {
        try {
            packet = GameChatProtocol.FoundFriends.parseFrom(data);
        } catch (InvalidProtocolBufferException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void handle() {
        
          List<String> foundFriendList = packet.getFoundFriendsList(); 
          Vector<String> friendNamesList = new Vector<String>();
          for(String friendName:foundFriendList){
             friendNamesList.add(friendName);
          }
          User.getInstans().setQouickSearheFriendList(friendNamesList);
       
               
    }
    
  
    
}
