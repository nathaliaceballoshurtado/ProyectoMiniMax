/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author daniel
 * 
 * En el aŕbol de juego, cada nodo corresponde a un posible estado de todo el tablero
 * incluyendo posiciones de los caballo ys de las manzanas restantes en dicho estado 
 * 
 * Entonces un Nodo es un estado del tablero de juego
 */
public class Nodo extends Base{
    
  //  private int matrix[][] ; 
    private Caballo max ; 
    private Caballo min ;
    private int manzanasRestantes; 
    private  ArrayList<int[]> coordsManzanas; 
    private int profundidad;
    
    
    
    Nodo ()
    {
        max = new Caballo();
        min = new Caballo(); 
        manzanasRestantes = 100;  
        profundidad = 0; 
        coordsManzanas = new ArrayList<int[]>();
    }

    public int getManzanasRestantes() {
        return manzanasRestantes;
    }

    public void setManzanasRestantes(int manzanasRestantes) {
        this.manzanasRestantes = manzanasRestantes;
    }

    public ArrayList<int[]> getCoordsManzanas() {
        return coordsManzanas;
    }

    public void setCoordsManzanas(ArrayList<int[]> coordsManzanas) {
        this.coordsManzanas = coordsManzanas;
    }
    
    public void moverCaballoMax(){
        
        int[][] auxMatrix = super.getMatrix();  // esta matrix es la que se modifica en cada rama de juego que
                                                //  representa el estado actual del juego.
        
         DefaultMutableTreeNode tmpJNode = new DefaultMutableTreeNode(auxMatrix);
         
                                                
       //posibles movs Max 
       //posibles movs min a partir de nuevo estado
       //posibles movs max a partir de nuevo estado
       //posibles movs min a partir de nuevo estado
       //posibles movs max a partir de nuevo estado
       //posibles movs min a partir de nuevo estado
       
       
       
       
    }
    
    
    
}
