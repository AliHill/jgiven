import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

@FindBy(xpath = "\"//*[@id=\\\"rightPanel\\\"]/div/div/h1\"")
WebElement accountOverview;

}
