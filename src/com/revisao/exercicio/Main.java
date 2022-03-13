package com.revisao.exercicio;

/*
 Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
 */

public class Main {
    public static void main(String[] args) {
        int numero;
        for (numero = 0 ; numero <= 50 ; numero++) {
            if (numero%2 != 0) {
                System.out.print(numero + " ");
            }
        }
    }
}
