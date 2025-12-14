package com.mycompany.ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtd_alunos = 1;

        String nome_aluno[] = new String[10];        
        float media[] = new float[10];
        float n1[] = new float[10];
        float n2[] = new float[10];
        float n3[] = new float[10];
        float n4[] = new float[10];
        
        int cont;
        
        for(cont = 0; cont < qtd_alunos; cont++){
            System.out.print("Informe nome do aluno: ");
            nome_aluno[cont] = teclado.next();
            
            System.out.print("Nota 1: ");
            n1[cont] = teclado.nextFloat();
            
            System.out.print("Nota 2: ");
            n2[cont] = teclado.nextFloat();
            
            System.out.print("Nota 3: ");
            n3[cont] = teclado.nextFloat();
            
            System.out.print("Nota 4: ");
            n4[cont] = teclado.nextFloat();
            
            media[cont] = (n1[cont] + n2[cont] + n3[cont] + n4[cont]) / 4;
        }
        System.out.println("----------- Resultados -----------");
        for(cont = 0; cont < qtd_alunos; cont++){
            System.out.println("--------------------------------------------");
            System.out.printf("Aluno: %s\n", nome_aluno[cont]);
            System.out.printf("Nota 1: %.2f\n",n1[cont]);
            System.out.printf("Nota 2: %.2f\n",n2[cont]);
            System.out.printf("Nota 3: %.2f\n",n3[cont]);
            System.out.printf("Nota 4: %.2f\n",n4[cont]);
            System.out.printf("Média: %.2f\n", media[cont]);
            System.out.println("--------------------------------------------");
        }
    }
}
