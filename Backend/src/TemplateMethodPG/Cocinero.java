package TemplateMethodPG;

public abstract class Cocinero {
    public void hacerPizza(){
        prepararMasa();
        preCocinarMasa();
        prepararIngredientes();
        agregarIngredientes();
        cocinarPizza();
        empaquetarPizza();
    }
    protected abstract void prepararIngredientes();
    protected abstract void agregarIngredientes();
    private void prepararMasa(){
        System.out.println("Preparando la masaaaaa.....");
    }
    private void preCocinarMasa(){
        System.out.println("Pre-cocinando la masa...");
    }
    private void cocinarPizza(){
        System.out.println("Cocinando la Pizza...");
    }
    private void empaquetarPizza(){
        System.out.println("Empaquetando la pizza...");
    }
}
