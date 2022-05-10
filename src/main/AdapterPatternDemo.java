package main;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "alem do horizonte.mp3");
        audioPlayer.play("mp4", "um minuto para o fim do mundo.mp4");
        audioPlayer.play("vlc", "exagerado.vlc");
        audioPlayer.play("avi", "banho de chuva.avi");
    }
}
