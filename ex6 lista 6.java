package com.mycompany.lista6;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int i, x, q = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor");
            vet[i] = sc.nextInt();
        }
        System.out.println("Digite x");
        x = sc.nextInt();
        System.out.println("-----");

        for (i = 0; i < 10; i++) {
            if (vet[i] % x == 0) {
                System.out.println(vet[i]);
                q++;
            }
        }
        System.out.println("Quantidade: " + q);
    }

}
