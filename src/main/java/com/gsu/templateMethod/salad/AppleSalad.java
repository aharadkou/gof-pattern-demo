package com.gsu.templateMethod.salad;

import com.gsu.templateMethod.ingredient.*;
import com.gsu.templateMethod.sauce.Oil;

public class AppleSalad extends Salad {

    @Override
    public void cutIngredients(final SaladBox saladBox) {
        saladBox.addIngredients(
            new Beet(),
            new Cabbage(),
            new Potatoes(),
            new Cucumber(),
            new Leek()
        );
    }

    @Override
    public void serveWithSauce(final SaladBox saladBox) {
        saladBox.addSauce(new Oil());
    }
}
