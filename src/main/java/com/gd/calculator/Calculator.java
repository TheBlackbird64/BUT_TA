package com.gd.calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {

    public static int add(int opG, int opD) {
        return Math.addExact(opG, opD);
    }

    public static int divide(int opG, int opD) {
        if (opD == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return opG / opD;
    }

    public Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> set = new HashSet<>();

        String nb = Long.toString(Math.abs((long) pNombre));
        for (int i = 0; nb.length() > i; i++) {
            set.add(Integer.parseInt(nb.substring(i, i+1)));
        }

        return set;
    }
}
