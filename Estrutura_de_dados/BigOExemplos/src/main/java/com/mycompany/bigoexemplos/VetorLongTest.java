package com.mycompany.bigoexemplos;
public class VetorLongTest {
     public static void main(String[] args) {
        // criando uma constante
        //100 - Tempo de execução: 1ms
        //1000 - Tempo de execução: 11ms
        //10000 - Tempo de execução: 84ms
        //100000 - Tempo de execução: 4687ms
        //1000000 -
        //tamanho da array 100000:Tempo de execução: 4722ms
        int TAMANHO = 1000000;
        long[] array = new long[TAMANHO];
        
        // gravando o tempo que iniciei o algoritmo para simulação
        long startTime = System.currentTimeMillis();
        
        for(int i=0; i<TAMANHO;i++){
            for(int j=0; j<TAMANHO;j++){
                array[i]+=j;
            }
        }
        
        long endTime = System.currentTimeMillis();
        
        // visualizar o tempo de execução
        System.out.println("Tempo de execução: " + (endTime - startTime) + "ms");
        
    }
}
