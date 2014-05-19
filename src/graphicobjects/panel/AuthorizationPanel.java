/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicobjects.panel;

import graphicobjects.frames.MainFrame;
import javax.swing.JOptionPane;
import network.Client;

/**
 *
 * @author Windows
 */
public class AuthorizationPanel extends javax.swing.JPanel {

    public AuthorizationPanel() {
        initComponents();
    }

    public boolean authorizationFieldNotEmpty() {

        if (fieldLoginAuthor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Unknown login");
            return false;
        }

        if (fieldPasswordAuthor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Unknown password");
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLoginAuthor = new javax.swing.JLabel();
        fieldLoginAuthor = new javax.swing.JTextField();
        labelPasswordAuthor = new javax.swing.JLabel();
        buttonOkAuthor = new javax.swing.JButton();
        buttonRegistrationAuthor = new javax.swing.JButton();
        fieldPasswordAuthor = new javax.swing.JPasswordField();

        labelLoginAuthor.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        labelLoginAuthor.setText("login");

        fieldLoginAuthor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        labelPasswordAuthor.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        labelPasswordAuthor.setText("password");

        buttonOkAuthor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonOkAuthor.setText("Ok");
        buttonOkAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkAuthorActionPerformed(evt);
            }
        });

        buttonRegistrationAuthor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonRegistrationAuthor.setText("registration");
        buttonRegistrationAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrationAuthorActionPerformed(evt);
            }
        });

        fieldPasswordAuthor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldPasswordAuthor)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonRegistrationAuthor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(buttonOkAuthor))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLoginAuthor)
                            .addComponent(labelPasswordAuthor))
                        .addGap(0, 194, Short.MAX_VALUE))
                    .addComponent(fieldLoginAuthor))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLoginAuthor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldLoginAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPasswordAuthor)
                .addGap(2, 2, 2)
                .addComponent(fieldPasswordAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonOkAuthor)
                    .addComponent(buttonRegistrationAuthor))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrationAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrationAuthorActionPerformed

        MainFrame.getInstans().showRegistrationPanel();
    }//GEN-LAST:event_buttonRegistrationAuthorActionPerformed

    private void buttonOkAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkAuthorActionPerformed
        if (authorizationFieldNotEmpty()) {
            String login = fieldLoginAuthor.getText();
            String password = fieldPasswordAuthor.getText();
            Client.getInctance().sendAuthorzationPacket(login, password);
           
        }
    }//GEN-LAST:event_buttonOkAuthorActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOkAuthor;
    private javax.swing.JButton buttonRegistrationAuthor;
    private javax.swing.JTextField fieldLoginAuthor;
    private javax.swing.JPasswordField fieldPasswordAuthor;
    private javax.swing.JLabel labelLoginAuthor;
    private javax.swing.JLabel labelPasswordAuthor;
    // End of variables declaration//GEN-END:variables
}
