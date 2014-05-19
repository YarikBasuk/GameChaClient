package graphicobjects.panel;

import graphicobjects.frames.MainFrame;
import javax.swing.JOptionPane;
import network.Client;

public class RegistrationPanel extends javax.swing.JPanel {

    public RegistrationPanel() {
        initComponents();
    }

    public void clearLoginField(){
        fieldLoginRegist.setText("");      
    }
    
    private boolean emptyRegistrationFieldCheck() {

        if (fieldLoginRegist.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Unknown login");
            return false;
        }

        if (fieldPasswordRegist.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Unknown password");
            return false;
        }

        if (fieldPasswordRegist2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Unknown password copy");
            return false;
        }
        return true;
    }

    private boolean passwordCheck() {
        String password = fieldPasswordRegist.getText();
        String password2 = fieldPasswordRegist2.getText();

        if (password.equals(password2)) {
            return true;
        }
        JOptionPane.showMessageDialog(this, "Passwords do not match");
        return false;
    }

    private boolean checkRegistrationData() {

        if (emptyRegistrationFieldCheck()) {

            if (passwordCheck()) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLoginRegist = new javax.swing.JLabel();
        fieldLoginRegist = new javax.swing.JTextField();
        labelPasswordRegist = new javax.swing.JLabel();
        fieldPasswordRegist = new javax.swing.JPasswordField();
        fieldPasswordRegist2 = new javax.swing.JPasswordField();
        buttonOkRegist = new javax.swing.JButton();

        labelLoginRegist.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        labelLoginRegist.setText("login");

        fieldLoginRegist.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        labelPasswordRegist.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        labelPasswordRegist.setText("password");

        fieldPasswordRegist.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        fieldPasswordRegist2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        buttonOkRegist.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        buttonOkRegist.setText("Ok!");
        buttonOkRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkRegistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonOkRegist))
                    .addComponent(fieldLoginRegist)
                    .addComponent(fieldPasswordRegist)
                    .addComponent(fieldPasswordRegist2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLoginRegist)
                            .addComponent(labelPasswordRegist))
                        .addGap(0, 194, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLoginRegist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldLoginRegist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPasswordRegist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPasswordRegist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPasswordRegist2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonOkRegist)
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkRegistActionPerformed
        if (checkRegistrationData()) {
            String login = fieldLoginRegist.getText();
            String password = fieldPasswordRegist.getText();
            Client.getInctance().sendRegistrationPacket(login, password);          
        }

    }//GEN-LAST:event_buttonOkRegistActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOkRegist;
    private javax.swing.JTextField fieldLoginRegist;
    private javax.swing.JPasswordField fieldPasswordRegist;
    private javax.swing.JPasswordField fieldPasswordRegist2;
    private javax.swing.JLabel labelLoginRegist;
    private javax.swing.JLabel labelPasswordRegist;
    // End of variables declaration//GEN-END:variables
}
