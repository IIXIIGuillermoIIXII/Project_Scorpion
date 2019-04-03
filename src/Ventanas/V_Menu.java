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
    
     JLabel label1,label2,label3;
     JButton BtnAtras,BtnA,BtnE,BtnI,BtnO,BtnU;
    
    public V_Menu(){
        BtnAtras = new JButton ();
        BtnA = new JButton ();
        BtnE = new JButton ();
        BtnI = new JButton ();
        BtnO = new JButton ();
        BtnU = new JButton ();
        
        label1 = new JLabel ();
        label2 = new JLabel ();
        label3 = new JLabel ();
    
        BtnAtras.setIcon(new ImageIcon(getClass().getResource("/Imagenes_Acciones/Btn-Izq.png"))); 
        BtnAtras.setContentAreaFilled(false);
        BtnAtras.setBounds(0,0,90,100);
        BtnAtras.setCursor(new Cursor(Cursor.HAND_CURSOR));
        getContentPane().add(BtnAtras);
        BtnAtras.setVisible(true);
      
        BtnA.setIcon(new ImageIcon(getClass().getResource("/Imagenes_Letras/A.png"))); 
        BtnA.setContentAreaFilled(false);
        BtnA.setBounds(220,120,90,90);
        BtnA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        getContentPane().add(BtnA);
        BtnA.setVisible(true);
        
        BtnE.setIcon(new ImageIcon(getClass().getResource("/Imagenes_Letras/E.png")));
        BtnE.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BtnE.setContentAreaFilled(false);
        BtnE.setBounds(410,130,80,80);
        getContentPane().add(BtnI);
        BtnI.setVisible(true);
     
        BtnO.setIcon(new ImageIcon(getClass().getClass().getResource("/Imagenes_Letras/O.png")));
        BtnO.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BtnO.setBounds(200,300,100,90);
        BtnO.setContentAreaFilled(false);
        getContentPane().add(BtnO);
        BtnO.setVisible(true);
       
        BtnU.setIcon(new ImageIcon(this.getClass().getClass().getResource("/Imagenes_Letras/U.png")));
        BtnU.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BtnU.setContentAreaFilled(false);  
        BtnU.setBounds(400,310,90,80);
        getContentPane().add(BtnU);
        BtnU.setVisible(true);
        
        label1.setIcon(new ImageIcon(getClass().getClass().getResource("/Imagenes_Fondo/label-menu.jpg")));
        label1.setBounds(0,0,510,440);
        getContentPane().add(label1);
        label1.setVisible(true);
        
        label2.setIcon(new ImageIcon(getClass().getClass().getResource("/Imagenes_Animacion/POCOYO MENU.png")));
        label2.setBounds(20,150,200,250);
        getContentPane().add(label2);
        label2.setVisible(true);
       
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
}
