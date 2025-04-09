package EstruturaDeDados_Arrays;

public class ArraysMultimensionais {
    public static void main(String[] args) {

        int [][] dias = new int[2][2];

        dias[0][0] = 21;
        dias[0][1] = 24;

        dias[1][0] = 8;
        dias[1][1] = 4;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias.length; j++) {
                System.out.println(dias[i][j]);
            }
        }
    }
}
