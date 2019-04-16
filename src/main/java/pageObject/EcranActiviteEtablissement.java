package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcranActiviteEtablissement {
	protected final WebDriver driver;
	
	public EcranActiviteEtablissement(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
		
		
		
	}
	
	@FindBy(xpath = "//button[.=\"Valider et passer à l'étape 3\"]")
	private WebElement boutonValiderPasserEtape3;
	
	public EcranPresenceEtablissement validerActiviePasserPresence(WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(boutonValiderPasserEtape3));
		boutonValiderPasserEtape3.click();
		return PageFactory.initElements(driver, EcranPresenceEtablissement.class);
	}
}


