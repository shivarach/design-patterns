package org.shiva.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    Internet internet = new RealInternet();
    List<String> bannedSites = new ArrayList<>();


    @Override
    public void connect(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost)) {
            throw new Exception("Access denied");
        }
        internet.connect(serverHost);
    }
}
