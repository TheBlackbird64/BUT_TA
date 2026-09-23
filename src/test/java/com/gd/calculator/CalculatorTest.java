package com.gd.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void add_devrait_calculer_la_somme_de_deux_int() {
        // GIVEN
        int opG = 2;
        int opD = 3;

        // WHEN
        int resultat = Calculator.add(opG, opD);

        // THEN
        assertThat(resultat).isEqualTo(5);
    }

    @ParameterizedTest
    @CsvSource({
        "0, 1, 1",
        "1, 2, 3",
        "-2, 2, 0",
        "0, 0, 0",
        "-1, -2, -3"
    })
    void add_devrait_retourner_addition_de_chaque_nombres(int a, int b, int expected) {
        //WHEN
        int res = Calculator.add(a, b);

        // THEN
        assertThat(res).isEqualTo(expected);
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

    @Test
    void ensemble_chiffres_devrait_retourner_les_chiffres_distincts_d_un_nombre() {
        //GIVEN
        int ensemble = 7679;

        // WHEN
        var resultat = new Calculator().ensembleChiffres(ensemble);

        // THEN
        assertThat(resultat).containsExactlyInAnyOrder(6, 7, 9);
    }

    @Test
    void ensemble_chiffres_devrait_ignorer_le_signe_d_un_nombre_negatif() {
        // WHEN
        var resultat = new Calculator().ensembleChiffres(-11);

        // THEN
        assertThat(resultat).containsExactly(1);
    }
}
