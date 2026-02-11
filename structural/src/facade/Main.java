package facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(
                        new DVDPlayer(),
                        new Projector(),
                        new SoundSystem());

        homeTheater.watchMovie("BhagamBhag");
    }
}