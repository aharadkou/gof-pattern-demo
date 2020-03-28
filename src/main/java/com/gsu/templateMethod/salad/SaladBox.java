package com.gsu.templateMethod.salad;

import com.gsu.templateMethod.ingredient.Ingredient;
import com.gsu.templateMethod.sauce.Sauce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaladBox {

    private List<Ingredient> ingredients = new ArrayList<>();
    private Sauce sauce;

    public void addIngredients(final Ingredient... ingredients) {
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    public void addSauce(final Sauce sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Ingredients: ").append(System.lineSeparator());
        ingredients.forEach(
                ingredient -> result.append(ingredient.getClass().getSimpleName()).append(System.lineSeparator())
        );
        result.append("Served with ").append(sauce.getClass().getSimpleName());
        return result.toString();
    }
}
