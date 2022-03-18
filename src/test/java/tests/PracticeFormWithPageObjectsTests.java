package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

public class PracticeFormWithPageObjectsTests extends TestBase{

    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    @Tag("web")
    @DisplayName("Practice form test")
    void positiveFormTest() {

        practiceFormPage.openPage();
        practiceFormPage.fillPracticeForm();
        practiceFormPage.verifySubmitting();
    }
}
