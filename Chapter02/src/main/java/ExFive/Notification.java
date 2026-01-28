package ExFive;

public class Notification {

    private MessageService service;

    public void setMessageService(MessageService service) {
        this.service = service;
    }

    public void notify(String message) {
        service.sendMessage(message);
    }
}
