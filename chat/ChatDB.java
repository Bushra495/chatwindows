
package chat;

public class ChatDB {
    private static ChatController chatcontroller;
    
    public static ChatController getChatController(){
        if (chatcontroller==null){
            chatcontroller=new ChatController();
        }
        return chatcontroller;
    }
}
