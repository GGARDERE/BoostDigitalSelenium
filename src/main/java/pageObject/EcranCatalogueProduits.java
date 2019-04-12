package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcranCatalogueProduits {

	protected final WebDriver driver;
	
	public EcranCatalogueProduits(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
		
		
		
	}
	
	@FindBy(xpath = "//label[contains(text(), 'Solutions Présence et Référencement prioritaire')]")
	private WebElement itemSolutionPresenceReferencementPrio;
	
	@FindBy(xpath = "//div[contains(text(), 'Solutions Présence et Référencement prioritaire')]")
	private WebElement produitSolutionPresenceReferencementPrio;
	
	@FindBy(xpath ="//div[contains(text(), 'Booster Contact)]")
	private WebElement produitBoosterContact;
	
	@FindBy(xpath = "//span[.='Choisir cette offre']/parent::div")
	private WebElement boutonChoisirOffre;
	public EcranListeEtablissement selectionnerOffreSolutionEtReferencement() {
		
		itemSolutionPresenceReferencementPrio.click();
		produitSolutionPresenceReferencementPrio.click();
		boutonChoisirOffre.click();
		return PageFactory.initElements(driver, EcranListeEtablissement.class);
		
	}
	
}
