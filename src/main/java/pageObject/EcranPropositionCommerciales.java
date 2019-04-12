package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcranPropositionCommerciales {

	protected final WebDriver driver;

	public EcranPropositionCommerciales(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
		
		
		
	}
	
	@FindBy(xpath = "//i[@class='fa fa-plus']/parent::button")
	private WebElement boutonVoirProposition;
	
	
	@FindBy(id = "input_proposition_add")
	private WebElement champNomPropal;
	
	@FindBy(xpath = "//div[.='Ajouter une nouvelle proposition']/../..//button[contains( text() , 'Valider')]")
	private WebElement boutonValiderAjouterNewProposition;
	
	@FindBy(xpath = "//i[@class='fa fa-trash']/parent::button")
	private WebElement boutonSupprimer;
	
	@FindBy(xpath = "//div[.='Supprimer une proposition']/../..//button[contains( text() , 'Valider')]")
	private WebElement boutonValideSupprimerPropal;
	public EcranCatalogueProduits selectionnerBouttonPLUS(String nomPropal) {
		boutonVoirProposition.click();
		champNomPropal.sendKeys(nomPropal);
		boutonValiderAjouterNewProposition.click();
		return PageFactory.initElements(driver, EcranCatalogueProduits.class);
	}
	
	public void supprimerPropal(String propal) {
		WebElement propalASupprimer = driver.findElement(By.xpath("//span[.='"+propal+"']/parent::div"));
		propalASupprimer.click();
		boutonSupprimer.click();
		boutonValideSupprimerPropal.click();
			
	}
	
}
