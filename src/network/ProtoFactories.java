package network;


import network.handlers.AllUserDataHandler;
import network.handlers.CheckLoginHandler;
import network.handlers.FoundFriendsHandler;
import network.handlers.IncomingMessageHandler;
import network.handlers.InputMessageHandler;
import network.handlers.UpdateFriendListHandler;
import network.handlers.UserNotFoundHandler;


public class ProtoFactories {

    public static IncomingMessageHandler createHandler(MessageTyp type, byte[] data) {

        switch (type) {

            case ALL_USER_DATA_PACKET:
              return  new AllUserDataHandler(data);             
            case USER_NOT_FOUND_PACKET:
              return new UserNotFoundHandler(data);  
            case  CHECK_LOGIN_PACKET:
                return new CheckLoginHandler(data);
            case  INPUT_MESSAGE:
                return new InputMessageHandler(data);
            case  FOUND_FRIENDS_PACKET:
                return new FoundFriendsHandler(data);
            case  UPDATE_FRIEND_LIST:
                return new UpdateFriendListHandler(data);
            default:
                return null;
        }
    }
}
