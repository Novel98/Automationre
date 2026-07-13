import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
    @Test
    public void verifyLogin() {
        Assert.assertTrue(false); // Fails intentionally
        System.out.println("Verify Login");
    }

    @Test(dependsOnMethods = {"verifyLogin"},alwaysRun = true)
    public void verifyHomePage() {
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifySignUp() {
        System.out.println("Verify Sign Up");
    }
}

