package com.ead.authuser.dtos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TesteAplication {

    public static void main(String[] args) {
        List<Double> result = Arrays.asList(15.2, 12.4, 13.0);

        Collections.sort(result);

        for (Double mi : result) {
            System.out.println();
        }
    }
}
