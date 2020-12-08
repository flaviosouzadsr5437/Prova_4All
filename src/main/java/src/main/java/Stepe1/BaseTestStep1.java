package Stepe1;

import org.junit.Assert;
import org.openqa.selenium.By;
import static Core.DriverFactory.getDriver;
import Core.BasePage;

public class BaseTestStep1 extends BasePage {

	public void BotaoAddCategoria() {
		ClicarBotao(By.id("open-categories-btn"));
	}
	
	public void BotaoSelecionaDoces() {
		ClicarBotao(By.id("category-1"));
	}
	
	public void BotaoAddBrigadeiro() {
		ClicarBotao(By.id("add-product-4-btn"));
	}
	
	public void BotaoAddAlfajor() {
		ClicarBotao(By.id("add-product-5-btn"));
	}
	
	public void BotaoCarinho() {
		ClicarBotao(By.id("cart-products-qtd"));
	}

	public void BotaoAddQtdBrigadeiro() {
		ClicarBotao(By.id("add-product-4-qtd"));
	}
	
	public void BotaoFinalizarCompra() {
		ClicarBotao(By.id("finish-checkout-button"));
	}
	
	public void BotaoPedidoFinalizadoComSucesso() {
		ClicarBotao(By.xpath("/html/body/div/div[3]/div/div/div/button"));
	}
	
	public void verificandoValorTotal() {
		Assert.assertEquals("R$ 24,00", obterMensagemAlertTotal());
	}
	
	public void verificandoMensagemSucesso() {
		Assert.assertEquals("Pedido realizado com sucesso!", obterMensagemAlertFinalizarSucesso());
	}
}
