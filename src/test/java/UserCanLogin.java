import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.assertj.core.api.Assertions.*;

public class UserCanLogin extends Stage<UserCanLogin> {

    @ExpectedScenarioState(required = true)
    WebDriver webDriver;

    LoginPage loginPage;
    HomePage homePage;

    @BeforeStage
    void setup() {
        {
            loginPage = PageFactory.initElements(webDriver, LoginPage.class);
            homePage = PageFactory.initElements(webDriver, HomePage.class);
        }
    }

    public void i_am_at_the_login_page() {
        webDriver.get("http://parabank.parasoft.com");
    }

    public void i_login_as_john_with_password_demo()
    {
        loginPage.usernameField.sendKeys("John");
        loginPage.passwordField.sendKeys("demo");
        loginPage.loginBtn.click();
    }

    public void the_login_action_will_be_successful()
    {
        assertThat(homePage.accountOverview).isNotNull();
    }
}
