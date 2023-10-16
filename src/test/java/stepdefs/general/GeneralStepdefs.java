package stepdefs.general;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import helpers.GlobalParameters;
import io.cucumber.java.en.Given;

public class GeneralStepdefs {

    // Steps
    @Given("the OutSystems training website is opened")
    public void accessLoginOption() {
        Configuration.holdBrowserOpen = true; // Used as true for help in development
        Configuration.headless = true; // Used for CLI or CI/CD environments
        Configuration.timeout = 30000;
        Selenide.open(GlobalParameters.getInstance().getProperty("BASE_URL_TRAINING"));
        Selenide.webdriver().driver().getWebDriver().manage().window().maximize();
    }
}