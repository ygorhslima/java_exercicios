package org.example;

import org.example.encapsulamento.ControleRemoto;
import org.example.heranca.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno a;
        a = new Aluno("João",19,"Masculino",121313,"Medicina");
        System.out.println(a.toString());
    }
}