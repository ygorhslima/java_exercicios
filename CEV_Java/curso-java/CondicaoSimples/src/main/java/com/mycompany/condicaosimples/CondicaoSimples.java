package com.mycompany.condicaosimples;

import java.util.Scanner;

public class CondicaoSimples {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1,n2,media;
        
        System.out.print("Digite a primeira nota: ");
        n1 = teclado.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        n2 = teclado.nextFloat();
        
        media = (n1 + n2) / 2;
        System.out.println("Sua média foi " + media);
        if(media > 9){
            System.out.println("Parabéns");
        }else{
            System.out.println("Que pena! tente na próxima");
        }        
    }
}
