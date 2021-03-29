package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static helpers.AttachmentsHelper.*;
import static helpers.DriverHelper.configureDriver;

public class TestBase {

    @BeforeAll
    public static void beforeAll() {
        configureDriver();
    }

    @AfterEach
    public void afterEach() {
        attachScreenshot("Last screenshot");
        attachPageSource();
        attachAsText("Browser console logs", getConsoleLogs());
        if (System.getProperty("location").equals("remote"))
            attachVideo();
        closeWebDriver();
    }
}
