interface MessageSender {

    void sendMessage(String message);
}
class EmailSender implements MessageSender{
    public void sendMessage(String message){
        System.out.println("email sent: "+ message);
    }
}
class SMSSender implements MessageSender{
    public void sendMessage(String message){
        System.out.println("SMS sent: "+ message);
    }
}
class NotificationService{
    private MessageSender sender;
    public NotificationService(MessageSender sender){
       this.sender=sender; 
    }
    public void alertUser(String msg){
        sender.sendMessage(msg);
    }
}
public class Main4 {
    public static void main(String[] args) {
        MessageSender sms =
        new SMSSender();

NotificationService service =
        new NotificationService(sms);

service.alertUser("Hello");
    }
}

