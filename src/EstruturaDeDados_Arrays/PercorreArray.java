package EstruturaDeDados_Arrays;

public class PercorreArray {
    public static void main(String[] args) {

        String [] nomes = new String[4];

        // declarando

        nomes[0] = "Diego";
        nomes[1] = "Jully";
        nomes[2] = "Felipe";
        nomes[3] = "Henry";

        //percorrendo a Arrys

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
