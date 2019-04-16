package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcranPresenceEtablissement {
	protected final WebDriver driver;
	
	public EcranPresenceEtablissement(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
		
		
		
	}
	
	@FindBy(xpath = "//button[.=\"Valider et passer à l'étape 4\"]")
	private WebElement boutonValiderPasserEtape4;
	
	public EcranReferencementEtablissement validerPresencePasserReferencement(WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(boutonValiderPasserEtape4));
		boutonValiderPasserEtape4.click();
		return PageFactory.initElements(driver, EcranReferencementEtablissement.class);
	}
}
