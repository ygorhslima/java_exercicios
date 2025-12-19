/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bigoexemplos;

/**
 *
 * @author ygor
 */
public class Vetor {
    private int tamanho;
    private final String[] elementos;
    
    public Vetor(final int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    public void adicionar(final String elemento) throws Exception{
        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
        }else{
            throw new Exception("Vetor já cheio");
        }
    }
}
