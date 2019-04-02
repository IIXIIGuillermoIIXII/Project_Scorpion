/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.applet.AudioClip;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author king-
 */
public class V_Menu extends JFrame{
    
    private JLabel etiq1,etiq2,etiq3;
    private JButton BtnAtras,BtnA,BtnE,BtnI,BtnO,BtnU;
    
    public void menu(){
        
        BtnAtras = new JButton ();
        BtnA = new JButton ();
        BtnE = new JButton ();
        BtnI = new JButton ();
        BtnO = new JButton ();
        BtnU = new JButton ();
        
        etiq1 = new JLabel ();
        etiq2 = new JLabel ();
        etiq3 = new JLabel (); 
        
        BtnAtras.setIcon(new ImageIcon(getClass().getResource("/Nombre de proyecto /nombre de la imgen"))); 
        BtnAtras.setContentAreaFilled(false);
        BtnAtras.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BtnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                //regresar a la ventana inicio
            
            }
        });
        
        this.getContentPane().add(BtnAtras);
        
        BtnA.setIcon(new ImageIcon(getClass().getResource("/  /A.png"))); 
        BtnA.setContentAreaFilled(false);
        BtnA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BtnA.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                /*
                
                Audio de la letra A
                
                
                */
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        
        BtnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
            //ventana de la letra A
            
            }
        });
        
        
        
        
        
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
    
    
    
    
    
}
