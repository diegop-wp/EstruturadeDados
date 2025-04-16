package EstruturaDeDados_Lista;

public class Programa {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionar("AM");
        lista.adicionar("CF");
        lista.adicionar("SP");
        lista.adicionar("RJ");
        lista.adicionar("BH");
        lista.adicionar("TF");

    System.out.println("Tamanho: " + lista.getTamanho());
    System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
    System.out.println("Ultimo: " + lista.getUltimo().getValor());

        System.out.println("---Lista---");
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }

        // remover
        lista.remover("AM");
        lista.remover("CF");
        lista.remover("SP");
        lista.remover("RJ");
        lista.remover("BH");
        lista.remover("TF");
        lista.adicionar("SLA");

        System.out.println("---Lista atualizada---");
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }



    }
}
