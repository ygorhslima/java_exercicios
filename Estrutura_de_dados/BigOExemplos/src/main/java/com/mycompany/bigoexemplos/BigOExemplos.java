package com.mycompany.bigoexemplos;
public class BigOExemplos {

    public static void main(String[] args) {
        try{
            Vetor nomes = new Vetor(5);
            nomes.adicionar("Matheus");
            nomes.adicionar("Alessandra");
            nomes.adicionar("Lucas");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
