package appmanager;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import untils.NavigationUtil;
import untils.TextUtil;

@Slf4j
public class ApplicationManager {

    public static WebDriver driver;

    private TextUtil textUtil;
    private NavigationUtil navigationUtil;

    public void init() {
        if (driver == null){
        driver = new ChromeDriver();
        navigationUtil = new NavigationUtil(driver);
        textUtil = new TextUtil(driver);
        log.info("Driver set upped");
        } else log.info("Continue working with existed driver");
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
            log.info("Driver turned off");
        }
    }


    public NavigationUtil getNavigationUtil() {
        return navigationUtil;
    }

    public TextUtil getTextUtil() {
        return textUtil;
    }
}
