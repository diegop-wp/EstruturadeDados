package busca;

import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(12);
        priorityQueue.add(43);
        priorityQueue.add(33);

        System.out.println(priorityQueue.poll());

    }
}
