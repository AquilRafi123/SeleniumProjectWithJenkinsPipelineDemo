import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

    @Test
    public void loginTest() {

        WebDriverManager.chromedriver().setup();
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); 
        options.addArguments("--disable-gpu");
        
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        if (title.contains("OrangeHRM")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }

        driver.quit();
    }
}
