package com.gsu.templateMethod.salad;

import com.gsu.templateMethod.ingredient.Apple;
import com.gsu.templateMethod.ingredient.Cheese;
import com.gsu.templateMethod.ingredient.Garlic;
import com.gsu.templateMethod.ingredient.Nuts;
import com.gsu.templateMethod.sauce.Mayonnaise;

public class VinaigretteSalad extends Salad {

    @Override
    public void cutIngredients(final SaladBox saladBox) {
        saladBox.addIngredients(
                new Apple(),
                new Cheese(),
                new Nuts(),
                new Garlic()
        );
    }

    @Override
    public void serveWithSauce(final SaladBox saladBox) {
        saladBox.addSauce(new Mayonnaise());
    }
}
