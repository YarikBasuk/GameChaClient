package network;

import Interfaces.IClientGameChat;
import com.google.protobuf.AbstractMessage;
import com.protocol.GameChatProtocol;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Vector;

public class Client extends Thread implements IClientGameChat {

    private static IClientGameChat client;
    private Socket connection;
    private DataOutputStream outData;
    private DataInputStream inputData;
    private MessagesBuilder messagesBuilder;

    public static IClientGameChat getInctance() {
        if (client == null) {
            client = new Client();
        }
        return client;
    }

    private Client() {
        messagesBuilder = new MessagesBuilder();
        connection();
        start();
    }

    private void connection() {
        try {
            connection = new Socket(NetworkConfig.SERVER_IP_ADDRESS, NetworkConfig.SERVER_PORT);
            OutputStream out = connection.getOutputStream();
            InputStream input = connection.getInputStream();

            outData = new DataOutputStream(out);
            inputData = new DataInputStream(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            while (true) {

                byte b = inputData.readByte();
                int size = inputData.readInt();
                byte[] data = new byte[size];
                inputData.read(data);
                ProtoFactories.createHandler(MessageTyp.getTypeByByte(b), data).handle();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendPackage(AbstractMessage message) {

        try {
            byte code = MessageTyp.getByteByClass(message.getClass());

            outData.writeByte(code);
            byte data[] = message.toByteArray();
            outData.writeInt(data.length);
            outData.write(data);
            outData.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sendAuthorzationPacket(String login, String password) {
     GameChatProtocol.Authorization authorizationMessag = messagesBuilder.authorzationMessageBuilder(login, password);
        sendPackage(authorizationMessag);
    }

    @Override
    public void sendRegistrationPacket(String login, String password) {
        GameChatProtocol.Registration registrationMessage = messagesBuilder.registrationMessageBuilder(login, password);               
        sendPackage(registrationMessage);
    }

    @Override
    public void sendMessagePacket(int receiverID, String message) {
        GameChatProtocol.UserMessage sendMessage = messagesBuilder.sendMessageBuilder(receiverID, message);
         sendPackage(sendMessage);
    }

    @Override
    public void sendQuickSearchPacket(String partName) {
         GameChatProtocol.QuickSearchNames quickSearchNamesMessage = messagesBuilder.quickSearchNamesBuilder(partName);
          sendPackage(quickSearchNamesMessage);
    }

    @Override
    public void sendAddNewFriendsPacket(Vector<String> friends) {
         GameChatProtocol.AddNewFriends addNewFriendsMessage =  messagesBuilder.addNewFriendsMessageBuilder(friends);
         if(friends != null){
            sendPackage(addNewFriendsMessage); 
         }
    }

    @Override
    public void sendDeleteFriendPacket(int friendID) {
      GameChatProtocol.DeleteFriend deleteFriendMessage = messagesBuilder.deleteFriendMessageBuilder(friendID);
      sendPackage(deleteFriendMessage);
    }
    
    
}
