import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Basic {
    @Test
    public void OpenAmazon(){
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_6adj14hu0z_e&adgrpid=155259814713&hvpone=&hvptwo=&hvadid=813766258979&hvpos=&hvnetw=g&hvrand=6040077022161397051&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9152871&hvtargid=kwd-58786960&hydadcr=5619_2501594&gad_source=1");
    }
}
