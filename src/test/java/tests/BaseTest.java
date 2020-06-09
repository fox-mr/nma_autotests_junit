package tests;

import appmanager.ApplicationManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.*;


@Slf4j
public class BaseTest {

    protected final ApplicationManager app = new ApplicationManager();

    @Before
    public void setUp() {
        app.init();
    }

    @After
    public void setDown() {
        app.stop();
    }

}
