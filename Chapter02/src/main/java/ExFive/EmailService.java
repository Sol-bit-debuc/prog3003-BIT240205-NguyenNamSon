package ExFive;

public class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Gửi Email: " + message);
    }
}
