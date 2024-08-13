package Steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CommonMethods;
import Pages.LoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends LoginPage {
	

	LoginPage lg = new LoginPage();
	WebDriver driver = new ChromeDriver();
	CommonMethods commonMethods = new CommonMethods();
	
	@Given("^the browser launched and user is navigated to the Magento homepage$")
	public void the_browser_launched_and_user_is_navigated_to_the_Magento_homepage() throws Throwable {
	   try{
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
			
			driver.get("https://magento.softwaretestingboard.com/");
			Thread.sleep(5000);
	   }catch (Exception e) {
		 System.out.println("step failed"+e);
	}
}
	
	@When("^the user views the screen$")
	public void the_user_views_the_screen() throws Throwable {
	   try {
		   commonMethods.waitUntilElementIsVisible(lg.homePageTitle, 5000);
		   Assert.assertTrue(lg.homePageTitle.isDisplayed());
	   }catch (Exception e) {
			 System.out.println("step failed"+e);
		}
	}

	@Then("^the \"([^\"]*)\" link should be visible\\.$")
	public void the_link_should_be_visible(String link) throws Throwable {
		 try {
			 if(link.equalsIgnoreCase("Create new account")){
			 commonMethods.waitUntilElementIsVisible(lg.createAccountHyperlink, 5000); 
			 Assert.assertTrue(lg.createAccountHyperlink.isDisplayed());
			 }else if(link.equalsIgnoreCase("sign in")) {
				 commonMethods.waitUntilElementIsVisible(lg.signInHyperlink, 5000); 
				 Assert.assertTrue(lg.signInHyperlink.isDisplayed()); 
			 }else {
				 System.out.println("select the correct option");
				 Assert.assertFalse(false);
			 }
		   }catch (Exception e) {
				 System.out.println("step failed"+e);
			}
	}

	@When("^the user clicks on the \"([^\"]*)\" link$")
	public void the_user_clicks_on_the_link(String link) throws Throwable {
		try {
		 if(link.equalsIgnoreCase("Create new account")){
			 commonMethods.waitUntilElementIsVisible(lg.createAccountHyperlink, 5000); 
			 Assert.assertTrue(lg.createAccountHyperlink.isDisplayed());
			 lg.createAccountHyperlink.click();
			 }else if(link.equalsIgnoreCase("sign in")) {
				 commonMethods.waitUntilElementIsVisible(lg.signInHyperlink, 5000); 
				 Assert.assertTrue(lg.signInHyperlink.isDisplayed()); 
				 lg.signInHyperlink.click();
			 }else {
				 System.out.println("select the correct option");
				 Assert.assertFalse(false);
			 }
		 Thread.sleep(10000);
		   }catch (Exception e) {
				 System.out.println("step failed"+e);
			}
}


	@Then("^the Sign-Up page should open with the account creation form\\.$")
	public void the_Sign_Up_page_should_open_with_the_account_creation_form() throws Throwable {
		 try {
			 commonMethods.waitUntilElementIsVisible(lg.createNewAccountTitle, 5000); 
			 Assert.assertTrue(lg.createNewAccountTitle.isDisplayed());   
		   }catch (Exception e) {
				 System.out.println("step failed"+e);
			}
	}

	@Given("^the user is on the Sign-Up page$")
	public void the_user_is_on_the_Sign_Up_page() throws Throwable {
		 try {
			 commonMethods.waitUntilElementIsVisible(lg.createNewAccountTitle, 5000); 
			 Assert.assertTrue(lg.createNewAccountTitle.isDisplayed());  
		   }catch (Exception e) {
				 System.out.println("step failed"+e);
			}
	}

	@When("^the user enters valid data in the required fields \\(First Name, Last Name, Email, Password\\)\\.$")
	public void the_user_enters_valid_data_in_the_required_fields_First_Name_Last_Name_Email_Password() throws Throwable {
		 try {
			 commonMethods.waitUntilElementIsVisible(lg.firstNameTextBox, 5000); 
			 lg.firstNameTextBox.sendKeys("ManiKumar");
			 lg.firstNameTextBox.sendKeys("KSD");
			 lg.email_addressInput.sendKeys("RandomMani123@gmail.com");
			 lg.passwordInput.sendKeys("Mani@12309");
			 lg.confirmPasswordInput.sendKeys("Mani@12309");
		   }catch (Exception e) {
				 System.out.println("step failed"+e);
			}
	}


	@When("^the user clicks the \"([^\"]*)\" button$")
	public void the_user_clicks_the_button(String button) throws Throwable {
		 try {
			 if(button.equalsIgnoreCase("Create an Account")) {
			 commonMethods.waitUntilElementIsVisible(lg.createNewButton, 5000);
			 lg.createNewButton.click();
			 }else {
				 commonMethods.waitUntilElementIsVisible(lg.signInButton, 5000);
				 lg.signInButton.click(); 
			 }
			 Thread.sleep(3000);
		   }catch (Exception e) {
				 System.out.println("step failed"+e);
			}
	}

	@Then("^the account should be successfully created, and the user should be logged in or shown a confirmation page\\.$")
	public void the_account_should_be_successfully_created_and_the_user_should_be_logged_in_or_shown_a_confirmation_page() throws Throwable {
		 try {
			 commonMethods.waitUntilElementIsVisible(lg.myAccountPageTitle, 5000);
			 Assert.assertTrue(lg.myAccountPageTitle.isDisplayed()); 
			 Assert.assertTrue(lg.myProfile.isDisplayed()); 
			 Assert.assertTrue(lg.userData.getText().contains("RandomMani123@gmail.com"));	
			   
		   }catch (Exception e) {
				 System.out.println("step failed"+e);
			}
	}

	@Given("^the user has successfully created an account\\.$")
	public void the_user_has_successfully_created_an_account() throws Throwable {
		 try {
			 commonMethods.waitUntilElementIsVisible(lg.myAccountPageTitle, 5000);
			 Assert.assertTrue(lg.myAccountPageTitle.isDisplayed());
			   
		   }catch (Exception e) {
				 System.out.println("step failed"+e);
			}
	}

	@When("^the user signs out$")
	public void the_user_signs_out() throws Throwable {
		 try {
			   commonMethods.waitUntilElementIsVisible(lg.myProfile, 5000);
			   lg.myProfile.click();
			   commonMethods.waitUntilElementIsVisible(lg.logOutOption, 10000);
			   lg.logOutOption.click();
			   Thread.sleep(10000);
		   }catch (Exception e) {
				 System.out.println("step failed"+e);
			}
	}

	@When("^user signs in again using the newly created credentials$")
	public void user_signs_in_again_using_the_newly_created_credentials() throws Throwable {
		 try {
			  commonMethods.waitUntilElementIsVisible(lg.homePageTitle, 5000);
			  lg.signInEmailInput.sendKeys("RandomMani123@gmail.com");
			  lg.signInPasswordInput.sendKeys("Mani@12309");
			  lg.signInButton.click();
			  Thread.sleep(8000);
		   }catch (Exception e) {
				 System.out.println("step failed"+e);
			}
	}

	@Then("^the user should be successfully signed in and redirected to the appropriate page\\.$")
	public void the_user_should_be_successfully_signed_in_and_redirected_to_the_appropriate_page() throws Throwable {
		 try {
			 commonMethods.waitUntilElementIsVisible(lg.myAccountPageTitle, 5000);
			 Assert.assertTrue(lg.myAccountPageTitle.isDisplayed()); 
			 Assert.assertTrue(lg.myProfile.isDisplayed()); 
			 Assert.assertTrue(lg.userData.getText().contains("RandomMani123@gmail.com"));	
		   }catch (Exception e) {
				 System.out.println("step failed"+e);
			}
	}



}
