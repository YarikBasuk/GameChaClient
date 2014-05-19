package graphicobjects.panel;

import graphicobjects.frames.AddFriendDialog;
import graphicobjects.tools.ListManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import network.Client;

public class AddNewFriendPanel extends javax.swing.JPanel {

    private boolean quickSearchIsRun = true;
    private Vector<String> dataList1;
    private Vector<String> dataList2;
    private ListManager listManager;
    private AddFriendDialog addFriendDialog;
   

    public AddNewFriendPanel(AddFriendDialog addFriendDialog) {
        initComponents(); 
         
        this.addFriendDialog = addFriendDialog;
        listManager = new ListManager(foundNamesList,addNamesList);
        dataList2 = new Vector<String>();
         listManager.setData2(dataList2);
          updateFoundNamesList.start();
    }
    
    
    Thread updateFoundNamesList = new Thread(new Runnable() {
        public void run() {
            List<String> sendPartNameList = new ArrayList<String>();
            String partName = searheNameField.getText();         
            Client.getInctance().sendQuickSearchPacket(partName);
            sendPartNameList.add(partName);
            
            while (quickSearchIsRun) {
                System.out.println("quickSearchIsRun :"+quickSearchIsRun);
                partName = searheNameField.getText();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                   ex.printStackTrace();
                   quickSearchIsRun = false;
                }
                if ( !sendPartNameList.get(0).equals(partName)  ) {
                    
                    Client.getInctance().sendQuickSearchPacket(partName);
                    sendPartNameList.clear();
                    sendPartNameList.add(partName);                    
                } 
            }
        }
    });

    public void showFoundFriendsList(Vector<String> dataList1){
       listManager.setData1(dataList1);
       listManager.clearDuplicateList1();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        searheNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        foundNamesList = new javax.swing.JList();
        addSelectedFriends = new javax.swing.JButton();
        extractSelectedFriends = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        addNamesList = new javax.swing.JList();
        addFriends = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Friend name");

        searheNameField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        foundNamesList.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(foundNamesList);

        addSelectedFriends.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addSelectedFriends.setText(">");
        addSelectedFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSelectedFriendsActionPerformed(evt);
            }
        });

        extractSelectedFriends.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        extractSelectedFriends.setText("<");
        extractSelectedFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extractSelectedFriendsActionPerformed(evt);
            }
        });

        addNamesList.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(addNamesList);

        addFriends.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addFriends.setText("add friends");
        addFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFriendsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searheNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(extractSelectedFriends)
                            .addComponent(addSelectedFriends))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addFriends)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searheNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addSelectedFriends)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(extractSelectedFriends)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addFriends)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addSelectedFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSelectedFriendsActionPerformed
         listManager.moveSelectionDataInList2();
    }//GEN-LAST:event_addSelectedFriendsActionPerformed

    private void extractSelectedFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extractSelectedFriendsActionPerformed
        listManager.moveSelectionDataInList1();
    }//GEN-LAST:event_extractSelectedFriendsActionPerformed

    private void addFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFriendsActionPerformed
      if(dataList2.size() > 0){
        Client.getInctance().sendAddNewFriendsPacket(dataList2);            
      }
      closeAndStopScan();
    }//GEN-LAST:event_addFriendsActionPerformed
 
    public void closeAndStopScan(){
    quickSearchIsRun = false;
     addFriendDialog.dispose(); 
  }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFriends;
    private javax.swing.JList addNamesList;
    private javax.swing.JButton addSelectedFriends;
    private javax.swing.JButton extractSelectedFriends;
    private javax.swing.JList foundNamesList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searheNameField;
    // End of variables declaration//GEN-END:variables
}
