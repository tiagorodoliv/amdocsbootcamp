package com.company;

public class Ex1_array {
    public static void main(String[] args) {
        int[] vetor = {-5,-6,15,50,8,4};
        int i=0;

        System.out.println(vetor.length);

        while (i < (vetor.length)){
            System.out.println(vetor[i] + ",");
            i++;
        }

        for (int j =(vetor.length-1);j >= 0; j--){
            System.out.print(vetor[j] + ",");
        }
    }
}
