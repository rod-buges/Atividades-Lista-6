package com.mycompany.lista6;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        float vetor[] = new float[10];

        int qtdNeg, sumPos;

        qtdNeg = sumPos = 0;

        Scanner array = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.print(" Informe o valor " + (i+1) + " --> ");
            vetor[i] = array.nextFloat();

            if (vetor[i] > 0) {
                sumPos += vetor[i];
            } else {
                qtdNeg++;
            }

        }

        System.out.println("A soma de números positivos é: " + sumPos);

        System.out.println("A quantidade de números negativos é: " + qtdNeg);

    }

}