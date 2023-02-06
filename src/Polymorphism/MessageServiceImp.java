package Polymorphism;

public class MessageServiceImp extends MessageService {
    void sendMesssage(String message){
        System.out.println("sending msg using whatsapp"+message);
    }

    public static void main(String[] args) {
        MessageServiceImp ref = new MessageServiceImp();
        ref.sendMessage("abc");
    }
}
