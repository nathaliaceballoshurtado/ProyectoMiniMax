/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphazero.Gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author invitado
 */
public class Gui implements ActionListener{
    
    private static final int COLUMNAS = 6;
    private static final int FILAS = 6;
    JLabel[][] matrizLabel = new JLabel[FILAS][COLUMNAS];
    int[][] matrizNumeros = new int[10][10];
    JFrame v = new JFrame();
    JPanel panelGame = new JPanel();
    JPanel panelOptions = new JPanel();

    //public Gui(int[][] matriz) {
    
    public Gui() {
      //  matrizNumeros = matriz;
        panelOptions.setBackground(Color.white);
        v.add(panelGame);
       // v.add(panelOptions);
        v.getContentPane().setLayout(null);
        panelGame.setBounds(0, 0, 1000, 1000);
        panelGame.setForeground(Color.red);
        panelOptions.setBounds(1000, 0, 400, 1400);
        panelOptions.setForeground(Color.white);
        
        int x = 10;
        int y = 10;
        
        
         for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matrizLabel[i][j] = new JLabel();

                matrizLabel[i][j].setBounds(x + 10, y + 10, 200, 200);
                //   v.getContentPane().setForeground(Color.white);
                panelGame.add(matrizLabel[i][j]);
            }
        }

         valoresAsociadosImagenes(matrizNumeros, matrizLabel);
        
        
        v.pack();
        v.setVisible(true);
        v.setSize(800, 800);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
    }
    
    
    
    public void valoresAsociadosImagenes(int[][] matrix, JLabel[][] matrizLab) {
       int  contadorByN= 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                switch (matrix[i][j]) {
                    case 0:
          //0              matrizLab[i][j].setIcon(new ImageIcon(getClass().getResource("/iaproyecto/imagenes/espacio.jpg")));
                        break;
                    case 1:
          //              matrizLab[i][j].setIcon(new ImageIcon(getClass().getResource("/iaproyecto/imagenes/muro.jpg")));
                        break;
                    case 2:
          //              matrizLab[i][j].setIcon(new ImageIcon(getClass().getResource("/iaproyecto/imagenes/mario.gif")));
                        break;
                    case 3:
          //              matrizLab[i][j].setIcon(new ImageIcon(getClass().getResource("/iaproyecto/imagenes/flor.jpg")));
                        break;
                    case 4:
          //              matrizLab[i][j].setIcon(new ImageIcon(getClass().getResource("/iaproyecto/imagenes/tortuga.png")));
                        break;
                    case 5:
          //              matrizLab[i][j].setIcon(new ImageIcon(getClass().getResource("/iaproyecto/imagenes/princesa.jpg")));
                        break;
                    default:
                        break;
                }

            }
        }
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
