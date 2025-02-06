import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTester {
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","drivers/msedgedriver.exe");

//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());

        driver.quit();

    }
}
