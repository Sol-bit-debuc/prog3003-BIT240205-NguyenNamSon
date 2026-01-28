package ExTwo;

public class Main {
    public static void main(String[] args) {
        Notification noti = NotificationFactory.createNotification("SMS");
        noti.notifyUser();
    }
}
