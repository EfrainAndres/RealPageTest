package com.realpage.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/GoogleSearch/Search.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/search-page.json",
        "html:target/search-page-html"},
        glue = {"com.realpage.automation.utils.driver",
                "com.realpage.automation.step_definitions.search"})
public class SearchRunner {
}
