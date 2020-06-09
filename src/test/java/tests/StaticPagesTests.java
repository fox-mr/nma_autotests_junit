package tests;

import org.junit.Test;



public class StaticPagesTests extends BaseTest {

    @Test
    public void testUscRedirection(){
        app.getNavigationUtil().goTo("https://ero-video.net/");
    }
}
