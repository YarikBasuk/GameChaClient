/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.Vector;

/**
 *
 * @author Windows
 */
public interface IGameChatFrame {

    void showRegistrationPanel();

    void showAuthorizationPanel();

    void showChatPanel();
    
    void showMessageLoginIsUsing(String lonin);
    void showMessagesUserNotFound(String login);
    
    void showInputMessage(String message);
   
}
