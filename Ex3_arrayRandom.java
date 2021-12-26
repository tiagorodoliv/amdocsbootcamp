package com.company;

import java.util.Random;

public class Ex3_arrayRandom {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for (int i=0; i < numAleatorios.length;i++){
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
        }

        for (int numero : numAleatorios) {
            System.out.println(numero + "");
        }
    }

}
