/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada;

import javax.swing.SwingUtilities;

/**
 *
 * @author Usuario DAM 2
 */
public class entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                ventanaPrincipal.initGUI();
                ventanaPrincipal.acciones();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }

}
