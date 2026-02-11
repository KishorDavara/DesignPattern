package facade;

public class DVDPlayer {
    public void on() {
        System.out.println("DVD Player ON");
    }

    public void play(String movie) {
        System.out.println("Playing " + movie);
    }
}