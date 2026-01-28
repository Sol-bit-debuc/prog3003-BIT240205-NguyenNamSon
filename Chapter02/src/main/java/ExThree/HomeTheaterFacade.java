package ExThree;

public class HomeTheaterFacade {

    private Tv tv = new Tv();
    private SoundSystem sound = new SoundSystem();
    private DVDPlayer dvd = new DVDPlayer();

    public void watchMovie() {
        System.out.println("Chuẩn bị xem phim...");
        tv.on();
        sound.on();
        dvd.on();
        System.out.println("Phim bắt đầu!");
    }
}
