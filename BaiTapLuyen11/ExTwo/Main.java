package ExTwo;

interface MessageService {

    void sendMessage(String message);
}

class EmailService implements MessageService {

    public void sendMessage(String message) {
        System.out.println("gui mail: " + message);
    }
}

class SMSService implements MessageService {

    public void sendMessage(String message) {
        System.out.println("gui sms: " + message);
    }
}

class Notification {

    private MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    public void notifyUser(String msg) {
        service.sendMessage(msg);
    }
}

public class Main {

    public static void main(String[] args) {
        Notification note = new Notification();

        note.setService(new EmailService());
        note.notifyUser("Chao ban qua emai!");

        note.setService(new SMSService());
        note.notifyUser("Chao ban qua sms!");
    }
}
