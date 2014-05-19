/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package network.handlers;

import com.google.protobuf.InvalidProtocolBufferException;
import com.protocol.GameChatProtocol;
import graphicobjects.frames.MainFrame;


public class CheckLoginHandler extends IncomingMessageHandler {
    private GameChatProtocol.CheckLoginResult packet;
    private String login;

    public CheckLoginHandler(byte [] data) {
        try {
            packet = GameChatProtocol.CheckLoginResult.parseFrom(data);
        } catch (InvalidProtocolBufferException ex) {
          ex.printStackTrace();
        }
    }
    
    @Override
    public void handle() {
        login = packet.getLogin();
        MainFrame.getInstans().showMessageLoginIsUsing(login);
    }
    
}
