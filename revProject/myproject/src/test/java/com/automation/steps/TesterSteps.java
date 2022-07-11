package com.automation.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterSteps {
    @Given("tester is logged into custom tester page")
    public void tester_is_logged_into_custom_tester_page() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("File://C:/Users/17132/Desktop/revProject/myproject/src/test/resources/web-pages/tPage.html");
    }
    
//     @When("tester selects pending defect by id")
//     public void tester_selects_pending_defect_by_id() {
//         // Write code here that turns the phrase above into concrete actions
//         Select selectDefect = new Select(TestRunner.driver.findElement(By.id("defectId")));
//         selectDefect.selectByVisibleText("63452");
// ;
//     }
    @When("tester selects defect to accept")
    public void tester_selects_defect_to_accept() {
        // Write code here that turns the phrase above into concrete actions
        Select acceptDefect = new Select(TestRunner.driver.findElement(By.id("Accepted")));
        acceptDefect.selectByVisibleText("accepted");
    }
    // @When("tester selects the defect description")
    // public void tester_selects_the_defect_description() {
    //     // Write code here that turns the phrase above into concrete actions
    //     Select defectDescription = new Select(TestRunner.driver.findElement(By.id("DefectDescription")));
    //     defectDescription.selectByVisibleText("grod 3");
    // }
    @When("tester clicks the submit button")
    public void tester_clicks_the_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.tester.submit();
    }
    @Then("defect should be updated as accepted")
    public void defect_should_be_updated_as_accepted() {
        // Write code here that turns the phrase above into concrete actions
        // TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        //             String text = TestRunner.driver.switchTo().alert().getText();
        //             Assert.assertEquals("defect Updated", text);
                    TestRunner.driver.switchTo().alert().accept();
    }
   




  
    @When("tester selects defect to rejected")
    public void tester_selects_defect_to_rejected() {
        // Write code here that turns the phrase above into concrete actions
        Select rejectDefect = new Select(TestRunner.driver.findElement(By.id("Fixed")));
        rejectDefect.selectByVisibleText("Rejected");
    }
   
   
    @When("defect should be updated as rejected")
    public void defect_should_be_updated_as_rejected() {
        // Write code here that turns the phrase above into concrete actions
        // Select rejectDefect = new Select(TestRunner.driver.findElement(By.id("Fixed")));
        // rejectDefect.selectByVisibleText("Shelved");
        TestRunner.driver.switchTo().alert().accept();
    }
    
    


    // @When("tester selects defect by id")
    // public void tester_selects_defect_by_id() {
    //     // Write code here that turns the phrase above into concrete actions
    //     Select acceptedDefectId = new Select(TestRunner.driver.findElement(By.id("AcceptedDefectId")));
    //     acceptedDefectId.selectByVisibleText("37029");
    // }
    @When("tester selects fix shelved or rejected")
    public void tester_selects_fix_shelved_or_rejected() {
        // Write code here that turns the phrase above into concrete actions
        Select fixedDefectId = new Select(TestRunner.driver.findElement(By.id("Fixed")));
        fixedDefectId.selectByVisibleText("Fix");
    }
    // @When("tester selects a  defect description")
    // public void tester_selects_a_defect_description() {
    //     // Write code here that turns the phrase above into concrete actions
    //     Select acceptedDefectdescription = new Select(TestRunner.driver.findElement(By.id("AcceptedDefectDescription")));
    //     acceptedDefectdescription.selectByVisibleText("zoom");
    // }
    @When("tester clicks on the submit button")
    public void tester_clicks_on_the_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.tester.AcceptedSubmit();
    }
    @Then("defect status should be updated")
    public void defect_status_should_be_updated() {
        // Write code here that turns the phrase above into concrete actions
       // String text = TestRunner.driver.switchTo().alert().getText();
                   // Assert.assertEquals("defect updated", text);
                    TestRunner.driver.switchTo().alert().accept();
    }


    @When("tester selects accepted defect")
    public void tester_selects_accepted_defect() {
        // Write code here that turns the phrase above into concrete actions
        Select fixedDefectId = new Select(TestRunner.driver.findElement(By.id("Fixed")));
        fixedDefectId.selectByVisibleText("Fix");;
    }
    
    
    @When("tester selects rejected")
    public void tester_selects_rejected() {
        // Write code here that turns the phrase above into concrete actions
        Select fixedDefectId = new Select(TestRunner.driver.findElement(By.id("Fixed")));
        fixedDefectId.selectByVisibleText("Rejected");;
    }
    
    
   
    @When("tester selects shelved")
    public void tester_selects_shelved() {
        // Write code here that turns the phrase above into concrete actions
        Select fixedDefectId = new Select(TestRunner.driver.findElement(By.id("Fixed")));
        fixedDefectId.selectByVisibleText("Shelved");
    }

}