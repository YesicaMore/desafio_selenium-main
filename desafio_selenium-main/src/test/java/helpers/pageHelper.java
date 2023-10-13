package helpers;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

public class pageHelper {
  private WebDriver driver;
  private Wait<WebDriver> wait;

  public pageHelper() {
       driver = new ChromeDriver();
  }

   public void AbrePagina(String url) {
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get(url);

       wait = new WebDriverWait(driver, Duration.ofSeconds(5));
   }

   public void mudarValorCombobox(String valor) {
       WebElement selectElement = driver.findElement(By.id("switch-version-select"));
       Select select = new Select(selectElement);
       select.selectByVisibleText(valor);
   }

   public void clicarBotaoAddCustomer() {
       WebElement selectElement = driver.findElement(By.xpath("//a[@href='/v1.x/demo/bootstrap_theme_v4/add']"));
       selectElement.click();
   }

   public void preencherFormulario(DataTable tabela) {
       Map<String, String> dataMap = tabela.asMap(String.class, String.class);

       driver.findElement(By.id("field-customerName")).sendKeys(dataMap.get("Name"));
       driver.findElement(By.id("field-contactLastName")).sendKeys(dataMap.get("Last name"));
       driver.findElement(By.id("field-contactFirstName")).sendKeys(dataMap.get("ContactFirstName"));
       driver.findElement(By.id("field-phone")).sendKeys(dataMap.get("Phone"));
       driver.findElement(By.id("field-addressLine1")).sendKeys(dataMap.get("AddressLine1"));
       driver.findElement(By.id("field-addressLine2")).sendKeys(dataMap.get("AddressLine2"));
       driver.findElement(By.id("field-city")).sendKeys(dataMap.get("City"));
       driver.findElement(By.id("field-state")).sendKeys(dataMap.get("State"));
       driver.findElement(By.id("field-postalCode")).sendKeys(dataMap.get("PostalCode"));
       driver.findElement(By.id("field-country")).sendKeys(dataMap.get("Country"));
       driver.findElement(By.className("chosen-single")).click();
       driver.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/div/input")).sendKeys("Fixter");
       driver.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/ul/li")).click();
       driver.findElement(By.id("field-creditLimit")).sendKeys(dataMap.get("CreditLimit"));

       driver.findElement(By.id("form-button-save")).click();
   }
   public void validarMensagemSucesso() {
       String mensagemEsperada = "Your data has been successfully stored into the database. Edit Customer or Go back to list";

       WebElement goToEditForm = driver.findElement(By.className("go-to-edit-form"));
       wait.until(d -> goToEditForm.isDisplayed());

       String texto = driver.findElement(By.id("report-success")).getText();
       Assert.assertEquals("Mensagem inválida", mensagemEsperada, texto);
   }

   public void fecharBrowser() {
       driver.quit();
   }

   // parte 2
    public void clicarGoBackToList() {
        WebElement selectElement = driver.findElement(By.xpath("//a[@href='/v1.x/demo/bootstrap_theme_v4/']"));
        selectElement.click();
    }

    public void clicarNaColuna() {
        WebElement selectElement = driver.findElement(By.name("customerName"));
        selectElement.click();
    }

    public void digitarNome(String nome) {
        driver.findElement(By.name("customerName")).sendKeys(nome);
        driver.findElement(By.tagName("body")).click();
    }

    public void clicarAbaixoActions() {
        wait.until(d -> d.findElement(By.className("loading-opacity")));

        WebElement selectElement = driver.findElement(By.xpath("//*[@id=\'gcrud-search-form\']/div[2]/table/thead/tr[2]/td[1]/div/input"));
        selectElement.click();
    }

    public void clicarDelete() {
        WebElement selectElement = driver.findElement(By.xpath("//*[@id='gcrud-search-form']/div[2]/table/thead/tr[2]/td[2]/div[1]/a/span"));
        selectElement.click();
    }
    public void validarMensagemBox(String textoEsperado) {
        WebElement alertForm = driver.findElement(By.className("alert-delete-multiple"));
        wait.until(d -> alertForm.isDisplayed());

        String texto = alertForm.getText();

        System.out.println(texto);
        Assert.assertTrue("Mensagem inválida", texto.contains(textoEsperado));
    }

    public void confirmarDelete() {
        WebElement selectElement = driver.findElement(By.className("delete-multiple-confirmation-button"));
        selectElement.click();
    }

    public void validarMensagemSucesso(String textoEsperado) {
        WebElement alertForm = driver.findElement(By.xpath("/html/body/div[3]/span[3]/p"));
        wait.until(d -> alertForm.isDisplayed());

        String texto = alertForm.getText();
        Assert.assertEquals("Mensagem inválida", textoEsperado, texto);
    }
}
