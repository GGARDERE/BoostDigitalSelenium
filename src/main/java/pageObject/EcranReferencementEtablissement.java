package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcranReferencementEtablissement {
	protected final WebDriver driver;
	
	public EcranReferencementEtablissement(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
		
		
		
	}
	
	@FindBy(xpath = "//button[.=\"Valider et passer à l'étape 5\"]")
	private WebElement boutonValiderPasserEtape5;
	
	public EcranPanierEtablissement validerReferencementPasserPanier() {
		boutonValiderPasserEtape5.click();
		return PageFactory.initElements(driver, EcranPanierEtablissement.class);
	}
}
