import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[1]/input")
    WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[2]/input")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[3]/input")
    WebElement loginBtn;

}
