package untils;

import appmanager.ApplicationManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Slf4j
public class NavigationUtil extends BaseUtil {

    private WebDriver driver;

    public NavigationUtil(WebDriver driver) {
        super(driver);
    }

    public void clickByElement(WebElement element){
        try {
            log.info("try click to " + element);
            element.click();
            log.info(element + " was clicked");
        } catch (Throwable throwable) {
            log.error("Can't click element" + element, throwable);
        }
    }

    public void goTo(String url){
        try {
            log.info("trying to open " + url);
            ApplicationManager.driver.get(url);
            log.info(url + " is opened");
        } catch (Throwable throwable){
            log.error("Can't open url" + url, throwable);
        }
    }
}
