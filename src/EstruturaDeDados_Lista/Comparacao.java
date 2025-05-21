package EstruturaDeDados_Lista;

import java.util.ArrayList;

public class Comparacao {
    public static void main(String[] args) {

        ListaEncadeada <Integer> lista = new ListaEncadeada<Integer>();

        ArrayList<Integer> vetor = new ArrayList<Integer>();
        
        int limite =100000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;

        for (int i = 0; i < limite; i++) {
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("adicionou "+limite+" Elementos no vetor");
        System.out.println(tempoFinal - tempoInicial);

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i <limite; i++) {
            lista.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nadicionou "+limite+" Elementos no lista");
        System.out.println(tempoFinal - tempoInicial);


        //ler valores
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i <vetor.size(); i++) {
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\ntempo de leitura do vetor");
        System.out.println(tempoFinal - tempoInicial);

        tempoInicial = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = lista.getIterator();
        while (iterator.temProximo()){
             iterator.getProximo();
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\ntempo de leitura do lista");
        System.out.println(tempoFinal - tempoInicial);


    }
}
