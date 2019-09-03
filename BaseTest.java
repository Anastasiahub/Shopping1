import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class BaseTest {
    public WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @After
    public void closeDriver()
    {
        driver.quit();
    }

}
