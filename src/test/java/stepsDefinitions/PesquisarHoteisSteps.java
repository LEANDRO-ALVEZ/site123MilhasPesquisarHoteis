package stepsDefinitions;

import io.cucumber.java.pt.Entao;

import io.cucumber.java.pt.Quando;
import pageObjects.PesquisarHoteisPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class PesquisarHoteisSteps {

	@Quando("eu acionar a aba Hoteis")
	public void euAcionarAAbaHoteis() {
		Na(PesquisarHoteisPage.class).abaHotel();

	}

	@Quando("preencher o campo destino")
	public void preencherOCampoDestino() throws InterruptedException {
		Na(PesquisarHoteisPage.class).preencherDestino();
	}

	@Quando("selecionar o destino")
	public void selecionarODestino() throws InterruptedException {
		Na(PesquisarHoteisPage.class).selecionarDestino();
	}

	@Quando("preencher os campos Check-in e Check-out")
	public void preencherOsCamposCheckInECheckOut() throws InterruptedException {
		Na(PesquisarHoteisPage.class).preencherCampoCheckin();
		Na(PesquisarHoteisPage.class).selecionarDataCheckin();
		Na(PesquisarHoteisPage.class).selecionarDataCheckout();

	}

	@Quando("preencher o campo Quartos e hospedes")
	public void preencherOCampoQuartosEHospedes() throws InterruptedException {
		Na(PesquisarHoteisPage.class).campoPassageiro();
		Na(PesquisarHoteisPage.class).quantidadeCriancas();
		Na(PesquisarHoteisPage.class).idadeUm();
		Na(PesquisarHoteisPage.class).selecionarIdadeUm();
		Na(PesquisarHoteisPage.class).idadeDois();
		Na(PesquisarHoteisPage.class).selecionarIdadeDois();

	}

	@Quando("clicar no botao Ok$")
	public void clicarNoBotaoOk() throws Throwable {
		Na(PesquisarHoteisPage.class).clicarBotaoOk();

	}

	@Quando("clicar no botao Buscar")
	public void clicarNoBotaoBuscar() throws InterruptedException {
		Na(PesquisarHoteisPage.class).botaoBuscar();

	}
	//Validar se a pagina de resultados da pesquisa esta com o local de destino correto
	@Entao("e exibido a tela de resultados da busca")
	public void eExibidoATelaDeResultadosDaBusca() {
		assertEquals("Salvador, Bahia, Brasil",
				driver.findElement(By.xpath("//*[@id=\"app-layout\"]/div[1]/nav[2]/div/div[1]/span[1]")).getText());

	}

}
