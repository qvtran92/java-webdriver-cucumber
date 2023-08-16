package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.LineNumberReader;

import static support.TestContext.getDriver;

public class AnnaVStepDefs {
    @Given("AV navigate to URL {string}")
    public void avNavigateToURL(String sURL) {
        //getDriver().get("https://www.google.com/");
        switch (sURL) {
            case "Google":
                getDriver().get("https://www.google.com/");
                break;
            case "Portnov School":
                getDriver().get("https://www.portnov.com/");
                break;
            case "Yahoo":
                getDriver().get("https://www.yahoo.com/");
                break;
            case "ASK":
                getDriver().get("http://ask-int.portnov.com/#/login");
                break;
            default:
                System.out.println("No URL found");
        }
    }

    @Then("AV get page information")
    public void avGetPageInformation() {
        System.out.println("The page title is " + getDriver().getTitle());
        System.out.println("The page URL is " + getDriver().getCurrentUrl());
        System.out.println("Window handle is " + getDriver().getWindowHandle());
    }

    @Then("AV maximize the window")
    public void avMaximizeTheWindow() {
        getDriver().manage().window().maximize();
    }
}