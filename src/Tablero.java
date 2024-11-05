public class Tablero {

    private String[][] tablero;

    //constructor:
    public Tablero(int size) {
        tablero = new String[size][size];
    }

    //Rellena el tablero de celdas rojas y azules:
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


    //dibuja el tablero en la terminal:
    public void printTablero() {
        for (int i = 0; i < getTablero().length; i++) {
            for (int j = 0; j < getTablero().length; j++) {
                System.out.print(getTablero()[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Calcula la cantidad de celdas rojas:
    public int nroDeCeldasRojas() {
        int celdasRojas = (tablero.length * (tablero.length + 1)) / 2;
        return celdasRojas;
    }

    //Calcula la cantidad de celdas azules:
    public int nroDeCeldasAzules() {
        int celdasAzules = (getTablero().length * getTablero().length) - nroDeCeldasRojas();
        return celdasAzules;
    }

    //Getters & setters:
    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }
}
