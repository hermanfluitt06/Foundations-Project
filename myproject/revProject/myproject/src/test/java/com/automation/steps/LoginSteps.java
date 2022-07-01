package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("the employee is on the login page")
    public void the_employee_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("file:///C:/Users/17132/Desktop/revProject/loginPage.html");
    }

    @When("the manager enters his correct username")
    public void the_manager_enters_his_correct_username() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.login.enterUsername("jayG");
    }
    
    @When("the manager enters his correct password")
    public void the_manager_enters_his_correct_password() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.login.enterPassword("oldschool");
    }
    
    @When("the employee clicks the login button")
    public void the_employee_clicks_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.login.clickButton();
    }
    
    @Then("the manager should be logged in to the manager home page")
    public void the_manager_should_be_logged_in_to_the_manager_home_page() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.wait.until(ExpectedConditions.titleIs("Manager Page"));
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Manager Page", title);
    }
    @When("the tester enters his correct username")
    public void the_tester_enters_his_correct_username() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.login.enterUsername("wallyW");
    }
    @When("the tester enters his correct password")
    public void the_tester_enters_his_correct_password() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.login.enterPassword("fastest");
    }
     @Then("the tester should be logged in to the tester home page")
        public void the_tester_should_be_logged_in_to_the_tester_home_page() {
            // Write code here that turns the phrase above into concrete actions
            TestRunner.wait.until(ExpectedConditions.alertIsPresent());
            String text = TestRunner.driver.switchTo().alert().getText();
            Assert.assertEquals("you are logged in", text);
            TestRunner.driver.switchTo().alert().accept();
            TestRunner.wait.until(ExpectedConditions.titleIs("welcomeToSTARLabs"));
            String title = TestRunner.driver.getTitle();
            Assert.assertEquals("welcomeToSTARLabs", title);  
            

        }

}