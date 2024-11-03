public class Tablero {

    private String[][] tablero;

    //constructor:
    public Tablero(int size) {
        tablero = new String[size][size];
    }

    public void pintarTablero() {
        for (int i = 0; i < getTablero().length; i++) {
            for (int j = 0; j < getTablero().length; j++) {
                if (j <= i) {
                    getTablero()[i][j] = "[Rojo]";

                } else {
                    getTablero()[i][j] = "[Azul]";
                }

            }
        }
    }


    //dibuja el tablero en terminal:
    public void printTablero() {
        for (int i = 0; i < getTablero().length; i++) {
            for (int j = 0; j < getTablero().length; j++) {
                System.out.print(getTablero()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int nroDeCeldasRojas() {
        return 0;
    }

    //Getters & setters:
    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }
}
