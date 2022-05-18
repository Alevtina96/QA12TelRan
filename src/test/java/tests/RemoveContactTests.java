package tests;

import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase{
//    @BeforeMethod
//    public void preCondition(){
//        if (!app.getUser().isLogged()) {
//           app.getUser().login(new User()
//                    .withEmail("noa@gmail.com")
//                    .withPassword("Nnoa12345$"));
//        }
//    }
@BeforeMethod
public void preCondition() {
    if (!app.getUser().isLogged()) {
        app.getUser().login(User.builder()
                .email("noa@gmail.com")
                .password("Nnoa123455$")
                .build());
    }
}
    @Test
    public void removeOneContact(){
    //countStart
    app.contact().removeOneContact();
    //countEnd
        // Assert countStart - countEnd===  >=1
    }

    @Test
    public void removeAllContact(){
        app.contact().removeAllContact();

    }
}
