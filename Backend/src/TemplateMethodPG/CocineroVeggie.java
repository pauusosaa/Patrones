package TemplateMethodPG;

public class CocineroVeggie extends Cocinero{
    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando queso y tomates");

    }

    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando ingredientes Veggies");

    }
}
