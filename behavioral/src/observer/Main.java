package observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer email = new EmailSubscriber();
        Observer mobile = new MobileSubscriber();

        agency.registerObserver(email);
        agency.registerObserver(mobile);

        agency.setNews("Observer Pattern Explained!");

        agency.removeObserver(email);
        agency.removeObserver(mobile);
        System.out.println("All the observers unsubscribed.");
    }
}
