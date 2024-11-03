
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

        System.out.println("En un tablero de 8 * 8:");
        int size = 8;
        Tablero tablero = new Tablero(size);
        tablero.pintarTablero();
        tablero.printTablero();

        System.out.println("Nro de celdas Rojas: " + tablero.nroDeCeldasRojas());
        System.out.println("Nro de celdas Azules: " + ((size * size) - tablero.nroDeCeldasRojas()));
    }
}