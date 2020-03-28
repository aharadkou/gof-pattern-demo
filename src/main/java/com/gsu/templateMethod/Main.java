package com.gsu.templateMethod;

import com.gsu.templateMethod.salad.AppleSalad;
import com.gsu.templateMethod.salad.SaladBox;
import com.gsu.templateMethod.salad.VinaigretteSalad;

public final class Main {

    public static void main(String[] args) {
        SaladBox appleSaladBox = new AppleSalad().getSalad();
        SaladBox vinaigretteSaladBox = new VinaigretteSalad().getSalad();
        System.out.println(appleSaladBox);
        System.out.println(vinaigretteSaladBox);
    }
}
