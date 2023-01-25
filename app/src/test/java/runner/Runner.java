package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;



@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/feature",
    glue = "steps",
    tags = "@GoogleTest",
    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
    monochrome = true
    //tags se usara para ejecutar un escenario en especifico
)

public class Runner{
    @AfterClass
    public static void CerrarNavegador(){
       BasePage.cerrarDriver();
    }
}

