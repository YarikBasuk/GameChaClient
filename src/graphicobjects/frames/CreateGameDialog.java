/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicobjects.frames;

import graphicobjects.panel.CreatGroupPanel;
import graphicobjects.panel.CreateGamePanel;
import javax.swing.JDialog;

/**
 *
 * @author Windows
 */
public class CreateGameDialog extends JDialog {
    
    public  CreateGameDialog(){
        add(new CreateGamePanel());
        setSize(300,250);
        setLocation(600,210);
        setResizable(false);
        setVisible(true);
    }
    
}
