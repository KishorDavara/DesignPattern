package observer;

public class MobileSubscriber implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Mobile notification: " + news);
    }
}
