package com.company;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=0;
        int par=0;
        int impar=0;
        //int array[] = new int[0];

        System.out.print("Digite quantos números deseja inserir:");
        num = scan.nextInt();

        for (int i=0;i<num;i++){
            System.out.print("Digite números inteiros:");
            num = scan.nextInt();

            if (num%2==0){
                par++;
            }else {
                impar++;
            }
        }


        System.out.println("Num:"+ num);
        System.out.println("Par:"+ par);
        System.out.println("Impar:"+ impar);
    }
}
