import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BeforClassAfterClass {

    WebDriver driver;

    @BeforeClass
    public void beforeClassExample() {
        System.out.println("BeforeClass → Runs once before all tests");
    }

    @BeforeMethod
    public void beforeMethodExample() {
        driver = new ChromeDriver(); // Upcasting
        System.out.println("BeforeMethod → Runs before each test");
    }

    @Test
    public void openAmazonUrl() {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        System.out.println("Test → Opened Amazon");
    }

    @Test
    public void openTestNGUrl() {
        driver.get("https://testng.org/");
        driver.manage().window().maximize();
        System.out.println("Test → Opened TestNG");
    }

    @AfterMethod
    public void afterMethodExample() {
        driver.close();
        System.out.println("AfterMethod → Runs after each test");
    }

    @AfterClass
    public void afterClassExample() {
        
    }
}

