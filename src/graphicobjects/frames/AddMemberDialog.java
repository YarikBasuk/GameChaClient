

package graphicobjects.frames;

import graphicobjects.panel.AddMemberPanel;
import graphicobjects.panel.CreatGroupPanel;
import javax.swing.JDialog;


public class AddMemberDialog extends JDialog {
    
    
    public AddMemberDialog(String groupName){
        add(new AddMemberPanel(groupName));
        setSize(500,400);
        setLocation(600,210);
        setVisible(true);
    }
    
}
