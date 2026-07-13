import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforandAfter {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample() {
        driver = new ChromeDriver(); // Upcasting
    }

    @AfterMethod
    public void afterMethodExample() {
        driver.close();
    }

    @Test
    public void openAmazonUrl() {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }

    @Test
    public void openTestNGUrl() {
        driver.get("https://testng.org/");
        driver.manage().window().maximize();
    }
}

