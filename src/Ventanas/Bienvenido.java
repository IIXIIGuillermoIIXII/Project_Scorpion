/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author king-
 */
public class Bienvenido extends JFrame{
    

     private JComboBox combo1;
     private JButton BtnCreditos,BtnStart;
     private JLabel label;
    
    
    public Bienvenido(){
        
    this.setLayout(null);
    combo1 = new JComboBox<>();
    BtnCreditos = new JButton();
    BtnStart = new JButton();
    label= new javax.swing.JLabel();
    
    
    
    //COMBO BOX PARA ELEGIR EL LENGUAJE
    combo1.setBackground(new Color(0, 153, 255));
    combo1.setBounds(130, 110, 110, 50);
    combo1.setFont(new Font("Arial", 1, 14));
    combo1.setModel(new DefaultComboBoxModel<>(new String[] { "ESPAÑOL", "INGLES" }));
    combo1.setToolTipText("");
    combo1.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
    combo1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) { 
        
            String i=combo1.getSelectedItem().toString();
            
            if (i.equals("Español")){
                
                //OTRA VENTANA COMPA!
            }
            
            else if (i.equals("Ingles")){
                //OTRA VENTANA COMPA!
            
            }
                dispose(); 
        
        }
    });
    
    //BOTON DE CREDITOS
    
   // BtnCreditos.setIcon(new ImageIcon(getClass().getResource("/nombre del proyecto/nombre de la imagen con su formato")));
    BtnCreditos.setContentAreaFilled(false);
    BtnCreditos.setBounds(130, 310, 100, 70);
    BtnCreditos.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
    BtnCreditos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        
        //codigo de regreso a la ventana de incio
        
        dispose();
        }
        
    });
    
     //BtnStart.setIcon(new ImageIcon(getClass().getResource("/nombre del proyecto/nombre de la imagen con su formato")));
     BtnStart.setContentAreaFilled(false);
     BtnStart.setBounds(110, 200, 150, 100);
     BtnStart.setCursor(new Cursor(Cursor.HAND_CURSOR));
     BtnStart.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        /*String i= combo1.getSelectedItem().toString();{
            
            if (i.equals("Español")){
                AudioClip español;
                español = java.applet.Applet.newAudioClip(getClass().getResource("/NOMBRE DEL PROYECTO/NOMBRE DEL AUDIO.WAV"));
                español.play();
        }
            
            else if(i.equals("Ingles")){
            AudioClip ingles;
             ingles=java.applet.Applet.newAudioClip(getClass().getResource("/NOMBRE DEL PROYECTO/NOMBRE DEL AUDIO.WAV"));
             ingles.play();}}*/
        
        }
        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    });
     
     
     BtnStart.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) { 
        
        String i=combo1.getSelectedItem().toString();
            if (i.equals("Español")){
    
            /*MENU Bienvenido = new MENU();
             Bienvenido.setVisible(true);*/
            }
            
            else if (i.equals("Ingles")){
               /*MAIN Bienvenido = new MAIN();
               Bienvenido.setVisible(true);*/
            }
            
            dispose();
            
            }
    });
     //label.setIcon(new ImageIcon(getClass().getResource("/nombre del proyecto/nombre de la imagen con su formato")));
     label.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
     
     this.getContentPane().add(combo1);
     this.getContentPane().add(label);
     this.getContentPane().add(BtnCreditos);
     this.getContentPane().add(BtnStart);
     
     combo1.setVisible(true);
     label.setVisible(true);
     BtnCreditos.setVisible(true);
     BtnStart.setVisible(true);
     
     
    
    
    
    }//Iniciador de Componentes
    
} // Clase de Bienvenido
