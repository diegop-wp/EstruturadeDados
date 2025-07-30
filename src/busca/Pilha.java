package busca;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {

        Stack <String> stack = new Stack<String>();

        stack.push("Diego");
        stack.push("Jully");

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}

// pop() = Remove o item do topo da pilha
//peek() = Olha o item do topo sem remover
//push() = Coloca o item x no topo da pilha
//search(Object o) = Procura o objeto o dentro da pilha.