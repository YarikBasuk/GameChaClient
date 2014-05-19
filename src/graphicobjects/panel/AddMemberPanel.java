/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicobjects.panel;

import graphicobjects.tools.ListManager;
import java.util.Vector;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import newpackage.User;

/**
 *
 * @author Windows
 */
public class AddMemberPanel extends javax.swing.JPanel {

    private String groupName;
    private Vector<String> membersNamesData;
    private Vector<String> allFriendNamesData;
    private ListManager listManager;

    public AddMemberPanel(String groupName) {
        initComponents();
        this.groupName = groupName;
        membersNamesData = User.getInstans().getListNamesMemberGroup(groupName);
        allFriendNamesData = User.getInstans().getListNamesFriend();
        listManager = new ListManager(membersGroupList, allFriendsList, membersNamesData, allFriendNamesData);
        listManager.clearDuplicateList2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMembersGroup = new javax.swing.JLabel();
        jScrollMembersList = new javax.swing.JScrollPane();
        membersGroupList = new javax.swing.JList();
        jScrollAllFriendList = new javax.swing.JScrollPane();
        allFriendsList = new javax.swing.JList();
        ok = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        addSelectionFriend = new javax.swing.JButton();
        extractSelectionFriend = new javax.swing.JButton();
        addAllFriends = new javax.swing.JButton();
        extractAllFriends = new javax.swing.JButton();
        allFriends = new javax.swing.JLabel();

        labelMembersGroup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelMembersGroup.setText("Members group");

        membersGroupList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollMembersList.setViewportView(membersGroupList);

        allFriendsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollAllFriendList.setViewportView(allFriendsList);

        ok.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        addSelectionFriend.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addSelectionFriend.setText("<");
        addSelectionFriend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSelectionFriendActionPerformed(evt);
            }
        });

        extractSelectionFriend.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        extractSelectionFriend.setText(">");
        extractSelectionFriend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extractSelectionFriendActionPerformed(evt);
            }
        });

        addAllFriends.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addAllFriends.setText("<<");
        addAllFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAllFriendsActionPerformed(evt);
            }
        });

        extractAllFriends.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        extractAllFriends.setText(">>");
        extractAllFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extractAllFriendsActionPerformed(evt);
            }
        });

        allFriends.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        allFriends.setText("All Friends");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMembersGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 79, Short.MAX_VALUE)
                                .addComponent(cancel))
                            .addComponent(jScrollMembersList))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addAllFriends, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                .addComponent(extractAllFriends, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(extractSelectionFriend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(addSelectionFriend, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allFriends)
                    .addComponent(jScrollAllFriendList, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMembersGroup)
                    .addComponent(allFriends))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addSelectionFriend)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(extractSelectionFriend)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addAllFriends)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(extractAllFriends)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollMembersList, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(jScrollAllFriendList))
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ok)
                    .addComponent(cancel))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
    }//GEN-LAST:event_okActionPerformed

    private void extractSelectionFriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extractSelectionFriendActionPerformed
        listManager.moveSelectionDataInList2();
    }//GEN-LAST:event_extractSelectionFriendActionPerformed

    private void extractAllFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extractAllFriendsActionPerformed
        listManager.moveDataInList2();
    }//GEN-LAST:event_extractAllFriendsActionPerformed

    private void addSelectionFriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSelectionFriendActionPerformed
        listManager.moveSelectionDataInList1();
    }//GEN-LAST:event_addSelectionFriendActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void addAllFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAllFriendsActionPerformed
        listManager.moveDataInList1();
    }//GEN-LAST:event_addAllFriendsActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAllFriends;
    private javax.swing.JButton addSelectionFriend;
    private javax.swing.JLabel allFriends;
    private javax.swing.JList allFriendsList;
    private javax.swing.JButton cancel;
    private javax.swing.JButton extractAllFriends;
    private javax.swing.JButton extractSelectionFriend;
    private javax.swing.JScrollPane jScrollAllFriendList;
    private javax.swing.JScrollPane jScrollMembersList;
    private javax.swing.JLabel labelMembersGroup;
    private javax.swing.JList membersGroupList;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables

   
}

