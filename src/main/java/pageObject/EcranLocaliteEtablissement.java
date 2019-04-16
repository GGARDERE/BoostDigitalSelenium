package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcranLocaliteEtablissement {
	protected final WebDriver driver;
	
	public EcranLocaliteEtablissement(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
		
		
		
	}
	
	@FindBy(xpath = "//button[.=\"Valider et passer à l'étape 2\"]")
	private WebElement boutonValiderPasserEtape2;
	
	public EcranActiviteEtablissement validerLocalitePasseractivite(WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(boutonValiderPasserEtape2));
		boutonValiderPasserEtape2.click();
		return PageFactory.initElements(driver, EcranActiviteEtablissement.class);
	}
}
