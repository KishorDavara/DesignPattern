package proxy;

public class Main {
    public static void main(String[] args) {
        Internet internet = new InternetProxy();
        internet.connect("google.com");
        internet.connect("facebook.com"); //Should throw exception as this host is restricted
    }
}
