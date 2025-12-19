package com.mycompany.bigoexemplos;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        //100 - Tempo de execução: 0ms
        //1000 - Tempo de execução: 1ms
        //10000 - Tempo de execução: 2ms
        //100000 - Tempo de execução: 11ms
        //1000000 - Tempo de execução: 57ms
        int TAMANHO = 1000;

        HashMap<Integer, Produto> mapa = new HashMap<Integer, Produto>();

        int i;

        for (i = 1; i <= TAMANHO; i++) {
            mapa.put(i, new Produto(i, "Produto" + i, i * 20.00));
        }
 

        long startTime = System.currentTimeMillis();
        for (int qtd = 0; qtd <= TAMANHO; qtd++) {
            Produto p = mapa.get(qtd);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (endTime - startTime) + "ms");

    }
}
