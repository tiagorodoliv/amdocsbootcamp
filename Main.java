package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int idade = 0;
        Scanner ler = new Scanner(System.in);

        String nome;

        while (true){
            System.out.print("Digite o nome do aluno: ");
            nome = ler.next();

            if (nome.equals("0")) break;

            System.out.print("Digite a idade: ");
            idade = ler.nextInt();

            System.out.println("Nome:" + nome + " Idade:" + idade);
        }

    }
}
