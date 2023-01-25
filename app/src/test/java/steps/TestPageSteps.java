package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestExcercisePage;

public class TestPageSteps {
    TestExcercisePage pageExcercise = new TestExcercisePage();
    
    @Given("^I'm on the page TestPractice$")
    public void NavigateToPageExcercise(){
        pageExcercise.webTestExcercise();
        
    }
    @When("^I click on the element with value$")
    public void SelectItemPageExcercise(){
        pageExcercise.selectItemByValue();
    }
    @And("^I clic on the element with index$")
    public void ClickOnButtonSearch(){
        pageExcercise.selectItemByIndex();
    }
    @Then("^I click on the element with text$")
    public void selectFromDropDownByText(){
        pageExcercise.selectItemByText();
    }
    
}
