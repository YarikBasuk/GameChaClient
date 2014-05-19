/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package network.handlers;

import com.google.protobuf.InvalidProtocolBufferException;
import com.protocol.GameChatProtocol;
import graphicobjects.frames.MainFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class UserNotFoundHandler extends IncomingMessageHandler {
    private GameChatProtocol.UserNotFound packet;
    private String login;
    
    public UserNotFoundHandler(byte [] data){
        try {
            packet =  GameChatProtocol.UserNotFound.parseFrom(data);
        } catch (InvalidProtocolBufferException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void handle() {
      login =  packet.getLogin();
       MainFrame.getInstans().showMessagesUserNotFound(login);
        
    }
    
}
