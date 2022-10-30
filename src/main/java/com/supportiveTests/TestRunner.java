package com.supportiveTests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features",
        glue = {"com/stepDefinitions"},
        monochrome = true,
        plugin = {
                "pretty", "html:target/HTMLReports/report.html",
                "json:target/JSONReports/report.json",
                "junit:target/JUnitReports/report.xml"
        }
)
class TestRunner {
}
