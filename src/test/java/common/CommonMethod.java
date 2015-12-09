package common;

import framework.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import ui.PageTransporter;

/**
 * Created with IntelliJ IDEA.
 * User: BrayanRosas
 * Date: 12/8/15
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommonMethod {

    public static void navigateLoginPage() {
        PageTransporter.getInstance().navigateToLoginPage();
    }

    public static void signInToMainPage(){
        String user="BrayanRosas";
        String password ="Client123"  ;
        PageTransporter.getInstance().navigateToLoginPage().signIn(user, password);
    }

    public static void signOut(){
        PageTransporter.getInstance().navigateToMainPage().clickSignOutSuccessfully();
    }

    public static boolean theUserIsLogIn()
    {
        WebDriver driver = BrowserManager.getInstance().getDriver();
        if(driver.getCurrentUrl().contains("login"))  {
            System.out.println("****** The user is not logged");
            return false;
        }
        else {
            System.out.println("+++++++++++++ The user is logged");
            return true;
        }
    }
}


