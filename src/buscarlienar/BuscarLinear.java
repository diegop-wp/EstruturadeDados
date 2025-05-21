package buscarlienar;

import java.util.Scanner;

public class BuscarLinear {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);
        }

        System.out.println("Qual valor você quer buscar?");
        Scanner entrada = new Scanner(System.in);
        int buscar = entrada.nextInt();

        boolean achou = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == buscar) {
                achou = true;
                break;
            }
        }
        if (achou == true) {
            System.out.println("Achou");
        } else {
            System.out.println("Não achou");
        }
    }
}
