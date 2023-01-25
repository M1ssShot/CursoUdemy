package pages;
//Hago la herencia de la clase Base, por que contiene todas las acciones de selenium
public class TestExcercisePage extends BasePage{
    private String comboBox = "//select[@id='Carlist']";
    public TestExcercisePage(){
        super(driver);
    }
    public void webTestExcercise(){
        navigateTo("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
    }
    public void selectItemByValue(){
        selectFromDropDownByValue(comboBox,"Opel Car");
    }
    public void selectItemByIndex(){
        selectFromDropDownByIndex(comboBox,6);
    }
    public void selectItemByText(){
        selectFromDropDownByText(comboBox,"Toyota");
    }
    
}
