package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class GooglePage extends BasePage {
    //En esta clase solo voy  a definir los localizadores y hacer uso de las funciones de BASEPAGE para conseguir resultados o mejor dicho texto o realizar un click
    //aqui es donde hago uso de las funciones BASEPAGE y le envio el localizador.
    //De igual manera aqui retorno todos los resultados. En dado caso que quiera regresar valores o texto.
    //Aqui agrego todos los localizadores de la pagina web
    private String searchButton = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']";
    private String inputTextSearch = "//input[@name='q']";
    private String searchTexto = "//h3";
    private String listaElementosWeb = "//div[class='31']";
    //Creo una clase donde corro cada una de las acciones que realizare en la pagina.
    public GooglePage(){
        super(driver);
    }
    public void navigateToGoogle(){
        navigateTo("https://www.google.com.mx");
    }
    public void clickSearchButton(){
        clickElement(searchButton);
    }
    public void sendTextGoogle(String search){
        write(inputTextSearch, search);
    }
    public String firstResult(){
        return textFromElement(searchTexto);
    }
    public List<String> listElementosString(){
        //Necesito obtener todas las leyendas de los webelements y guardarlos en una lista String
        List<WebElement> listaElementos = listElements(listaElementosWeb);//Aqui envio el localizador de los elementos web que voy a capturar.
        List<String> listaLeyendasWeb = new ArrayList<String>();//Declaro una nueva lista donde metere todos los datos de la lista en web
        for (WebElement elementoWeb :listaElementos) {//Aqui digo que recorro todo la lista de elmentos Web
            listaLeyendasWeb.add(elementoWeb.getText());//Aqui agrego el valor de la lista web a una lista de texto.
        }
        return listaLeyendasWeb;//Regreso la lista web, para realizar una validacion de si se encuentra el elemento.

    }
}
