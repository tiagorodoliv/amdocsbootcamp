package com.company;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fatorial=0;

        System.out.print("Digite o número que deseja calcular o fatorial");
        fatorial = scan.nextInt();

        int multiplicacao=1;

        for (int i=fatorial;i>=1;i--){
          multiplicacao = multiplicacao * i;
        }

        System.out.println("Fatorial ="+ multiplicacao);
    }
}
