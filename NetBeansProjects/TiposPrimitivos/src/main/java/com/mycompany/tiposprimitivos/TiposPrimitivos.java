package com.mycompany.tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        
        System.out.println("Digite o salário: ");
        float sal = teclado.nextFloat();
        
        
        System.out.printf("Olá %s Sua idade é %d, seu salário é %.2f",nome,idade,sal);
    }
    
}
