package ExFour;

import java.util.concurrent.CompletableFuture;

public class Mian {

    public static void main(String[] args) {

        CompletableFuture<Void> checkProduct = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Kiểm tra sản phẩm hoàn thành");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture<Void> payment = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("Thanh toán hoàn thành");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture<Void> shipping = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(1500);
                System.out.println("Vận chuyển hoàn thành");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture<Void> allTasks =
                CompletableFuture.allOf(checkProduct, payment, shipping);

        allTasks.thenRun(() ->
                System.out.println("Đơn hàng đã được xử lý hoàn tất!")
        );

        allTasks.join(); // Đợi tất cả hoàn thành
    }
}
