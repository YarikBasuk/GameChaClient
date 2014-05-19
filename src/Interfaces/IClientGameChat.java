/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.Vector;

/**
 *
 * @author Yarik
 */
public interface IClientGameChat {
    
    public void sendAuthorzationPacket(String login, String password);
    public void sendRegistrationPacket(String login, String password);
    public void sendMessagePacket(int receiverID, String message);
    public void sendQuickSearchPacket(String partName);
    public void sendAddNewFriendsPacket(Vector<String> friends);
    public void sendDeleteFriendPacket(int friendID);
        
       
    
}
