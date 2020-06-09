package services;

import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Value;
import appmanager.ApplicationManager;

@Slf4j
public class StaticPagesService {

    //@Value("${BASE_URL}")
    private String baseURL;

    private final ApplicationManager app = new ApplicationManager();

    private void goToUscPage(){
        app.getNavigationUtil().goTo(baseURL);
    }

}
