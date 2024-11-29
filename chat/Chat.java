package chat;

public class Chat {

    public static void main(String[] args) {
       ChatWindow chatWindow1=new ChatWindow("Sender 01");
       ChatDB.getChatController().addChatWindow(chatWindow1);
       ChatWindow chatWindow2=new ChatWindow("Sender 02");
       ChatDB.getChatController().addChatWindow(chatWindow2);
       ChatWindow chatWindow3=new ChatWindow("Sender 03");
       ChatDB.getChatController().addChatWindow(chatWindow3);
       ChatWindow chatWindow4=new ChatWindow("Sender 04");
       ChatDB.getChatController().addChatWindow(chatWindow4);
    }
    
}
