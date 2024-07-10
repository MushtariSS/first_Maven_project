import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://facebook.com");

        String title = chromeDriver.getTitle();
        System.out.println(title);
        chromeDriver.quit();
    }
}
