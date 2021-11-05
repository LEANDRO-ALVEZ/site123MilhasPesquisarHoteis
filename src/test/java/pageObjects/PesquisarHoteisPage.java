package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static utils.Utils.*;

public class PesquisarHoteisPage {

	@FindBy(xpath = "//*[@id=\"hoteis\"]/a/uib-tab-heading/p")
	WebElement abaHotel;

	@FindBy(name = "hotel_location")
	WebElement preencherDestino;

	@FindBy(linkText = "Salvador, Bahia, Brasil")
	WebElement selecionarDestino;

	@FindBy(name = "checkin_date")
	WebElement preencherCampoCheckin;

	@FindBy(xpath = "//span[text()=\" 10 \" ]")
	WebElement selecionarDataCheckin;

	@FindBy(name = "checkout_date")
	WebElement preencherCampoCheckout;

	@FindBy(xpath = "//span[contains(text(), '19')]")
	WebElement selecionarDataCheckout;

	@FindBy(xpath = "//*[@id=\"passengerSelectRooms\"]/span")
	WebElement campoPassageiro;

	@FindBy(id = "btnIdChildAdd-1")
	WebElement quantidadeCriancas;

	@FindBy(name = "rooms[0].children.ages[0]")
	WebElement idadeUm;

	@FindBy(xpath = "//select[@id='rooms[0].children.ages[0]']//option[@label='9 anos']")
	WebElement selecionarIdadeUm;

	@FindBy(name = "rooms[0].children.ages[1]")
	WebElement idadeDois;

	@FindBy(xpath = "//select[@id='rooms[0].children.ages[1]']//option[@label='10 anos']")
	WebElement selecionarIdadeDois;

	@FindBy(id = "travel-package-confirm")
	WebElement clicarBotaoOk;

	@FindBy(xpath = "//*[@id=\"searchHotelSubmit\"]/span")
	WebElement botaoBuscar;

	public void abaHotel() {
		abaHotel.click();

	}

	public void preencherDestino() throws InterruptedException {
		preencherDestino.sendKeys("salvador");
		Thread.sleep(2000);

	}

	public void selecionarDestino() throws InterruptedException {
		selecionarDestino.click();
		//Thread.sleep(2000);

	}

	public void preencherCampoCheckin() throws InterruptedException {
		preencherCampoCheckin.click();
		 Thread.sleep(1000);

	}

	public void selecionarDataCheckin() throws InterruptedException {
		selecionarDataCheckin.click();
		Thread.sleep(2000);

	}

	public void selecionarDataCheckout() throws InterruptedException {
		selecionarDataCheckout.click();
		Thread.sleep(2000);

	}

	public void campoPassageiro() throws InterruptedException {
		campoPassageiro.click();
		Thread.sleep(1000);

	}

	public void quantidadeCriancas() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 300)");
		Actions action = new Actions(driver);
		action.doubleClick(quantidadeCriancas).build().perform();
		Thread.sleep(1000);

	}

	public void idadeUm() throws InterruptedException {
		idadeUm.click();
		Thread.sleep(1000);

	}

	public void selecionarIdadeUm() throws InterruptedException {
		selecionarIdadeUm.click();
		Thread.sleep(1000);

	}

	public void idadeDois() throws InterruptedException {
		idadeDois.click();
		Thread.sleep(1000);

	}

	public void selecionarIdadeDois() throws InterruptedException {
		selecionarIdadeDois.click();
		Thread.sleep(1000);

	}

	public void clicarBotaoOk() throws InterruptedException {
		clicarBotaoOk.click();
		Thread.sleep(1000);

	}

	public void botaoBuscar() throws InterruptedException {
		botaoBuscar.click();
		Thread.sleep(1000);

	}

}
