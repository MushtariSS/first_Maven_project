package review_week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class activity_1 {
    public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com");

        By signInLocator = By.id("signInLink");
        WebElement signInElement=driver.findElement(signInLocator);
        signInElement.click();

        By NewAccountLocator = By.id("newAccount");
        WebElement newAccountElement=driver.findElement(NewAccountLocator);
        newAccountElement.click();

        By name = By.id("nameInput");
        WebElement nameElement = driver.findElement(name);
        nameElement.sendKeys("Mushtari");

        By email = By.id("emailInput");
        WebElement emailElm = driver.findElement(email);
        emailElm.sendKeys("m.saidjafaropva@gmail.com");

        By password = By.id("passwordInput");
        WebElement passwordElm = driver.findElement(password);
        emailElm.sendKeys("Romin2021!");

        By confirmPassword = By.id("confirmPasswordInput");
        WebElement confirmPasswordElm = driver.findElement(confirmPassword);
        confirmPasswordElm.sendKeys("Romin2021!");
        
        By signupBtn= By.id("signupBtn");
        WebElement signupBtnElm = driver.findElement(signupBtn);
        signupBtnElm.click();

        driver.quit();




    }
}
