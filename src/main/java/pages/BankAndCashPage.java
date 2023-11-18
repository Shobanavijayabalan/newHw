package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCashPage {
  WebDriver driver;
  
 public void bankAndCash() {
	 this.driver=driver;
 } 
	 @FindBy(how=How.XPATH,using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
			 WebElement BankAndCash;
	 @FindBy(how=How.XPATH,using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	         WebElement NewAccount;
	 @FindBy(how=How.XPATH,using ="//*[@id=\"account\"]")
	         WebElement AccountTitle;
	 @FindBy(how=How.XPATH,using ="//*[@id=\"description\"]")
	         WebElement Description;
	 @FindBy(how=How.XPATH,using ="//*[@id=\"balance\"]")
	         WebElement InitialBalance;
	 @FindBy(how=How.XPATH,using ="//*[@id=\"account_number\"]")
	         WebElement AccountNumber;
	 @FindBy(how=How.XPATH,using="//*[@id=\"contact_person\"]")
	         WebElement ContactPerson;
	 @FindBy(how=How.XPATH,using ="//*[@id=\"contact_phone\"]")
	         WebElement PhoneNumber;
	 @FindBy(how=How.XPATH,using = "//*[@id=\"ib_url\"]")
	         WebElement BankingUrl;
	 @FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	         WebElement Submit;
	 
 public void clickOnBankAndCash() {
	 BankAndCash.click();
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	 
 }
			
 public void bankAndCashNewAccount() {
	 NewAccount.click();
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
 }

 public void bankAndCashAccountTitle(String accountTitle) {
	 AccountTitle.sendKeys(accountTitle);
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
 }
public void bandAndCashDescription(String description) {
	Description.sendKeys(description);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
public void bcinitialBalance(String initialBalance) {
	InitialBalance.sendKeys(initialBalance);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
public void bcaccountNumber(String accountNumber) {
  AccountNumber.sendKeys(accountNumber);
  try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
 }

public void contactPerson(String contactPerson) {
	ContactPerson.sendKeys(contactPerson);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
public void phoneNumber(String phoneNumber) {
	PhoneNumber.sendKeys(phoneNumber);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
public void bankingUrl(String url) {
	BankingUrl.sendKeys(url);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
public void submitButton() {
	Submit.click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public String getPageTitle() {
	return driver.getTitle();
	
}
 
}
