package com.company;

import java.util.Scanner;

public class Ex2_arrayVetor6Char {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoantes = 0;

        int i=0;
        do {
            System.out.print("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a")|
                letra.equalsIgnoreCase("e")|
                letra.equalsIgnoreCase("i")|
                letra.equalsIgnoreCase("o")|
                letra.equalsIgnoreCase("u"))){
                consoantes[i] = letra;
                qtdConsoantes++;
            }
            i++;
        }while (i < consoantes.length);

        System.out.println("Consoantes");
        for (String consoante : consoantes ) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes" + qtdConsoantes);
    }
}
