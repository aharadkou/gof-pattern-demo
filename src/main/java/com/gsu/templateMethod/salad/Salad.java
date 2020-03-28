package com.gsu.templateMethod.salad;

public abstract class Salad {

    public SaladBox getSalad() {
        final SaladBox saladBox = new SaladBox();
        cutIngredients(saladBox);
        serveWithSauce(saladBox);
        return saladBox;
    }

    public abstract void cutIngredients(final SaladBox saladBox);
    public abstract void serveWithSauce(final SaladBox saladBox);
}
