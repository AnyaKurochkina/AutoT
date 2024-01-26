import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestUI {

    @BeforeEach
    void setUP() {
        open("https://xn--80afcdbalict6afooklqi5o.xn--p1ai/identity/account/login");
    }
    @Test
    @DisplayName("Проверка открытия главной страницы")
    void testOpenMainPage() {

        new MainPage()
                .clickLoginBtn();


    }
}