package ExThree;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        CompletableFuture<Void> transaction = CompletableFuture.supplyAsync(() -> {
            simulateDelay("Xác thực khách hàng", 1000);
            if (Math.random() < 0.2) {
                throw new RuntimeException("Xác thực thất bại!");
            }
            return true;
        }).thenCompose(auth -> CompletableFuture.supplyAsync(() -> {
            simulateDelay("Kiểm tra số dư", 1500);
            if (Math.random() < 0.3) {
                throw new RuntimeException("Số dư không đủ!");
            }
            return true;
        })).thenCompose(balance -> CompletableFuture.runAsync(() -> {
            simulateDelay("Thực hiện giao dịch", 2000);
            System.out.println("?Giao dịch thành công!");
        })).exceptionally(ex -> {
            System.out.println("Giao dịch thất bại: " + ex.getMessage());
            return null;
        });

        transaction.join();
    }

    private static void simulateDelay(String task, int ms) {
        try {
            System.out.println("Đang " + task + "...");
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
