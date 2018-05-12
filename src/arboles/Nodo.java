/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.ArrayList;

/**
 *
 * @author daniel
 * 
 * En el aŕbol de juego, cada nodo corresponde a un posible estado de todo el tablero
 * incluyendo posiciones de los caballo ys de las manzanas restantes en dicho estado 
 * 
 * Entonces un Nodo es un estado del tablero de juego
 */
public class Nodo {
    
    private int matrix[][] ; 
    private Caballo max ; 
    private Caballo min ;
    private  ArrayList<int[][]> coordsManzanas; 
    
    
    
    Nodo ()
    {
    
        
    }
    
    
    
}
