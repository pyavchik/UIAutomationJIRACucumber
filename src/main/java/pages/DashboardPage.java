package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * Created by pyavchik on 21.06.2018.
 */
public class DashboardPage {
    private static String xpathForUserIcon = "//a[@id='header-details-user-fullname']";
    private static String idLogoutLink = "log_out";
    public static String findCurrentUrl() {
        return url();
    }

    private static SelenideElement findUserIcon() {
        return $(By.xpath(xpathForUserIcon));
    }

    private static SelenideElement findLogoutLink() {
        return $(By.id(idLogoutLink));
    }

    public static void logout(){
        findUserIcon().click();
        findLogoutLink().click();
    }
}
