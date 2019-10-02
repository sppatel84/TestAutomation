import base.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private TestBase testBase = new TestBase();

    @Before
    public void setUp(){
        testBase.openBrowser();
        testBase.getUrl("http://ec2-34-250-139-60.eu-west-1.compute.amazonaws.com/");
        testBase.maximizeBrowser();
        testBase.impWaits();
    }

    @After
    public void tearDown(){
        testBase.closeBrowser();
    }
}
