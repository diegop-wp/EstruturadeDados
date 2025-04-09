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

        System.out.println("Você buscou "+ lista.get(2).getValor());
    }
}
