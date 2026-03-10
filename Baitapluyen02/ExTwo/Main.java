package ExTwo;
public class Main {

    public static void main(String[] args) {

        Computer computer1 = new Computer.ComputerBuilder("500GB", "8GB")
                .setBluetoothEnabled(true)
                .build();

        Computer computer2 = new Computer.ComputerBuilder("1TB", "16GB")
                .build();

        computer1.showInfo();
        computer2.showInfo();
    }

}