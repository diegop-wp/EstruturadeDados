package busca;

import busca.ex.Produto;

import java.util.HashMap;

public class Hashmap {
    private static final int TAMANHO= 1000000;

    public static void main(String[] args) {

        HashMap <Integer, Produto> map = new HashMap<Integer,Produto>();

        for (int i = 0; i < TAMANHO; i++) {
            map.put(i, new Produto(i, "produto "+i, i*20.00));
        }

        long starttime = System.currentTimeMillis();
        int codigoSerEncontrado = TAMANHO;

        for (int qtd = 0; qtd < TAMANHO; qtd++) {
            Produto p = map.get(codigoSerEncontrado);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de Execução: "+(endTime - starttime)+ "ms");
    }
}

// put(key, value) = Adiciona ou substitui o par chave-valor no mapa
// get(key) = Retorna o valor associado à chave, ou null se não existir
// remove(key) = Remove o par com a chave especificada
// containsKey(key) = Verifica se a chave existe no mapa
