
/**
 * Considera a un muchacho que se deleita pintando su tablero de ajedrez. Su objetivo es saturar cada celda con
 * tonos rojos o azules.
 * En busca de darle una identidad propia, procura tener un equilibrio entre los espacios rojos y azules,
 * previniendo que dos filas o columnas contengan el mismo número de celdas rojas. ¿Lograría pintar el tablero de
 * ajedrez siguiendo estas pautas?
 * ¿Qué acontecería si, en vez de un tablero de ajedrez común de 8x8, tuviera uno monumental de 1000x1000?
 */


public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        int size = 8;
        String[][] tablero = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j >= 0 && j <= i) {
                    tablero[i][j] = "[Rojo]";

                } else {
                    tablero[i][j] = "[Azul]";
                }

            }
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Nro de celdas Rojas: " + (size * (size + 1)) / 2);
        System.out.println("Nro de celdas Azules: " + ((size * size) - (size * (size + 1)) / 2));
    }
}