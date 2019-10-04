/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layout_Ejem1;

import entrada.VentanaPrincipal;
import javax.swing.SwingUtilities;

/**
 *
 * @author Usuario DAM 2
 */
public class Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
         @Override
            public void run() {
                VentanaPrinc ventanaPrin = new VentanaPrinc();
                ventanaPrin.initGUI();
                ventanaPrin.acciones();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
}
