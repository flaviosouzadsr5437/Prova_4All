package Core;
import static Core.DriverFactory.getDriver;
import org.openqa.selenium.By;

public class BasePage {

/***************Botão*********************/	
	public void ClicarBotao(By by)
	{
		getDriver().findElement(by).click();
	}
	
	public void ClicarBotao(String id_campo)
	{
		ClicarBotao(By.id(id_campo));
	}
	
	public void ClicarBotaoPorTexto(String texto)
	{
		ClicarBotao(By.xpath("//button[.-']"+texto+"']"));
	}
	
	public String obterValorBotao(String id)
	{
		return getDriver().findElement(By.id(id)).getAttribute("value");				
	}
	
	/***************Obter texto**************/
	
	public String obterTexto(By by)
	{
		return getDriver().findElement(by).getText();
	}
	
	public String obterTexto(String id)
	{
		return obterTexto(By.id(id));
	}
	
	/***************Alert**************/
	
//***************************************************************************************\\	
String msmCocolaAddSucesso = "/html/body/div/div[2]/div[2]/div/div/div[1]";	

//***************************************************************************************\\
	public String obterMensagemAlertSucessoCoca()
	{
		return obterTexto(By.xpath(msmCocolaAddSucesso));	
	}
	
	public String obterMensagemAlertDoceBrigadeiro() {
		return obterTexto(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]"));
	}
	
	public String obterMensagemAlertDocesAlfajot() {
		return obterTexto(By.xpath("O produto 'Alfajor de chocolate' foi adicionado ao carrinho"));
	}
	
	public String obterMensagemAlertFinalizarSucesso() {
		return obterTexto(By.xpath("/html/body/div/div[3]/div/div/div/h2"));
	}
	
	public String obterMensagemAlertTotal() {		
		return obterTexto(By.id("price-total-checkout"));
	}
}
