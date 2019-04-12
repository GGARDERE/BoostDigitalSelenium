package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageChoixEPJ {
	protected final WebDriver driver;
	
	public PageChoixEPJ(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
	}
	@FindBy(xpath= "//input[@placeholder=\"Veuillez indiquer un numéro d'EPJ\"]")
	private WebElement champEPJ;
	
	@FindBy(xpath = "//button[.='Continuer']")
	private WebElement boutonContinuer;
	
	public EcranDashboardEPJ selectionnerContinuer (String EPJ) {
		champEPJ.isEnabled();
		champEPJ.sendKeys(EPJ);
		boutonContinuer.click();
		return PageFactory.initElements(driver, EcranDashboardEPJ.class);
	}
	
	
}
