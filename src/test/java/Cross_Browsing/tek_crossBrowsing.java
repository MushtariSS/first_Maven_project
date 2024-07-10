package Cross_Browsing;

import org.openqa.selenium.edge.EdgeDriver;

public class tek_crossBrowsing {
    public static void main(String[] args) {
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().window().maximize();
        edgeDriver.get("https://google.com");
        String title = edgeDriver.getTitle();
        System.out.println(title);
        edgeDriver.quit();
    }
}
