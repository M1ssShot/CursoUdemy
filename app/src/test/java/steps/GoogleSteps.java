package steps;

//import java.util.List;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {
    //En Steps, realizare las validaciones correspondientes, haciendo uso o llamando las funciones que se encuentran en GooglePage.
    //Aqui de igual manera coloco todos los pasos que son ejecutados por cucumber. Y obvio agrego la nomenclatura de Gherkin
    GooglePage google = new GooglePage();
    
    @Given("^i'm on the google page$")
    public void NavigateToGoogle(){
        google.navigateToGoogle();
        
    }
    //Para agregar valores o parametros uso esto (.+)
    
    @When("^i enter a search (.+)$")
    public void TypeTheSearch(String search){
        google.sendTextGoogle(search);
    }
    @And("^Click on the search button$")
    public void ClickOnButtonSearch(){
        google.clickSearchButton();
      }
    
    @Then("^the results match the criteria$")
    public void ResultOfSearch(){
        
        //Assert.assertEquals("Overlord - Ver en Crunchyroll", google.firstResult()); //Compara el texto de la primera busqueda con lo escrito a la izquierda
        System.out.println("Resultado de la busqueda lo que arroja es: "+google.firstResult());
       
    }
    /*
    //Con esta clase definimos si queremos saber si un elemento en una lista se encuentra visible.
    @Then("^Valido que el valor se encuentre en la lista$"){
        List <String> evaluarTexto = google.listElementosString();//Como me retorna una lista, declaro una.
        boolean existe = evaluarTexto.contains("marioneta");//Aqui pregunto si existe o contiene el valor en la lista con contains.
        if(existe){
            System.out.println("El elemento si existe");
        }else{
            System.out.println("El elemento no existe, verificar informacion.");
        }
    }
    */
    
}
