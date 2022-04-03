import org.junit.Assert;
import org.junit.Test;

public class AutomationTest {
    @Test
    public void geturltest() {
        Automation da = new Automation ("C:\\Users\\Inbal Eitan\\Desktop\\chromedriver.exe");
        System.out.println(da.SignUpTest());
        Assert.assertEquals(da.SignUpTest(),"http://automationpractice.com/index.php");

    }
    @Test
    public void gettitletest() throws InterruptedException {
     Automation ta = new Automation("C:\\Users\\Inbal Eitan\\Desktop\\chromedriver.exe");

        Assert.assertEquals(ta.NewTitle(),"My account - My Store");
    }

}
