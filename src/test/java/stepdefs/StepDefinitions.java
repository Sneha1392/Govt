package stepdefs;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.LoginPage;


import java.awt.*;
import java.io.IOException;

public class StepDefinitions {
    public LoginPage login=new LoginPage();

    public StepDefinitions() throws IOException {
    }



    @Given("^user opens the GovtTech URL with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userOpensTheGovtTechURLWithAnd(String username, String password) throws Throwable {
        login.setup(username, password);

    }

    @And("^User logs in to corpass with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userLogsInToCorpassWithAndAndAnd(String NRIC, String name, String UEN, String Role) throws Throwable {
        login.corpass(NRIC, name, UEN, Role);
    }

    @And("^User clicks on My Grants and Get new Grant$")
    public void userClicksOnMyGrantsAndGetNewGrant() {

    }

    @And("^User clicks on My Grants and Get new Grant with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userClicksOnMyGrantsAndGetNewGrantWithAnd(String Menu, String SubMenu) throws Throwable {

        login.clickgrant(Menu, SubMenu);
    }

    @And("^User selects \"([^\"]*)\"$")
    public void userSelects(String Sector) throws Throwable {
        login.selectsector(Sector);
    }



    @And("^User selects the \"([^\"]*)\"$")
    public void userSelectsThe(String grant) throws Throwable {
        login.selectgrant(grant);
    }

    @And("^User applies for \"([^\"]*)\"$")
    public void userAppliesFor(String marketgrant) throws Throwable {
        login.selectmarketgrant(marketgrant);
    }



    @And("^user fills up Application form with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userFillsUpApplicationFormWithAndAndAndAnd(String q1, String q2, String q3, String q4, String q5) throws Throwable {
        login.applicationform(q1, q2, q3, q4, q5);
        login.clicksave();
    }

    @And("^User clicks on Next Button$")
    public void userClicksOnNextButton() {
        login.next();
    }

    @And("^User enters invalid email$")
    public void userEntersInvalidEmail() {
        login.invalidemail();
    }

    @And("^User enters invalid phone number$")
    public void userEntersInvalidPhoneNumber() {
        login.invalidcontactno();
    }

    @And("^User does not enter mandatory field values$")
    public void userDoesNotEnterMandatoryFieldValues() {
        login.blankfieldvalues();
    }

    @And("^User fills up contact details form$")
    public void userFillsUpContactDetailsForm() {
        login.maincontact();
        login.invalidpostalcode();
        login.mailingaddress();
        login.letterofoffer();

    }

    @And("^User fills up contact details form with autofill mailing address$")
    public void userFillsUpContactDetailsFormWithAutofillMailingAddress() {
        login.maincontact();
        login.autofilladdress();
    }

    @And("^user fills up letter of form section$")
    public void userFillsUpLetterOfFormSection() {
        login.maincontact();
        login.mailingaddress();
        login.letterofoffer();
        login.clicksave();
    }

    @And("^user fills up letter of form section and selects same as main contact$")
    public void userFillsUpLetterOfFormSectionAndSelectsSameAsMainContact() {
        login.maincontact();
        login.mailingaddress();
        login.selectsamemaincontact();
        login.clicksave();

    }

    @And("^user fills up proposal section$")
    public void userFillsUpProposalSection() throws AWTException {
        login.proposal();
        // login.uploaddoc();
    }

    @And("^user fills up business impact section$")
    public void userFillsUpBusinessImpactSection() {
        login.businessimpact();
    }

    @And("^User verifies the errors in form$")
    public void userVerifiesTheErrorsInForm() {
        login.verifyerrors();
    }

    @And("^User provides details of cost$")
    public void userProvidesDetailsOfCost() throws AWTException {
        login.cost();
    }

    @And("^User reviews the form$")
    public void userReviewsTheForm() {

        login.declarereview();
        login.review();
    }

    @And("^User reviews submission$")
    public void userReviewsSubmission() {
        login.reviewsubmission();
    }
}
