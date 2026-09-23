package com.gd.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void statadd_devrait_calculer_la_somme_de_deux_int() {
        // GIVEN
        int opG = 2;
        int opD = 3;

        // WHEN
        int resultat = Calculator.add(opG, opD);

        // THEN
        assertThat(resultat).isEqualTo(5);
    }

    @Test
    void divide_devrait_calculer_le_quotient_de_deux_int() {
        // GIVEN
        int opG = 10;
        int opD = 2;

        // WHEN
        int resultat = Calculator.divide(opG, opD);

        // THEN
        assertThat(resultat).isEqualTo(5);
    }
}
