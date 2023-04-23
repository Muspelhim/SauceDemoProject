package features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Before
    public void maximizeWindow(){
        webDriver.manage().window().maximize();
    }

    @After
    public void closeDriver(){
        webDriver.close();
        webDriver.quit();
    }
}
