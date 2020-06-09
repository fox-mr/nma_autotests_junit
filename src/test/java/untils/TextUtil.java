package untils;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Slf4j
public class TextUtil extends BaseUtil {

    public TextUtil(WebDriver driver) {
        super(driver);
    }


    public String getTextByElement(WebElement element){
        return element.getText();
    }
}
