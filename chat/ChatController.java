package chat;
import java.util.ArrayList;
public class ChatController {
    ArrayList<ChatWindow>chatwindowlist;
    
   public ChatController() {
        chatwindowlist=new ArrayList<>();
    }
    public void addChatWindow(ChatWindow chatWindow){
       chatwindowlist.add(chatWindow);
    }
    
   public void sendMessage(String Messager,String message){
        for (ChatWindow chatWindow : chatwindowlist) {
            chatWindow.setMessage(Messager,message);
        }
    }
}
