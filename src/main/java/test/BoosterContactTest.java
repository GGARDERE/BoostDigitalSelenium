package test;


	import java.util.concurrent.TimeUnit;

	import org.junit.After;
	import org.junit.Assert;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.PageFactory;

	import java.io.FileNotFoundException;
	import java.util.List;

	import pageObject.EcranActiviteEtablissement;
	import pageObject.EcranCatalogueProduits;
	import pageObject.EcranDashboardEPJ;
	import pageObject.EcranListeEtablissement;
	import pageObject.EcranLocaliteEtablissement;
	import pageObject.EcranPanierEtablissement;
	import pageObject.EcranPlanDeReglement;
	import pageObject.EcranPresenceEtablissement;
	import pageObject.EcranPropositionCommerciales;
	import pageObject.EcranReferencementEtablissement;
	import pageObject.PageChoixEPJ;
	import pageObject.PageConnexion;
	import utils.BoiteOutils;


	public class BoosterContactTest{
		protected static WebDriver driver;
		@Before
		public void debut() {
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver2_43/chromedriver.exe");
			driver = new ChromeDriver();
			
			
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();	
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("http://g4929/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		@Test
		public void run() throws FileNotFoundException, InterruptedException{
			String login="newsirg13";
			String password="jaunes12345!";
			String EPJ="52093484";
			String nom_Propal="Propal_TestAuto";
			PageConnexion pageConnexion = PageFactory.initElements(driver, PageConnexion.class);
			PageChoixEPJ pageChoixEPJ = pageConnexion.seConnecter(login, password);
			EcranDashboardEPJ ecranDashboardEPJ= pageChoixEPJ.selectionnerContinuer(EPJ);
			EcranPropositionCommerciales ecranPropositionCommerciales = ecranDashboardEPJ.selecionnerBoutonVoirProposition();
			EcranCatalogueProduits ecranCatatalogueProduits = ecranPropositionCommerciales.selectionnerBouttonPLUS(nom_Propal);
			
			
			
			
}
	}
