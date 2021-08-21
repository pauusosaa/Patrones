package TemplateMethodPG;

public class App {
    public static void main(String[] args) {
        Cocinero cocineroVeggie = new CocineroVeggie();
        Cocinero cocineroNoVeggie = new CocineroNoVeggie();

        cocineroNoVeggie.hacerPizza();
        cocineroVeggie.hacerPizza();
    }
}
