
package com.mycompany.condicoesaninhadas;

import java.util.Date;
import java.util.Scanner;


public class CondicoesAninhadas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a data de nascimento: ");
        int data_nasc = teclado.nextInt();
        int idade = 2025 - data_nasc;
        
        if(idade < 16){
            System.out.println("Não vota");
        }else if((idade >= 16 && idade < 18) || (idade > 70)){
            System.out.println("Opcional");
        }else{
            System.out.println("Obrigatório");
        }
    }
}
