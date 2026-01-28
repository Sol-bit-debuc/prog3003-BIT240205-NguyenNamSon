package ExTwo;

public class NotificationFactory {
    public static Notification createNotification(String channel) {
        if (channel.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (channel.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        }
        return null;
    }
}
