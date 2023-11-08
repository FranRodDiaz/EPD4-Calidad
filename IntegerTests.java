
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerTests {

    @Test
    public void testParseIntNumber() {
        Assert.assertEquals(Integer.parseInt("123"), 123);
    }

    @Test
    public void testValueOfNumber() {
        Integer integerValue = Integer.valueOf("123");
        Assert.assertNotNull(integerValue);
        Assert.assertEquals(integerValue.intValue(), 123);
    }

    @Test
    public void testCompareTo() {
        Integer x = 5;
        Integer y = 10;
        Assert.assertTrue(x.compareTo(y) < 0);
        Assert.assertTrue(y.compareTo(x) > 0);
        Assert.assertEquals(x.compareTo(5), 0);
    }
}
