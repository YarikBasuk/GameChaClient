package graphicobjects.frames;

import Interfaces.IGameChatFrame;
import graphicobjects.panel.AuthorizationPanel;
import graphicobjects.panel.RegistrationPanel;
import graphicobjects.panel.ChatPanel;

import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import newpackage.User;

public class MainFrame extends JFrame implements Runnable, IGameChatFrame {

    private static IGameChatFrame mainFrame = new MainFrame();
    private Thread mainFrameThread;
    private String currentPanel;
    
    private AuthorizationPanel authorizationPanel;
    private RegistrationPanel registrationPanel;
    private ChatPanel chatPanel;

    private MainFrame() {
        mainFrameThread = new Thread(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        mainFrameThread.start();
    }

    
    
    @Override
    public void run() {
        showAuthorizationPanel();
    }

    
    
    public static IGameChatFrame getInstans() {
        return mainFrame;
    }

    
    
    
    @Override
    public void showRegistrationPanel() {
        remove(authorizationPanel);
        repaint();
        registrationPanel = new RegistrationPanel();
        add(registrationPanel);
        repaint();
        setSize(212, 230);
         currentPanel = "RegistrationPanel";
    }

   
 
    
    @Override
    public void showChatPanel() {     
      if(currentPanel.equals("AuthorizationPanel")){
          remove(authorizationPanel);
      }else{
          remove(registrationPanel);
      }
        chatPanel = new ChatPanel();
        User.getInstans().setChatPanel(chatPanel);
        add(chatPanel);
        setResizable(true);
        setLocation(300, 100);
        setSize(800, 600);
        repaint();
    }

  

    @Override
    public void showAuthorizationPanel() {
        authorizationPanel = new AuthorizationPanel();
        add(authorizationPanel);
        setSize(212, 200);
        setLocation(600, 210);
        setVisible(true);
        setResizable(false);
       currentPanel = "AuthorizationPanel";
    }

    @Override
    public void showMessageLoginIsUsing(String login) {
        JOptionPane.showMessageDialog(this, "Login "+login+" is using please enter another login");
        registrationPanel.clearLoginField();
    }

    @Override
    public void showMessagesUserNotFound(String login) {
        JOptionPane.showMessageDialog(this, "User "+login+" is not found please check you password"); 
    }

    @Override
    public void showInputMessage(String message) {
        chatPanel.displyeMessage(message);
    }

   
}
