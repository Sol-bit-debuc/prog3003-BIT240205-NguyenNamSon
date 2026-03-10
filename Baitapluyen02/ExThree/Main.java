package ExThree;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {

        CompletableFuture<String> xacThuc =
                CompletableFuture.supplyAsync(() -> {
                    try{
                        Thread.sleep(2000);
                    }catch(Exception e){}
                    System.out.println("Xác thực khách hàng hoàn thành");
                    return "Khách hàng hợp lệ";
                });

        CompletableFuture<String> xuatVe =
                CompletableFuture.supplyAsync(() -> {
                    try{
                        Thread.sleep(3000);
                    }catch(Exception e){}
                    System.out.println("Xuất vé hoàn thành");
                    return "Vé phim đã được tạo";
                });

        CompletableFuture<String> ketQua =
                xacThuc.thenCombine(xuatVe, (a,b) -> a + " & " + b);

        System.out.println(ketQua.join());

        System.out.println("Hệ thống đặt vé hoàn tất!");
    }
}