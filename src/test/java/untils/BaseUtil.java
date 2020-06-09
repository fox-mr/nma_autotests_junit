package untils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseUtil {

    protected WebDriver driver;

    public BaseUtil(WebDriver driver) {
        this.driver = driver;
    }

    public void click(WebElement element){
        element.click();
    }
}
