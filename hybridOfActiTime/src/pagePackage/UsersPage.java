package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	@FindBy(linkText="Users") private WebElement usersText; 
	@FindBy(xpath="//input[@type='button' and (@value='Create New User')]") private WebElement createUser;
    @FindBy(name="username")private WebElement  usnTextBox;
	 @FindBy(name="passwordText")private WebElement  passTextBox;
	 @FindBy(name="passwordTextRetype") private WebElement retypePassTextBox;
	 @FindBy(name="firstName")private WebElement firstNameTextBox;
	 @FindBy(name="lastName")private WebElement lastNameTextBox;
	 @FindBy(xpath="//input[@type='submit' and (.='')]")private WebElement createUserButton;
	 @FindBy(xpath="//input[@type='button' and (@value='cancel')]")private WebElement CancelButton;
	 
	 // Initilization
	 
	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
			
	}

	//Utilization

	public WebElement getUsersText() {
		return usersText;
	}


	public WebElement getCreateUser() {
		return createUser;
	}


	public WebElement getUsnTextBox() {
		return usnTextBox;
	}


	public WebElement getPassTextBox() {
		return passTextBox;
	}


	public WebElement getRetypePassTextBox() {
		return retypePassTextBox;
	}


	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}


	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}


	public WebElement getCreateUserButton() {
		return createUserButton;
	}


	public WebElement getCancelButton() {
		return CancelButton;
	}
	
	 // Operational MEthods
	
	
	public void validPass(String validPassword )
	{
		passTextBox.sendKeys(validPassword);
	}
	 
	 
	 
	 
	 
	
}
