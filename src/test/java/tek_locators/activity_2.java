package tek_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class activity_2 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

         driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        By searchBtnLocator = By.id("search");
        WebElement searchBtnElement = driver.findElement(searchBtnLocator);
        searchBtnElement.click();
    }
}
