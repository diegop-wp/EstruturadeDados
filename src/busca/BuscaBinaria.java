package busca;

import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;

            System.out.print (vetor[i] + " ");

        }

        Scanner teclado = new Scanner(System.in);
        System.out.println("\n\n Diegite numero quer você quer buscar: ");
        int busca = teclado.nextInt();

        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            if (vetor[meio] == busca) {
                achou = true;
                break;
            } else if (vetor[meio] < busca) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        if (achou == true){
            System.out.println("Valor Encontrado");
        }else {
            System.out.println("Valor Não Encontrado");
        }
    }
}
