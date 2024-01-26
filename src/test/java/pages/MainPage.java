package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final SelenideElement enterToAccountButton = $(By.xpath("//button[@id='loginBtn']"));
    public void clickLoginBtn() {
        enterToAccountButton.shouldBe(visible);



    }


    private final SelenideElement inputPasswordField =$(By.xpath("//*[@id=\"Password\"]"));
    private Condition correct;

    public void inputpassword() {
        inputPasswordField.shouldBe(correct);
    }
}
