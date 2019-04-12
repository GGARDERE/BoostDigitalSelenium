package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcranDashboardEPJ {
	protected final WebDriver driver;
	
	public EcranDashboardEPJ(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
		
		
		
	}
	
	@FindBy(xpath = "//button[.='Voir les propositions']")
	private WebElement boutonVoirProposition;
	
	public EcranPropositionCommerciales selecionnerBoutonVoirProposition() {
		boutonVoirProposition.click();
		return PageFactory.initElements(driver, EcranPropositionCommerciales.class);
	}
}
