import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.junit.SimpleScenarioTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Tests extends SimpleScenarioTest<UserCanLogin> {

    @ProvidedScenarioState
    static WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown()
    {
        driver.quit();
    }

    @Test
    public void User_Can_Login()
    {
        given().i_am_at_the_login_page();
        when().i_login_as_john_with_password_demo();
        then().the_login_action_will_be_successful();
    }


}