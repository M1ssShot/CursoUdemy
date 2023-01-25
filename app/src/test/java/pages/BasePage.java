package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;

    //Por que tengo la clase BasePage, es donde realizo todas las interaccion que efectua selenium, por lo que unicamente en esta clase agrego eso y no mas. Si quiero realizar validaciones lo hago en los Steps.
    static{
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        
    }
     public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
     }

     public static void navigateTo(String url){
        driver.get(url);
        driver.manage().window().maximize();
     }

     private WebElement Find(String locator){
        return wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))));
     }

     public void clickElement(String locator){
        Find(locator).click();
     }
     public void write(String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
     }
     public void selectFromDropDownByValue(String locator, String valueToSelect){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(valueToSelect);
     }
     public void selectFromDropDownByIndex(String locator, int valueToSelect){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(valueToSelect);
     }
     public void selectFromDropDownByText(String locator, String valueToSelect){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByVisibleText(valueToSelect);
     }
     public void switchToiFrame(int iFrameID){
         driver.switchTo().frame(iFrameID);//Cambio de frame de acuerdo a un index.
     }
     public void swithFrameToParentFrame(){
         driver.switchTo().parentFrame();//Cambia el focu al frame que se encuentra arriba
     }
     public void dismissAlert(){
         driver.switchTo().alert().accept();//Funcion usada para aceptar mensajes dimiss para recharzala
     }
     public String textFromElement(String locator){
      return Find(locator).getText();
     }
     public Boolean elementIsDisplayed(String locator){
      return Find(locator).isDisplayed();//Regresa un falso o verdadero
     }
     public Boolean elementIsSelected(String locator){
         return Find(locator).isSelected();//Me regresa un booleano verdadero o falso, cuando un check se encuentra seleccionado o no.
     }
     //Para sacar todos los elmentos de una lista lo necesito guardar en un arreglo de tipo lista
     public List<WebElement> listElements(String locator){
         return driver.findElements(By.xpath(locator));//Aqui estoy regresando todos los elementos tipo web en una lista.
     }
     public static void  cerrarDriver( ){
         driver.quit();
     }
}
