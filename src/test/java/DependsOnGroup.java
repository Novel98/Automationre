import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {
    @Test(groups = {"smoke"})

    public void verifyAddToCard() {
        Assert.assertTrue(false);
        System.out.println("verify add to card");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyOrder() {
        System.out.println("verify Order");
    }

    @Test(enabled = false)
    public void verifyPayment() {
        System.out.println("verify Payment");
    }
}

