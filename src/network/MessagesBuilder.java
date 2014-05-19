/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import Interfaces.IUsers;
import com.protocol.GameChatProtocol;
import java.util.Vector;
import newpackage.User;

/**
 *
 * @author Windows
 */
public class MessagesBuilder {
    private IUsers currentUser;
    
    public MessagesBuilder(){
        currentUser =  User.getInstans();
    }
    
   
    
      public GameChatProtocol.Authorization authorzationMessageBuilder(String login, String password) {
        GameChatProtocol.Authorization authorizationMessage = GameChatProtocol.Authorization.newBuilder()
                .setUserLogin(login)
                .setUserPassword(password).build();
       return authorizationMessage;
    }
      
      public GameChatProtocol.Registration registrationMessageBuilder(String login, String password ){
          GameChatProtocol.Registration registrationMessage = GameChatProtocol.Registration.newBuilder()
                .setUserLogin(login)              
                .setUserPassword(password).build();
        return  registrationMessage; 
      }
      
      public GameChatProtocol.UserMessage sendMessageBuilder(int receiverID, String message){
          int senderID = currentUser.getUserID();
          String senderName = currentUser.getUserName();
          
          GameChatProtocol.UserMessage  sendMessage = GameChatProtocol.UserMessage.newBuilder()
                  .setSenderID(senderID)
                  .setSenderName(senderName)
                  .setReceiverID(receiverID)
                  .setMessage(message).build();         
          return sendMessage;
      }
      
      public GameChatProtocol.QuickSearchNames quickSearchNamesBuilder(String partName){
          GameChatProtocol.QuickSearchNames quickSearchNames = GameChatProtocol.QuickSearchNames.newBuilder()
                  .setPartName(partName).build();
          return quickSearchNames;
      }
      
      public GameChatProtocol.AddNewFriends  addNewFriendsMessageBuilder(Vector<String> newFriendNames){
            int userID = currentUser.getUserID();
           GameChatProtocol.AddNewFriends.Builder addNewFriendsBuilder =  GameChatProtocol.AddNewFriends.newBuilder();
            addNewFriendsBuilder.setUserID(userID);
            
            for(String  name: newFriendNames ){
               addNewFriendsBuilder.addFriendsNames(name);
            }
          
          GameChatProtocol.AddNewFriends  addNewFriendsMessage =  addNewFriendsBuilder.build();
          
          return addNewFriendsMessage;
      }
      
      
      public  GameChatProtocol.DeleteFriend deleteFriendMessageBuilder(int friendID){
          int userID = currentUser.getUserID();
          GameChatProtocol.DeleteFriend deteteFriendMessage = GameChatProtocol.DeleteFriend.newBuilder()
                  .setUserID(userID)
                  .setFriendID(friendID).build();
          return deteteFriendMessage; 
      }
    
}
