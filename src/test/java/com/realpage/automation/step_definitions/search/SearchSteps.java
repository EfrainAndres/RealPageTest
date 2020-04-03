package com.realpage.automation.step_definitions.search;

import com.realpage.automation.pages.SearchPage;
import com.realpage.automation.pages.basepage.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps extends BasePage {

    SearchPage sp = new SearchPage();

    @Given("I’m on the homepage {string}")
    public void iMOnTheHomepage(String homePage) throws InterruptedException {
        sp.goHomePage(homePage);
    }

    @When("I type {string} into the search field")
    public void iTypeIntoTheSearchField(String text) throws InterruptedException {
        sp.txtSearch(text);
    }

    @And("I click the Google Search button")
    public void iClickTheGoogleSearchButton() throws InterruptedException {
        sp.clickSearchButton();
    }

    @Then("I go to the search results page")
    public void iGoToTheSearchResultsPage() throws InterruptedException {
        sp.resultsPage();
    }

    @And("the first result is {string}")
    public void theFirstResultIs(String firstRsult) throws InterruptedException {
        sp.firstResult(firstRsult);
    }

    @When("I click on the first result link")
    public void iClickOnTheFirstResultLink() throws InterruptedException {
        sp.clickFirstResult();
    }

    @Then("I go to the {string} page")
    public void iGoToThePage(String arg0) throws InterruptedException {
        sp.goToThePage();
    }

    @And("the suggestions list is displayed")
    public void theSuggestionsListIsDisplayed() throws InterruptedException {
        sp.listIsDisplayed();
    }

    @And("I click on the first suggestion in the list")
    public void iClickOnTheFirstSuggestionInTheList() throws InterruptedException {
        sp.clickFirstSuggestion();
    }
}
