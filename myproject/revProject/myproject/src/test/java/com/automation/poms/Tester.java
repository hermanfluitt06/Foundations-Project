package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Tester {
@FindBy(id="submitButton1")
public WebElement submitButton;
@FindBy(id="submitButton2")
public WebElement submitButton2;
public Tester(WebDriver driver){

    PageFactory.initElements(driver, this);
     
}

public void submit(){

    this.submitButton.click();
}
public void AcceptedSubmit(){

    this.submitButton2.click();
}

}