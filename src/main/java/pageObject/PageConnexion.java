package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class PageConnexion {
	
	protected final WebDriver driver;
	
	public PageConnexion(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
	}
	@FindBy(id= "user_login")
	private WebElement champLogin;
	
	@FindBy(id = "user_pass")
	private WebElement champPassword;
	
	@FindBy(xpath = "//button[@class='btn btn-inverse']")
	private WebElement boutonConnecter;
	
	public PageChoixEPJ seConnecter(String login, String password) {
		champLogin.clear();
		champPassword.clear();
		champLogin.sendKeys(login);
		champPassword.sendKeys(password);
		boutonConnecter.click();
		return PageFactory.initElements(driver, PageChoixEPJ.class);
		
	}
	public void verifEtreSurEcranConnection() {
		
	}
}
