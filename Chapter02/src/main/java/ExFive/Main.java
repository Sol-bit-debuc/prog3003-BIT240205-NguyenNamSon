package ExFive;

public class Main {
    public static void main(String[] args) {

        Notification notification = new Notification();

        notification.setMessageService(new EmailService());
        notification.notify("Đơn hàng đã xác nhận!");

        notification.setMessageService(new SMSService());
        notification.notify("Đơn hàng đang giao!");
    }
}
