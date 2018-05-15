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
    
    private int[][] matrix; 
    
    
    
    public int[][] getMatrix()
    {
        return matrix;
    }
    
    public void setMatrix(int [][] matrix){
        
        this.matrix = matrix; 
    }
    
    
    public boolean esPosicionValida(int [] pos)
    {
        return false; 
    }
    
    public boolean yaPasoPorCasilla(int[] pos){ // otro parametro es el tablero como tal que aun no sé como vamos a representar (int [][] depronto ?) 
         
        return false ; 
    } 
    
    public boolean esManzana(int[] pos){
        if(matrix[pos[0]] [pos[1]] == 3)
        {
            return true; 
        }
        return false; 
    }
    
    public int calcularBeneficioNodo (){
        
        
        return 0;
    }
    
}
