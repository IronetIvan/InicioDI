/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
public class VentanaPrincipal extends JFrame implements ActionListener {

    /*public VentanaPrincipal(){
        initGUI();
    }*/
    //Metodo en el propio main
    Container container;
    JButton boton, botonDos;
    JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5,etiqueta6,etiqueta7,etiqueta8;
    JPanel panelsuperior, panelinferior, panelLeft, panelright;

    public void initGUI() {
        instancias();
        configurarContainer();
        this.setTitle("Ejemplo principal de ventana");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 500, 500);
        this.setLocationRelativeTo(null);
        //this.setExtendedState(MAXIMIZED_BOTH);
        //this.pack();
        this.setVisible(true);
    }

    private void configurarContainer() {
        /*container.setLayout(new FlowLayout(FlowLayout.CENTER,20, 20));
        //container.setLayout(new GridLayout(3, 2, 20, 20));
        //container.setLayout(new BorderLayout());
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(boton);
        container.add(botonDos);
        container.add(etiqueta1, BorderLayout.NORTH);
        container.add(etiqueta2, BorderLayout.SOUTH);
        container.add(etiqueta3, BorderLayout.EAST);
        container.add(etiqueta4, BorderLayout.WEST);*/
        container.setLayout(new BorderLayout());
        container.add(configpanelsuperior(), BorderLayout.NORTH);
        container.add(configpanelInferior(), FlowLayout.CENTER);
        container.add(configpanelLeft(), BoxLayout.X_AXIS);
    }

    private void instancias() {
        container = this.getContentPane();//elijo la capa en la que trabajar de tipo Contein
        boton = new JButton("Pulsar");
        botonDos = new JButton("Pulsar Dos");
        etiqueta1 = new JLabel("Posicion 1");
        etiqueta2 = new JLabel("Posicion 2");
        etiqueta3 = new JLabel("Posicion 3");
        etiqueta4 = new JLabel("Posicion 4");
        panelsuperior = new JPanel();
        panelinferior = new JPanel();
        panelLeft = new JPanel();
    }

    public JPanel configpanelsuperior() {
        panelsuperior.setLayout(new GridLayout(1, 3));
        panelsuperior.add(etiqueta1);
        panelsuperior.add(etiqueta2);
        panelsuperior.add(etiqueta3);
        panelsuperior.add(etiqueta4);
        return panelsuperior;
    }
    public JPanel configpanelInferior(){
        panelinferior.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelinferior.add(new JLabel("Inferior1"));
        panelinferior.add(new JLabel("Inferior2"));
        panelinferior.add(new JLabel("Inferior3"));
        panelinferior.add(new JLabel("Inferior4"));
        return panelinferior;
    }
    public JPanel configpanelLeft(){
        panelLeft.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
        panelLeft.add(new JLabel("Izquierda1"));
        panelLeft.add(new JLabel("Izquierda2"));
        panelLeft.add(new JLabel("Izquierda3"));
        panelLeft.add(new JLabel("Izquierda4"));
        return panelLeft;
    }

    public void acciones() {
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Boton 1 pulsado");
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
        botonDos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Boton 2 pulsado");
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            System.out.println("Pulsado boton 1");
        } else if (e.getSource() == botonDos) {
            System.out.println("Pulsado boton 2");
        }
    }
}
