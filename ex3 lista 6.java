package com.mycompany.lista6;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[10];

        List<Integer> numerosRepetidos = new ArrayList<>();

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º valor: ");
            vetor[i] = scanner.nextInt();

        }

        for (int i = 0; i < vetor.length; i++) {

            if (!numerosRepetidos.contains(vetor[i])) {

                for (int j = i + 1; j < vetor.length; j++) {

                    if (vetor[i] == vetor[j]) {

                        numerosRepetidos.add(vetor[i]);

                        break;

                    }

                }

            }

        }

        System.out.println("Números repetidos: " + numerosRepetidos);

    }

}
