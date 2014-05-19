/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package network.handlers;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.protocol.GameChatProtocol;
import graphicobjects.frames.MainFrame;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows
 */
public class InputMessageHandler extends IncomingMessageHandler {
    
    public  GameChatProtocol.UserMessage packet;
    
    public InputMessageHandler(byte [] data){
        try {
            packet = GameChatProtocol.UserMessage.parseFrom(data);
        } catch (InvalidProtocolBufferException ex) {
           ex.printStackTrace();
        }
    }

    @Override
    public void handle() {
        
        System.out.println(packet.toString());
        MainFrame.getInstans().showInputMessage(packet.getMessage());
        
    }
    
}
