package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static String xpathWellcomeMessage = "//div[@class='aui-page-header-main']";
    private static String idLoginTextBox = "login-form-username";
    private static String idPasswordTextBox = "login-form-password";
    private static String idLoginButton = "login-form-submit";
    private static String xpathErrorMessage = "//p[contains(text(),'Sorry, your username and password are incorrect - ')]";

    public static SelenideElement findWellcomeMessage(){
        return $(By.xpath(xpathWellcomeMessage));
    }

    public static SelenideElement findUsernameTextBox() {
        return $(By.id(idLoginTextBox));
    }

    public static SelenideElement findPasswordTextBox() {
        return $(By.id(idPasswordTextBox));
    }

    public static SelenideElement findLoginButton(){
        return $(By.id(idLoginButton));
    }

    public static SelenideElement findErrorMessage() {
        return $(By.xpath(xpathErrorMessage));
    }
}
