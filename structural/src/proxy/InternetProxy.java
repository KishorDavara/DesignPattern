package proxy;

import java.util.List;

public class InternetProxy implements Internet {
    private final RealInternet realInternet = new RealInternet();
    private static final List<String> blockedSites = List.of("facebook.com", "youtube.com");

    @Override
    public void connect(String host) {
        if (blockedSites.contains(host)) {
            throw new RuntimeException("Access denied to " + host);
        }
        realInternet.connect(host);
    }
}
