package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num=0;
        int resultado=0;

        System.out.println("Digite a tabuada que deseja:");
        num = scan.nextInt();

        for (int i=0;i<=10;i++){
            resultado = num * i;
            System.out.println(num + "X" + i + "=" + resultado);
        }
    }
}
