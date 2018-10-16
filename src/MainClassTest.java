import org.junit.Assert;
import org.junit.Test;

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
}
