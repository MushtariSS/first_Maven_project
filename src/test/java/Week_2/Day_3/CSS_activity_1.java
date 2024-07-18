package Week_2.Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSS_activity_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        driver.findElement(By.cssSelector("a#signinLink")).click();
        driver.findElement(By.cssSelector("input.login__input")).sendKeys("angle@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Romin2021!");
        driver.findElement(By.cssSelector("button.w-full")).click();
        driver.findElement(By.cssSelector("a#accountLink")).click();
        String email = driver.findElement(By.cssSelector("div.account__information-detail>h1:nth-child(2)")).getText();

        driver.quit();
    }
}
