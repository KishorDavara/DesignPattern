package observer;

public class EmailSubscriber implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Email received: "+ news);
    }
}
