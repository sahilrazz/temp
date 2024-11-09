package mavenforjenkins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UITest {

    @Test
    public void simpleTest() {
        // A basic test that checks if 2 + 2 equals 4
        int result = 2 + 2;
        Assert.assertEquals(result, 4, "2 + 2 should equal 4");
    }
}
