package com.automation.steps;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerSteps {
    @Given("the manager is logged into his homepage")
    public void the_manager_is_logged_into_his_homepage() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("File://C:/Users/17132/Desktop/revProject/myproject/src/test/resources/web-pages/mPage.html");
    }
    
    @When("the manager inputs a defect name")
        public void the_manager_inputs_a_defect_name() {
            // Write code here that turns the phrase above into concrete actions
            TestRunner.manager.defectInput("name");
        }
    @When("the manager inputs a tester username")
            public void the_manager_inputs_a_tester_username() {
                // Write code here that turns the phrase above into concrete actions
                TestRunner.manager.enterTester("wallyW");
            }
    @When("the manager clicks the assign button")
                public void the_manager_clicks_the_assign_button() {
                    // Write code here that turns the phrase above into concrete actions
                    TestRunner.manager.clickButton();
                }
    @Then("the manager has created and assigned a defect")
                public void the_manager_has_created_and_assigned_a_defect() {
                    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
                    String text = TestRunner.driver.switchTo().alert().getText();
                    Assert.assertEquals("Defect Assigned", text);
                    TestRunner.driver.switchTo().alert().accept();


                }
                
}