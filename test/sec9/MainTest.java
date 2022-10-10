package sec9;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testBoolReturn(){
        Assert.assertTrue(Main.boolReturn());
        //Assert.assertEquals(true, Main.boolReturn());
    }

    @Test
    public void testBool2(){
        Assert.assertTrue(Main.bool2());
    }
}
