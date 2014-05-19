/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import com.protocol.GameChatProtocol;

/**
 *
 * @author Windows
 */
public enum MessageTyp {
   //  to server
    AUTHORIZATION_PACKET((byte) 1, GameChatProtocol.Authorization.class),
    REGISTRATION_PACKET((byte) 2,GameChatProtocol.Registration.class),
    USER_MESSAGE_PACKET((byte) 3,GameChatProtocol.UserMessage.class),
    QUICK_SEARCH_NAMES ((byte)4, GameChatProtocol.QuickSearchNames.class ), 
    ADD_NEW_FRIENDS    ((byte)5,GameChatProtocol.AddNewFriends.class),
    DELETE_FRIENDS ((byte)6,GameChatProtocol.DeleteFriend.class),
    
    
    // from server
    ALL_USER_DATA_PACKET((byte)20),
    USER_NOT_FOUND_PACKET((byte)21),
    CHECK_LOGIN_PACKET((byte)22),
    INPUT_MESSAGE((byte)23),
    FOUND_FRIENDS_PACKET((byte)24),
    UPDATE_FRIEND_LIST((byte)25),
    UNKNOWN((byte) 0x0A);
    byte aByte;
    Class c;

    MessageTyp(byte b) {
        aByte = b;
    }

    MessageTyp(byte b, Class c) {
        aByte = b;
        this.c = c;
    }

    public static MessageTyp getTypeByByte(byte b) {

        for (MessageTyp messageTyp : values()) {

            if (messageTyp.aByte == b) {
                return messageTyp;
            }
        }

        return UNKNOWN;
    }

    
    public static byte getByteByClass(Class c) {
        for (MessageTyp messageTyp : values()) {

            if (messageTyp.c == c) {
                return messageTyp.aByte;
            }
        }
        return 0;
    }
    
}
