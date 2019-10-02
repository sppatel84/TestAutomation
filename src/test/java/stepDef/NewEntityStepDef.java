package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NewEntity;

public class NewEntityStepDef {

    NewEntity newEntity = new NewEntity();

    @Given("^user on \"([^\"]*)\" page$")
    public void user_on_page(String entityPage) {newEntity.onEntityPage(entityPage);}

    @When("^user enter Full name as \"([^\"]*)\"$")
    public void user_enter_Full_name_as(String fullName) {newEntity.enterFullName(fullName);}

    @When("^user enter country as \"([^\"]*)\"$")
    public void user_enter_country_as(String country) {newEntity.enterCountryName(country);}

    @When("^user enter year of birth \"([^\"]*)\"$")
    public void user_enter_year_of_birth(String dateOfBirth) {newEntity.enterDateOfBirth(dateOfBirth);}

    @When("^user enter position as \"([^\"]*)\"$")
    public void user_enter_position_as(String position) {newEntity.enterPostion(position);}

    @When("^user enter source info URL as \"([^\"]*)\"$")
    public void user_enter_source_info_URL_as(String url) {newEntity.enterSourceInfoUrl(url);}

    @When("^user select the risk level as \"([^\"]*)\"$")
    public void user_select_the_risk_level_as(String riskLevel) {newEntity.selectRiskLevel(riskLevel);}

    @When("^user click on \"([^\"]*)\" button to save the new entity$")
    public void user_click_on_button_to_save_the_new_entity(String saveBtn) {newEntity.clickOnSaveBtn(saveBtn);}

    @Then("^user can view new entity added successfully message as \"([^\"]*)\"$")
    public void user_can_view_new_entity_added_successfully_message_as(String message) {newEntity.validateSuccessMsg(message);}
}
