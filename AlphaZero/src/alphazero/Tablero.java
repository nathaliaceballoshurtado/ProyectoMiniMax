/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphazero;

/**
 *
 * @author invitado
 */
public class Tablero {

    int[][] matriz = new int[6][6];

    public Tablero(int numeroManzanas) {
        llenarMatriz(numeroManzanas);
    }

    public void llenarMatriz(int manzanas) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = 0;
            }
        }

        int jugador1Fila = (int) (Math.random() * 5);
        int jugador1Columna = (int) (Math.random() * 5);
        
        int jugador2Fila = (int) (Math.random() * 5);
        int jugador2Columna = (int) (Math.random() * 5);
        
        
        //While que garantiza que las pocisiones del caballo blanco y el negro serán diferentes
        while(jugador1Fila==jugador2Fila){
            jugador2Fila = (int) (Math.random() * 5);
            jugador2Columna = (int) (Math.random() * 5);
        }

        matriz[jugador1Fila][jugador1Columna] = 4;
        matriz[jugador2Fila][jugador2Columna] = 3;

        for (int i = 0; i < manzanas; i++) {
            int fila = (int) (Math.random() * 5);
            int columna = (int) (Math.random() * 5);
            matriz[fila][columna] = 2;
        }
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + " ");
            }
             System.out.println();
        }
        
    }

    public int[] generarPosicionesDiferentes() {
        int Fila = (int) (Math.random() * 5);
        int Columna = (int) (Math.random() * 5);
        return null;
    }
}
