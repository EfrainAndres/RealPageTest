$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/GoogleSearch/Search.feature");
formatter.feature({
  "name": "Google Homepage Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can search with \"Google Search\"",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I’m on the homepage \"https://www.google.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchSteps.iMOnTheHomepage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"The name of the wind\" into the search field",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSteps.iTypeIntoTheSearchField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Google Search button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.iClickTheGoogleSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to the search results page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.iGoToTheSearchResultsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the first result is \"The Name of the Wind - Wikipedia\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.theFirstResultIs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the first result link",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSteps.iClickOnTheFirstResultLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to the \"Patrick Rothfuss - The Books\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.iGoToThePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User can search by using the suggestions",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I’m on the homepage \"https://www.google.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchSteps.iMOnTheHomepage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"The name of the w\" into the search field",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSteps.iTypeIntoTheSearchField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the suggestions list is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.theSuggestionsListIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the first suggestion in the list",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.iClickOnTheFirstSuggestionInTheList()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to the search results page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.iGoToTheSearchResultsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the first result is \"The Name of the Wind - Wikipedia\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.theFirstResultIs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the first result link",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSteps.iClickOnTheFirstResultLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to the \"Patrick Rothfuss - The Books\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.iGoToThePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});