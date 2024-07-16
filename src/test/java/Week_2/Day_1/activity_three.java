package Week_2.Day_1;

import org.checkerframework.checker.calledmethods.qual.RequiresCalledMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class activity_three {
    public static void main(String[] args) {
        //Return elements from BBS.com page
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bbc.com");
        By anchorLocator = By.tagName("a");
        List<WebElement> anchorElements = driver.findElements(anchorLocator);
        for(WebElement elements : anchorElements) {
            System.out.println(elements.getText());
        }

        By imagesLocator = By.tagName("img");
        List<WebElement> imagesElements = driver.findElements(imagesLocator);
        System.out.println((imagesElements.size()));

        By buttonLocator = By.tagName("btn");
        List<WebElement> buttonElements = driver.findElements(buttonLocator);
        System.out.println(buttonElements.size());
        for(WebElement element:buttonElements){
            System.out.println(element.getText());
        }


    }
}
