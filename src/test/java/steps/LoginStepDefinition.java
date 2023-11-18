package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.BankAndCashPage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase{
	LoginPage loginPage;
	BankAndCashPage bankAndCashPage;
	
	@Given ("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		init();
		driver.get("https://techfios.com/billing/?ng=admin/");
	}
	
	@When ("User enters the {string} in the username field")
	public void user_enters_the_username_in_the_username_field(String username) {
		loginPage=PageFactory.initElements(driver,LoginPage.class);
		loginPage.enterUserName(username);
	}
	@When("User enters the {string} in the password field")
	public void user_enters_the_password_in_the_password_field(String password) {
//		loginPage=PageFactory.initElements(driver,LoginPage.class);
		loginPage.enterPassword(password);
	}
	@When ("User clicks on login")
	public void user_clicks_on_login() {
		loginPage.clickSignIn();
	}
	@Then ("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		String expectedTitle="Dashboard- iBilling";
		String actualTitle=loginPage.getPageTitle(); 
		Assert.assertEquals("Dashboardpage title not matching", expectedTitle, actualTitle);
	}
	@And ("User clicks on bankCash")
	public void user_clicks_on_bankCash() {
		bankAndCashPage= PageFactory.initElements(driver, BankAndCashPage.class);
		bankAndCashPage.clickOnBankAndCash();
	}
	@And ("User clicks on newAccount")
	public void user_clicks_on_newAccount() {
		bankAndCashPage.bankAndCashNewAccount();
	}
	@And ("User enters {string} in the accountTitle field in accounts page")
	public void user_enters_accountTitle_in_the_accountTitle_field_in_accounts_page(String accountTitle) {
		bankAndCashPage.bankAndCashAccountTitle(accountTitle);
	}
	@And ("User enters {string} in the description field in accounts page")
	public void user_enters_description_in_the_description_field_in_accounts_page(String description) {
		bankAndCashPage.bandAndCashDescription(description);
	}
	@And ("User enters {string} in the initialBalance field in accounts page")
	public void user_enter_initialBalance_in_the_initialBalance_field_in_accounts_page(String initialBalance) {
	    	bankAndCashPage.bcinitialBalance(initialBalance);
	}
	@And ("User enters {string} in the accountNumber field in accounts page")
	public void user_enters_accountNumber_in_the_accountNumber_field_in_accounts_page(String accountNumber) {
		   bankAndCashPage.bcaccountNumber(accountNumber);
	}
	@And ("User enters {string} in the contactPerson field in accounts page")
	public void user_enters_string_in_the_contactPerson_field_in_accounts_page(String contactPerson) {
		bankAndCashPage.contactPerson(contactPerson);
	}
	@And ("User enters {string} in the Phone field in accounts page")
	public void user_enters_Phone_in_the_Phone_field_in_accounts_page(String phoneNumber) {
		bankAndCashPage.phoneNumber(phoneNumber);
	}
	@And ("User enters {string} in the internetBankingURL field in accounts page")
	public void user_enters_internetBankingURL_in_the_internetBankingURL_field_in_accounts_page(String bankingUrl) {
		bankAndCashPage.bankingUrl(bankingUrl);
	}
	@And ("User clicks on submit")
	public void user_clicks_on_submit() {
		bankAndCashPage.submitButton();
	}
	@Then ("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		String expected =" Accounts ";
		String actual= bankAndCashPage.getPageTitle();
		Assert.assertEquals("page not matching" ,expected ,actual);
	}

		
}
