package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


	@FindBy(xpath="//div[@class='header content']")
	public WebElement homePageTitle;
	
	@FindBy(xpath="//div[@class='panel header']/.//a[text()='Create an Account']")
	public WebElement createAccountHyperlink;
	
	@FindBy(xpath="//div[@class='panel header']//li[@data-label='or']//a")
	public WebElement signInHyperlink;
	
	@FindBy(xpath="//*[@id='maincontent']/div[1]/h1/span")
	public WebElement createNewAccountTitle;
	
	@FindBy(id="firstname")
	public WebElement firstNameTextBox;
	
	@FindBy(id="email")
	public WebElement signInEmailInput;
	
	
	@FindBy(id="pass")
	public WebElement signInPasswordInput;
	
	@FindBy(name="send")
	public WebElement signInButton;
	
	@FindBy(id="lastname")
	public WebElement lastNameTextBox;
	
	@FindBy(id="email_address")
	public WebElement email_addressInput;
	
	@FindBy(id="password")
	public WebElement passwordInput;
	
	
	@FindBy(id="password_confirmation")
	public WebElement confirmPasswordInput;
	
	@FindBy(xpath="//button[@title='Create an Account']")
	public WebElement createNewButton;
	
	@FindBy(xpath="//div[@class='column main']//div[@class='page-title-wrapper']")
	public WebElement myAccountPageTitle;

	@FindBy(xpath="//div[@class='box box-information']//strong")
	public WebElement contactInformationTitle;
	

	@FindBy(xpath="//div[@class='box box-information']/.//p")
	public WebElement userData;
	

	@FindBy(xpath="(//ul[@class='header links'])[1]")
	public WebElement myProfile;
	
	@FindBy(xpath="(//*[@data-label='or']//a[contains(text(),'Sign Out')])[1]")
	public WebElement logOutOption;
	
	
}

