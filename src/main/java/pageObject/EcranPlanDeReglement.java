package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcranPlanDeReglement {

	protected final WebDriver driver;
	
	public EcranPlanDeReglement(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
		
		
		
	}
	
	@FindBy(xpath = "//div[@class='planReglement__montant-achat']//div[.='Total HT']/following-sibling::div[contains(@class,'ht_price')]")
	private WebElement totalHT;
	
	@FindBy(xpath = "//button[.='Valider le plan de règlement']")
	private WebElement boutonValider;
	
	
	public String recupTotalHT() {
	String resultat	=totalHT.getText();
		return resultat;
	}
	
	public EcranPropositionCommerciales validerPlanDeReglement() {
		boutonValider.click();
		return PageFactory.initElements(driver, EcranPropositionCommerciales.class);
	}
	
}
