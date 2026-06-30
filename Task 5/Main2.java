interface MessageSender{
    void sendMessage(String message);
}
class EmailSender implements MessageSender{
    public void sendMessage(String message){
        System.out.println("Sending email: "+message);
    }
}
class NotificationService{
    private MessageSender sender;

    public NotificationService(MessageSender sender){
        this.sender=sender;
    }
    public void alterUser(String msg){
        sender.sendMessage(msg);
    }
}
public class Main2 {
    public static void main(String[] args) {
        MessageSender sender=new EmailSender();
        NotificationService service=new NotificationService(sender);
        service.alterUser("hello");
    }
}

