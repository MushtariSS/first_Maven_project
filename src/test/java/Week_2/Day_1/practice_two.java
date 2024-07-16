package Week_2.Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_two {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.quit();

        driver.findElement(By.name("q")).sendKeys("Tekschool");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.partialLinkText("TEK SChOOL modern")).click();
        driver.quit();

    }
}
