package Cross_Browsing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class Activity_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String browserType = "firefox";

        System.out.println("Enter the browser type");
        browserType = scn.next();
        if(browserType.equalsIgnoreCase("chrome")){
            ChromeDriver driver = new ChromeDriver();
        }else if(browserType.equalsIgnoreCase("firefox")){
            FirefoxDriver driveer  = new FirefoxDriver();
        }else {
            System.out.println("invalid browser");
        }


    }
}
