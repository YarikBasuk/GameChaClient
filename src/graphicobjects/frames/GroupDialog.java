/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicobjects.frames;

import graphicobjects.panel.CreatGroupPanel;
import javax.swing.JDialog;

/**
 *
 * @author Windows
 */
public class GroupDialog extends JDialog {
    
    public GroupDialog(){     
        add(new CreatGroupPanel());
        setSize(500,400);
        setLocation(600,210);
        setVisible(true);
    }
}
