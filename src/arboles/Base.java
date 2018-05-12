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
public abstract class Base {
    
    
    public boolean esPosicionValida(int [] pos)
    {
        return false; 
    }
    
    public boolean yaPasoPorCasilla(int[] pos){ // otro parametro es el tablero como tal que aun no sé como vamos a representar (int [][] depronto ?) 
         
        return false ; 
    }
    
    public int calcularBeneficioNodo (){
        
        
        return 0;
    }
    
}
