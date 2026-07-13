import org.testng.annotations.Test;

public class Invocation {
    @Test(invocationCount = 100, invocationTimeOut = 1)
    public void verifyInvocationCount() {
        System.out.println("Hello Selenium Guys");
    }
}

