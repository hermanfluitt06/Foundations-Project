package com.automation.poms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login{    
    @FindBy(id = "username") 
    public WebElement usernameInput;
    @FindBy(id = "password")
     public WebElement passwordInput;
     @FindBy(tagName = "button" )
     public WebElement login;


    
    public Login(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
        public void enterUsername(String username){

            this.usernameInput.sendKeys(username);
    
         }
    
         public void enterPassword(String password){
    
            this.passwordInput.sendKeys(password);
    
         }
    
         public void clickButton(){
    
            this.login.click();
    
         }
    
    }
   


