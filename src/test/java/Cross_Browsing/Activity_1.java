package Cross_Browsing;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class Activity_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        WebDriver driver;

        System.out.println("Enter the browser chrome, firefox and edge");
        String browserType = scn.next();

        if(browserType.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }else if(browserType.equalsIgnoreCase("firefox")){
            driver  = new FirefoxDriver();
        }else {
            throw new RuntimeException("invalid browser");
        }
        driver.get("https://google.com");




    }
}
