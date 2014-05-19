package graphicobjects.panel;

import Interfaces.IUsers;
import graphicobjects.frames.AddFriendDialog;
import graphicobjects.frames.AddMemberDialog;
import graphicobjects.frames.CreateGameDialog;
import graphicobjects.frames.GroupDialog;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import network.Client;
import newpackage.User;
import newpackage.UserFriend;

public class ChatPanel extends javax.swing.JPanel implements ListSelectionListener {
    
    private IUsers currentlyUser;
    private String currentlySelectedGroupName=null;
    private String currentlySelectedFriendName=null;
   

    public ChatPanel() {
        initComponents();
        
        messageDisplayField.setLineWrap(true);
        messageDisplayField.setWrapStyleWord(true);
        messageDisplayField.setEditable(false);
                 
        currentlyUser = User.getInstans();
        labelLoginOption.setText(currentlyUser.getUserName());
        
        listFriend.setListData(currentlyUser.getListNamesFriend());
        listFriend.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listFriend.addListSelectionListener(this);

        listGroup.setListData(currentlyUser.getListNamesGroup());
        listGroup.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);      
        listGroup.addListSelectionListener(this);
        tabbedPaneOption.setBackgroundAt(0, Color.red);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOptionChat = new javax.swing.JPanel();
        labelLoginOption = new javax.swing.JLabel();
        tabbedPaneOption = new javax.swing.JTabbedPane();
        panelFriend = new javax.swing.JPanel();
        comboBoxFriend = new javax.swing.JComboBox();
        scrollPaneFriend = new javax.swing.JScrollPane();
        listFriend = new javax.swing.JList();
        addFriendPanel = new javax.swing.JButton();
        deleteFriend = new javax.swing.JButton();
        panelGroup = new javax.swing.JPanel();
        labelGoup = new javax.swing.JLabel();
        buttonCreateGroup = new javax.swing.JButton();
        buttonDeleteGroup = new javax.swing.JButton();
        labelMembersGroup = new javax.swing.JLabel();
        buttonAddMembersInGroup = new javax.swing.JButton();
        buttonRemoveMembersGroup = new javax.swing.JButton();
        scrollPaneGroup = new javax.swing.JScrollPane();
        listGroup = new javax.swing.JList();
        scrollPaneMembersGroup = new javax.swing.JScrollPane();
        listMembersGroup = new javax.swing.JList();
        panelGame = new javax.swing.JPanel();
        labelActiveGame = new javax.swing.JLabel();
        comboBoxActiveGame = new javax.swing.JComboBox();
        scrollPaneActiveGame = new javax.swing.JScrollPane();
        listActiveGame = new javax.swing.JList();
        buttonCreateGame = new javax.swing.JButton();
        buttonSendChatGame = new javax.swing.JButton();
        scrollPaneDisplayChatGame = new javax.swing.JScrollPane();
        textPaneDisplayChatGame = new javax.swing.JTextPane();
        scrollPaneWriteFieldChatGame = new javax.swing.JScrollPane();
        textPaneWriteFieldChatGame = new javax.swing.JTextPane();
        labelActiveLogin = new javax.swing.JLabel();
        panelDisplay = new javax.swing.JPanel();
        tabbedPaneDisplay = new javax.swing.JTabbedPane();
        panelDisplayChat = new javax.swing.JPanel();
        scrollPaneWriteField = new javax.swing.JScrollPane();
        writeMessageField = new javax.swing.JTextPane();
        sendMessage = new javax.swing.JButton();
        jScrollPaneChatDisplay = new javax.swing.JScrollPane();
        messageDisplayField = new javax.swing.JTextArea();
        panelGameDisplay = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        labelLoginOption.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        labelLoginOption.setText("login: ");

        tabbedPaneOption.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        comboBoxFriend.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboBoxFriend.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All Friend", "Online Friend" }));

        listFriend.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        listFriend.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listFriend.setMinimumSize(new java.awt.Dimension(0, 0));
        scrollPaneFriend.setViewportView(listFriend);

        addFriendPanel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addFriendPanel.setText("Add new friend");
        addFriendPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFriendPanelActionPerformed(evt);
            }
        });

        deleteFriend.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteFriend.setText("Delete friend");
        deleteFriend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFriendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFriendLayout = new javax.swing.GroupLayout(panelFriend);
        panelFriend.setLayout(panelFriendLayout);
        panelFriendLayout.setHorizontalGroup(
            panelFriendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFriendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFriendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneFriend, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(comboBoxFriend, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFriendLayout.createSequentialGroup()
                        .addComponent(deleteFriend)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addFriendPanel)))
                .addContainerGap())
        );
        panelFriendLayout.setVerticalGroup(
            panelFriendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFriendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxFriend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollPaneFriend, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFriendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFriendPanel)
                    .addComponent(deleteFriend))
                .addContainerGap())
        );

        tabbedPaneOption.addTab("Friend", panelFriend);

        panelGroup.setPreferredSize(new java.awt.Dimension(185, 399));

        labelGoup.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        labelGoup.setText("group");

        buttonCreateGroup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonCreateGroup.setText("create group");
        buttonCreateGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateGroupActionPerformed(evt);
            }
        });

        buttonDeleteGroup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonDeleteGroup.setText("delete");

        labelMembersGroup.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        labelMembersGroup.setText("members group");

        buttonAddMembersInGroup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonAddMembersInGroup.setText("add");
        buttonAddMembersInGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddMembersInGroupActionPerformed(evt);
            }
        });

        buttonRemoveMembersGroup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonRemoveMembersGroup.setText("remove");

        listGroup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        listGroup.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollPaneGroup.setViewportView(listGroup);

        listMembersGroup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        scrollPaneMembersGroup.setViewportView(listMembersGroup);

        javax.swing.GroupLayout panelGroupLayout = new javax.swing.GroupLayout(panelGroup);
        panelGroup.setLayout(panelGroupLayout);
        panelGroupLayout.setHorizontalGroup(
            panelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneGroup)
                    .addGroup(panelGroupLayout.createSequentialGroup()
                        .addComponent(buttonRemoveMembersGroup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(buttonAddMembersInGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPaneMembersGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelGroupLayout.createSequentialGroup()
                        .addGroup(panelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonDeleteGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGoup))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelGroupLayout.createSequentialGroup()
                        .addComponent(labelMembersGroup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCreateGroup)))
                .addContainerGap())
        );
        panelGroupLayout.setVerticalGroup(
            panelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGoup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCreateGroup)
                    .addComponent(buttonDeleteGroup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMembersGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneMembersGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAddMembersInGroup)
                    .addComponent(buttonRemoveMembersGroup))
                .addGap(27, 27, 27))
        );

        tabbedPaneOption.addTab("Group", panelGroup);

        labelActiveGame.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        labelActiveGame.setText("active public game");

        comboBoxActiveGame.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboBoxActiveGame.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        listActiveGame.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        listActiveGame.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollPaneActiveGame.setViewportView(listActiveGame);

        buttonCreateGame.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonCreateGame.setText("create");
        buttonCreateGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateGameActionPerformed(evt);
            }
        });

        buttonSendChatGame.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonSendChatGame.setText("send");

        textPaneDisplayChatGame.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        scrollPaneDisplayChatGame.setViewportView(textPaneDisplayChatGame);

        textPaneWriteFieldChatGame.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        scrollPaneWriteFieldChatGame.setViewportView(textPaneWriteFieldChatGame);

        javax.swing.GroupLayout panelGameLayout = new javax.swing.GroupLayout(panelGame);
        panelGame.setLayout(panelGameLayout);
        panelGameLayout.setHorizontalGroup(
            panelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelActiveGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGameLayout.createSequentialGroup()
                        .addGroup(panelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollPaneActiveGame, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGameLayout.createSequentialGroup()
                                .addComponent(comboBoxActiveGame, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addGroup(panelGameLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonSendChatGame)))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGameLayout.createSequentialGroup()
                        .addGroup(panelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollPaneWriteFieldChatGame, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneDisplayChatGame))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCreateGame)
                .addContainerGap())
        );
        panelGameLayout.setVerticalGroup(
            panelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGameLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(comboBoxActiveGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelActiveGame)
                .addGap(3, 3, 3)
                .addComponent(scrollPaneActiveGame, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(buttonCreateGame)
                .addGap(18, 18, 18)
                .addComponent(scrollPaneDisplayChatGame, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneWriteFieldChatGame, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSendChatGame)
                .addContainerGap())
        );

        tabbedPaneOption.addTab("Game", panelGame);

        labelActiveLogin.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        labelActiveLogin.setText(" ");

        javax.swing.GroupLayout panelOptionChatLayout = new javax.swing.GroupLayout(panelOptionChat);
        panelOptionChat.setLayout(panelOptionChatLayout);
        panelOptionChatLayout.setHorizontalGroup(
            panelOptionChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOptionChatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLoginOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelActiveLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabbedPaneOption)
        );
        panelOptionChatLayout.setVerticalGroup(
            panelOptionChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOptionChatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOptionChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLoginOption)
                    .addComponent(labelActiveLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabbedPaneOption))
        );

        add(panelOptionChat, java.awt.BorderLayout.LINE_START);

        tabbedPaneDisplay.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        writeMessageField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        scrollPaneWriteField.setViewportView(writeMessageField);

        sendMessage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sendMessage.setText("send!");
        sendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageActionPerformed(evt);
            }
        });

        messageDisplayField.setColumns(20);
        messageDisplayField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        messageDisplayField.setRows(5);
        jScrollPaneChatDisplay.setViewportView(messageDisplayField);

        javax.swing.GroupLayout panelDisplayChatLayout = new javax.swing.GroupLayout(panelDisplayChat);
        panelDisplayChat.setLayout(panelDisplayChatLayout);
        panelDisplayChatLayout.setHorizontalGroup(
            panelDisplayChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDisplayChatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDisplayChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneWriteField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDisplayChatLayout.createSequentialGroup()
                        .addGap(0, 331, Short.MAX_VALUE)
                        .addComponent(sendMessage))
                    .addComponent(jScrollPaneChatDisplay))
                .addContainerGap())
        );
        panelDisplayChatLayout.setVerticalGroup(
            panelDisplayChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDisplayChatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneChatDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneWriteField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendMessage)
                .addGap(4, 4, 4))
        );

        tabbedPaneDisplay.addTab("Chat", panelDisplayChat);

        panelGameDisplay.setLayout(new java.awt.BorderLayout());
        tabbedPaneDisplay.addTab("Game", panelGameDisplay);

        javax.swing.GroupLayout panelDisplayLayout = new javax.swing.GroupLayout(panelDisplay);
        panelDisplay.setLayout(panelDisplayLayout);
        panelDisplayLayout.setHorizontalGroup(
            panelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDisplayLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tabbedPaneDisplay)
                .addContainerGap())
        );
        panelDisplayLayout.setVerticalGroup(
            panelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDisplayLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tabbedPaneDisplay)
                .addContainerGap())
        );

        add(panelDisplay, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddMembersInGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddMembersInGroupActionPerformed
        if (currentlySelectedGroupName != null) {
            AddMemberDialog addMemberDialog = new AddMemberDialog(currentlySelectedGroupName);
        }
    }//GEN-LAST:event_buttonAddMembersInGroupActionPerformed

    private void buttonCreateGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateGroupActionPerformed
        GroupDialog groupDialog = new GroupDialog();
    }//GEN-LAST:event_buttonCreateGroupActionPerformed

    private void buttonCreateGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateGameActionPerformed
        CreateGameDialog createGameDialog = new CreateGameDialog();
    }//GEN-LAST:event_buttonCreateGameActionPerformed

    private void sendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageActionPerformed
        
        if(currentlySelectedFriendName!=null){
          int receiverID = currentlyUser.getFriendIdByName(currentlySelectedFriendName);
          String message = writeMessageField.getText();
           System.out.println("friend id: "+receiverID);
                              
        String messageBuilder ="\n\n"+User.getInstans().getUserName()+" "+new Date()+"\n"+message; 
         Client.getInctance().sendMessagePacket(receiverID, messageBuilder);
        messageDisplayField.append( messageBuilder);
        writeMessageField.setText("");
       }else{
           JOptionPane.showMessageDialog(this, "Please select the user");  
        }
              
    }//GEN-LAST:event_sendMessageActionPerformed

    private void addFriendPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFriendPanelActionPerformed
      AddFriendDialog   addNewFriendPanel = new AddFriendDialog();       
        System.out.println("add friend");
    }//GEN-LAST:event_addFriendPanelActionPerformed

    private void deleteFriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFriendActionPerformed
         if(currentlySelectedFriendName!=null){
          int friendID = currentlyUser.getFriendIdByName(currentlySelectedFriendName);
          Client.getInctance().sendDeleteFriendPacket(friendID);
         }
    }//GEN-LAST:event_deleteFriendActionPerformed

   
      public void displyeMessage(String message){
         messageDisplayField.append(message);
    
     }
     
     public void updateFriendsList(){
        Vector<String> newFriendList = currentlyUser.getListNamesFriend();
        listFriend.setListData(newFriendList);
     }
     
      private  String clienStatus(String name) {
        int endNameIndex = name.indexOf("(");
        if (endNameIndex > 0) {
            String cleanName = name.substring(0, endNameIndex);
             return cleanName;
        }
        return name;
    }
    
     @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getSource().equals(listGroup)) {
            if (e.getValueIsAdjusting()) {
                currentlySelectedGroupName = (String) listGroup.getSelectedValue();
                Vector<String> listNamesMemberGroup = User.getInstans().getListNamesMemberGroup((String) listGroup.getSelectedValue());
                listMembersGroup.setListData(listNamesMemberGroup);
            }
        }


        if (e.getSource().equals(listFriend)) {
            if (e.getValueIsAdjusting()) {
                currentlySelectedFriendName = (String) listFriend.getSelectedValue();                      
            }
        }


    }
     
     
   
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFriendPanel;
    private javax.swing.JButton buttonAddMembersInGroup;
    private javax.swing.JButton buttonCreateGame;
    private javax.swing.JButton buttonCreateGroup;
    private javax.swing.JButton buttonDeleteGroup;
    private javax.swing.JButton buttonRemoveMembersGroup;
    private javax.swing.JButton buttonSendChatGame;
    private javax.swing.JComboBox comboBoxActiveGame;
    private javax.swing.JComboBox comboBoxFriend;
    private javax.swing.JButton deleteFriend;
    private javax.swing.JScrollPane jScrollPaneChatDisplay;
    private javax.swing.JLabel labelActiveGame;
    private javax.swing.JLabel labelActiveLogin;
    private javax.swing.JLabel labelGoup;
    private javax.swing.JLabel labelLoginOption;
    private javax.swing.JLabel labelMembersGroup;
    private javax.swing.JList listActiveGame;
    private javax.swing.JList listFriend;
    private javax.swing.JList listGroup;
    private javax.swing.JList listMembersGroup;
    private javax.swing.JTextArea messageDisplayField;
    private javax.swing.JPanel panelDisplay;
    private javax.swing.JPanel panelDisplayChat;
    private javax.swing.JPanel panelFriend;
    private javax.swing.JPanel panelGame;
    private javax.swing.JPanel panelGameDisplay;
    private javax.swing.JPanel panelGroup;
    private javax.swing.JPanel panelOptionChat;
    private javax.swing.JScrollPane scrollPaneActiveGame;
    private javax.swing.JScrollPane scrollPaneDisplayChatGame;
    private javax.swing.JScrollPane scrollPaneFriend;
    private javax.swing.JScrollPane scrollPaneGroup;
    private javax.swing.JScrollPane scrollPaneMembersGroup;
    private javax.swing.JScrollPane scrollPaneWriteField;
    private javax.swing.JScrollPane scrollPaneWriteFieldChatGame;
    private javax.swing.JButton sendMessage;
    private javax.swing.JTabbedPane tabbedPaneDisplay;
    private javax.swing.JTabbedPane tabbedPaneOption;
    private javax.swing.JTextPane textPaneDisplayChatGame;
    private javax.swing.JTextPane textPaneWriteFieldChatGame;
    private javax.swing.JTextPane writeMessageField;
    // End of variables declaration//GEN-END:variables

   
}
