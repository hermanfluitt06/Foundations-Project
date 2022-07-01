package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager {
    
    @FindBy(id ="defectName")
    public WebElement defect;
    @FindBy(id ="testerName")
    public WebElement testerInput;
    @FindBy(id = "assignButton")
    public WebElement assign;


    
    public Manager(WebDriver driver){
    


        PageFactory.initElements(driver, this);
    }
    public void defectInput(String name){

        this.defect.sendKeys(name);

    }
    public void enterTester(String tester){

        this.testerInput.sendKeys(tester);
    }


    public void clickButton() {
        this.assign.click();
    }
}
