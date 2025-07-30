package busca;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Java");
        queue.offer("Python");

        System.out.println(queue.poll());


    }
}
//peek() =  visualiza o primeiro sem remover
//poll() = Remove e retorna o primeiro elemento da fila
//offer =Se a fila não tiver capacidade para receber mais elementos, retorna false (não lança exceção).