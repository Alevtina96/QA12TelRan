package tests;

import models.Contact;
import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static tests.TestBase.app;

public class AddNewContact {
    //    @BeforeMethod
//    public void preConditions() {
//        if (!app.getUser().isLogged()) {
//            app.getUser().login(new User()
//                    .withEmail("noa@gmail.com")
//                    .withPassword("Nnoa12345$"));
//        }
//    }
    @BeforeMethod
    public void preCondition() {
        if (!app.getUser().isLogged()) {
            app.getUser().login(User.builder())
                    .email("noa@gmail.com")
                    .password("Nnoa123455$")
                    .build());
        }

        @Test
        public void addNewContactSuccess() {


            int index = (int) (System.currentTimeMillis() / 1000) % 3600;
            System.out.println();


            Contact contact = new Contact()
                    .withName("Zoya")
                    .withLastName("Snow")
                    .withPhone("123456" + i)
                    .withEmail("zoya" + i + "@gmail.cpm")
                    .withAddress("Haifa")
                    .withDescription("friend");
            app.contact().openContactForm();
            app.contact().fillContactForm(contact);
            app.contact().saveContact();
            app.contact().pause(2000);

            Assert.assertTrue(app.contact().isContactCreateByName(contact.getName())); //if list contact with name + phone
            Assert.assertTrue(app.contact().isContactCreateByPhone(contact.getPhone()));


            //Assert.assertTrue(isContactPageDisplayed());
        }
    }
}
