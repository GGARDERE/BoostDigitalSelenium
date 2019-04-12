package pageObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;

public class EcranListeEtablissement {

	protected final WebDriver driver;
	
	public EcranListeEtablissement(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super();
		this.driver = driver;
		
		
		
	}
	
	@FindBy(xpath = "//table[@class='table table-js']/thead")
	private WebElement enTeteTableauSolutionEtablissement;
	
	@FindBy(xpath = "//table[@class='table table-js']/tbody")
	private WebElement corpTableauSolutionEtablissement;
	
	@FindBy(xpath = "//button[.='Valider la configuration et passer au choix du plan de règlement']")
	private WebElement boutonValider;
	
	private List<String> recuperationValeurListeEtablissements(WebElement tableau) {
		int i= 0;

		List<WebElement> lignes = tableau.findElements(By.xpath("tr"));
				//driver.findElementsByXPath("//Table/Custom/DataItem/Custom/Text[@Name]");
		
		List<String> listeStringReturn = new ArrayList<String>();
		
		for(WebElement ligne : lignes) {
			List<WebElement> cases = ligne.findElements(By.xpath("*"));
			cases.stream().map(WebElement::getText).forEach(listeStringReturn::add);
		}
		return listeStringReturn;
		
	}
	
	
	public List<String> verificationElementTableau() {
		List<String> listTableauComplete = new ArrayList<String>();
		
		List<String> listeEntete =recuperationValeurListeEtablissements(enTeteTableauSolutionEtablissement);
		
		List<String> listeCorp =recuperationValeurListeEtablissements(corpTableauSolutionEtablissement);
		
		listeEntete.stream().forEach(listTableauComplete::add);
		listeCorp.stream().forEach(listTableauComplete::add);
		
		
		return listTableauComplete;
	}
	
	public EcranLocaliteEtablissement selectionnerBoutonConfigurerPourEPJ(String EPJ) {
		WebElement boutonConfigurer = corpTableauSolutionEtablissement.findElement(By.xpath("tr/td[.='"+EPJ+"']/following-sibling::td[.='Configurer']"));
	
		boutonConfigurer.click();
		return PageFactory.initElements(driver, EcranLocaliteEtablissement.class);
		
	}
	
	public EcranPlanDeReglement validerLaConfiguration() {
		boutonValider.click();
		return PageFactory.initElements(driver, EcranPlanDeReglement.class);
		
	}
}
