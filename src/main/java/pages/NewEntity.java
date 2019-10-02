package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class NewEntity extends TestBase {

    @FindBy(xpath = "//div[contains(@class,'container')]//h2")
    public WebElement entityPage;

    @FindBy(id = "fullName")
    public WebElement nameTextBox;

    @FindBy(id = "country")
    public WebElement countryTextBox;

    @FindBy(name = "yob")
    public WebElement dobTextBox;

    @FindBy(id = "position")
    public WebElement positionTextBox;

    @FindBy(id = "url")
    public WebElement sourceUrlTextBox;

    @FindBy(id = "risk")
    public WebElement selectRiskLevel;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='modal-body']")
    public WebElement successMessage;




    WebDriverWait wait = new WebDriverWait(driver,15);


    public void onEntityPage(String newEntity){
        assertThat(entityPage.getText(),is(equalTo(newEntity))); // validate that user on entity page
    }

    public void enterFullName(String name){
        assertThat(nameTextBox.getAttribute("name"),is(equalTo("fullName")));  //assert that we pass the value in correct text box
        nameTextBox.sendKeys(name);  // enter full name
    }

    public void enterCountryName(String country){
        assertThat(countryTextBox.getAttribute("name"),is(equalTo("country")));
        countryTextBox.sendKeys(country); // enter country name
    }

    public void enterDateOfBirth(String dob){
        assertThat(dobTextBox.getAttribute("type"),is(equalTo("date")));
        dobTextBox.sendKeys(dob);  // enter date of birth
    }

    public void enterPostion(String position){
        assertThat(positionTextBox.getAttribute("name"),is(equalTo("position")));
        positionTextBox.sendKeys(position); // enter position
    }

    public void enterSourceInfoUrl(String url){
        assertThat(sourceUrlTextBox.getAttribute("name"),is(equalTo("url")));
        sourceUrlTextBox.sendKeys(url);
    }

    public void selectRiskLevel(String risk){
        Select selectRisk = new Select(selectRiskLevel);
        selectRisk.selectByVisibleText(risk);    // select the risk level
    }

    public void clickOnSaveBtn(String save){
        assertThat(saveButton.getText(),is(equalTo(save)));
        saveButton.click();
    }

    public void validateSuccessMsg(String message){
        // validate that new entity added successfully
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-body']")));
        assertThat(successMessage.getText(),is(equalTo(message)));
    }

}
