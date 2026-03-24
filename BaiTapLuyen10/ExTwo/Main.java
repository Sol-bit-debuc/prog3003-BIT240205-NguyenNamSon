package ExTwo;

interface MediaPlayer {

    void play(String audioType, String fileName);

}

interface AdvancedMediaPlayer {

    void playVlc(String fileName);
}

class VlcPlayer implements AdvancedMediaPlayer {

    public void playVlc(String fileName) {
        System.out.println("dang phat VLC file" + fileName);
    }
}

class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedPlayer = new VlcPlayer();

        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedPlayer.playVlc(fileName);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter("vlc");
        player.play("vlc", "music.vlc");
    }
}
