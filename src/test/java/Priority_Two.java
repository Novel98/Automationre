import org.testng.annotations.Test;

public class Priority_Two {

    @Test(priority = 3)
    public void testCaseZ() {
        System.out.println("test case Z");
    }

    @Test(priority = 2)
    public void testCaseM() {
        System.out.println("test case M");
    }

    @Test(priority = 1)
    public void testCaseH() {
        System.out.println("test case H");
    }

    @Test(priority = 'A')
    public void testCase() {
        System.out.println("test case H");
    }
}

