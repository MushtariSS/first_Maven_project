package Week_2.Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class implicit_explicit_activity {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com");
       //To apply imlicitely Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //To apply explicitely Wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("signinLink")));
        element.click();
        WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        inputElement.sendKeys("angle@gmail.com");
        WebElement passwordElement = wait.until((ExpectedConditions.visibilityOfElementLocated(By.name("password"))));
        passwordElement.sendKeys("Romin2021!");
        WebElement signInBtn  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='loginBtn']")));
        signInBtn.click();
        WebElement accountBtnElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='accountLink']")));
        accountBtnElement.click();
        WebElement inputPhoneNumberElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name = 'phoneNumber']")));
        inputPhoneNumberElement.sendKeys("");
        WebElement updateBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#personalUpdateBtn")));
        updateBtn.click();
        WebElement updateElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".Toastify")));
        System.out.println(updateElement.getText());

        driver.quit();





    }
}
