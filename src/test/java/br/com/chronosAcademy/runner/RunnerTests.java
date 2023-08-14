package br.com.chronosAcademy.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/",
        tags = "@loginComSucesso",
        glue = "br.com.chronosAcademy.steps",
        plugin = {"json: target/reports/CucumberReports.json", "pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RunnerTests {
}
