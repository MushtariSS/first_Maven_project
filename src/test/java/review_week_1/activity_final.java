package review_week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class activity_final {
    public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://retail.tekschool-students.com");

        By signInLocator= By.id("signInList");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        By newAccountLocator=By.id("newAccountBtn");
        WebElement newAccountElement = driver.findElement(newAccountLocator);
        newAccountElement.click();

        By nameLocator = By.id("nameInput");
        WebElement nameElement = driver.findElement(nameLocator);
        nameElement.sendKeys("Nana");
        String emailPrefix = "nanalo";
        int numbers = (int)(Math.random()*100);
        String randomEmail = emailPrefix+numbers+"@gmail.com";

        By emailLocator  = By.id("emailInput");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("@gmail.com");

        By passwordLocator = By.id("passwordInput");
        WebElement passwordElement= driver.findElement(passwordLocator);
        passwordElement.sendKeys("Nana123!");

        By confirmPasswordLocator=By.id("confirmPasswordInput");
        WebElement confirmPasswordElement = driver.findElement(confirmPasswordLocator);
        confirmPasswordElement.sendKeys("Nana123!");

        By signupBtnLocator=By.id("signupBtn");
        WebElement signupBtnElements= driver.findElement(signupBtnLocator);
        signupBtnElements.click();

        By profileImageLocator = By.id("profileImageId");
        WebElement profileImageElement = driver.findElement(profileImageLocator);
        boolean isProfileDisplayed = profileImageElement.isDisplayed();
        if(isProfileDisplayed){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        driver.quit();









    }
}
