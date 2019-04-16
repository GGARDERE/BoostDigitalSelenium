package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcranReferencementEtablissement {
	protected final WebDriver driver;
	
	public EcranReferencementEtablissement(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
		
		
		
	}
	
	@FindBy(xpath = "//button[.=\"Valider et passer à l'étape 5\"]")
	private WebElement boutonValiderPasserEtape5;
	
	public EcranPanierEtablissement validerReferencementPasserPanier(WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(boutonValiderPasserEtape5));
		boutonValiderPasserEtape5.click();
		return PageFactory.initElements(driver, EcranPanierEtablissement.class);
	}
}
