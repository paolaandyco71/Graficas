/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;
//PASO1 - IMPORTAR LIBRERIA GRAFICA
import javax.swing.*;//Libreria grafica estandar multiplataforma 
import java.awt.*;//Libreria Grafica del sistema operativo

/**
 *
 * @author LAB03
 */
public class Graficas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        JFrame miventana = new JFrame();//Creamos un objetos tipo JFrame
        miventana.setVisible(true);//Esta sentencia muestra la ventana
        miventana.setBounds(0,0,0,0);//Le asignamos tamaño a la ventana
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia sierra la ventana
        
        
    }
    
}
