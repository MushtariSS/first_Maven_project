package Week_2.Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class practice_one {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://retail.tekschool-students.com");
        By signInLocator= By.id("signInList");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();
        By newAccountLocator=By.id("newAccountBtn");
        WebElement newAccountElement = driver.findElement(newAccountLocator);
        newAccountElement.click();
        driver.quit();
        By nameLocator = By.name("name");
        WebElement nameElement = driver.findElement(nameLocator);
        nameElement.sendKeys("Nana");
        By emailLocator  = By.name("email");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("@gmail.com");
        By passwordLocator = By.name("password");
        WebElement passwordElement= driver.findElement(passwordLocator);
        passwordElement.sendKeys("Nana123!");
        By confirmPasswordLocator=By.name("confirm_password");
        WebElement confirmPasswordElement = driver.findElement(confirmPasswordLocator);
        confirmPasswordElement.sendKeys("Nana123!");
        By signupBtnLocator=By.className("signup_btn");
        WebElement signupBtnElements= driver.findElement(signupBtnLocator);
        signupBtnElements.click();
        driver.quit();

    }
}
