/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layout_Ejem1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Usuario DAM 2
 */
public class VentanaPrinc extends JFrame {
    
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    JLabel etiqueta;
    Container container;
    JPanel panelcentral;
    public void ventanaCorregida(){
        initGUI();
    }
   private void initGUI(){
       instancias();
       this.setTitle("Ejemplo principal de ventana");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
   }
   private void instancias(){
       b1 = new JButton("Ir al uno");
       b2 = new JButton("Ir al dos");
       b3 = new JButton("Ir al tres");
       b4 = new JButton("Ir al cuatro");
       b5 = new JButton("Ir al cinco");
       b6 = new JButton("Ir al seis");
       etiqueta = new JLabel("Ejemplo");
       container = this.getContentPane();
       panelcentral = new JPanel();
   }
}
