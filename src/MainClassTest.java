import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test

        public void testGetLocalNumber()

    {
        Assert.assertTrue("figure not equal 14",getLocalNumber()==14);
    }

    @Test

    public void testGetClassNumber()

    {
        Assert.assertTrue("figure is less then 45",getClassNumber()>45);
    }
    @Test
    public void testGetClassString()

    {
        Assert.assertTrue("String is not containing Hello or hello words",getClassString().contains("Hello")||getClassString().contains("hello"));

    }


}
