import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;

public class MainClassTest
{
    MainClass Main = new MainClass();

    @Test
    public void testGetLocalNumber()
    {
        int aVal = Main.getLocalNumber();
        int eVal = 14;

        Assert.assertTrue("Local number is not equal to 14",aVal == eVal);
    }

    @Test
    public void testGetClassNumber()
    {
        int aNum = Main.getClassNumber();
        int eNum = 45;

        Assert.assertTrue("Class number is not greater than 45",aNum > eNum);
    }

    @Test
    public void testGetClassString()
    {
        String x = Main.getClassString();

        Assert.assertTrue(x == ("Hello") || x ==("hello"));
    }


}

