package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcranPanierEtablissement {

	protected final WebDriver driver;
	
	public EcranPanierEtablissement(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
		
		
		
	}
	
	@FindBy(xpath = "//button[.='Valider la configuration']")
	private WebElement boutonValiderConfiguration;
	
	@FindBy(xpath = "//div[contains(text(), 'Paiement comptant')]/preceding-sibling::div[@class='prix-ht']")
	private WebElement prixComptant12mois;
	
	
	@FindBy(xpath = "//div[contains(text(), 'Paiement en 12 fois')]/preceding-sibling::div[@class='prix-ht']")
	private WebElement prix12fois12mois;
	
public String recupPrixTotalComptantHT() {
	String resultat = prixComptant12mois.getText();
	return resultat;
}
public String recupPrixMensuelHT() {
	String resultat = prix12fois12mois.getText();
	return resultat;
}	
	

public EcranListeEtablissement validerConfiguration() {
	boutonValiderConfiguration.click();
	return PageFactory.initElements(driver, EcranListeEtablissement.class);
}

}
