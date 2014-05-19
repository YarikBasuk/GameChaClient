/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicobjects.frames;

import graphicobjects.panel.AddNewFriendPanel;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;
import newpackage.User;

/**
 *
 * @author Windows
 */
public class AddFriendDialog extends JDialog {
    private AddNewFriendPanel addNewFriendPanel;
    
     public AddFriendDialog(){  
        addNewFriendPanel = new AddNewFriendPanel(this);       
        add(addNewFriendPanel);     
        User.getInstans().setAddNewFriendPanel(addNewFriendPanel);
        setSize(500,400);
        setLocation(600,210);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                addNewFriendPanel.closeAndStopScan();
                
            }
        });
    }
     
}
