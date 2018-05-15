/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author daniel
 */
public class Caballo extends Base {

    private int manzanas;
    private int posicion[];
    private int beneficio; //beneficio de llegar a una casilla 

    public Caballo() {
        manzanas = 0;
        posicion = new int[2];
        beneficio = 0;
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }

    public int getManzanas() {
        return manzanas;
    }

    public void setManzanas(int manzanas) {
        this.manzanas = manzanas;
    }

    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }

    //RETORNA LA COORDENADA A LA QUE SE LLEGA CUANDO MAX JUEGO SU TURNO
    public int[] crearArbolDeJuego() {
        int[] decision = new int[2];

        for (int i = 0; i < 1; i++) {
            int[][] matrixAux = super.getMatrix(); 
            
            for (int j = 0; j < 4; j++) {

                /*  
                 */
            }
        }

        return decision;
    }

    //RETORNA LOS POSIBLES MOVIMIENTOS PARA UN CABALLO, A PARTIR DE UNA ESTADO DE JUEGO INDICADO
    public void posiblesMovimientos() {
        int profundidadArbolJuego = 3;
        for (int j = 0; j < profundidadArbolJuego; j++) {

            int[] posicionActual = this.getPosicion();

            int[][] movimientosPosibles = new int[8][2];

            movimientosPosibles[0] = new int[]{posicionActual[0] + 1, posicionActual[1] - 2};  // Izquierda      
            movimientosPosibles[1] = new int[]{posicionActual[0] - 1, posicionActual[1] - 2};  // Izquierda

            movimientosPosibles[2] = new int[]{posicionActual[0] + 2, posicionActual[1] - 1}; // Abajo
            movimientosPosibles[3] = new int[]{posicionActual[0] + 2, posicionActual[1] + 1}; // Abajo

            movimientosPosibles[4] = new int[]{posicionActual[0] + 1, posicionActual[1] + 2}; // Derecha
            movimientosPosibles[5] = new int[]{posicionActual[0] - 1, posicionActual[1] + 2}; // Derecha

            movimientosPosibles[6] = new int[]{posicionActual[0] - 2, posicionActual[1] + 1}; // Arriba
            movimientosPosibles[7] = new int[]{posicionActual[0] - 2, posicionActual[1] - 1}; // Arriba

            for (int i = 0; i < movimientosPosibles.length; i++) {

                if (esPosicionValida(movimientosPosibles[0])) {

                    if (yaPasoPorCasilla(movimientosPosibles[0])) {

                        this.crearArbolDeJuego();

                        
                        
                        
                        if (super.esManzana(posicion)) {
                            manzanas++;
                        }
                    }

                }
            }
        }

    }

}
