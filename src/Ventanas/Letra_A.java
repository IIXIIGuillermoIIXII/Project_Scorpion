package Ventanas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author king-
 */
public class Letra_A extends JFrame{
    
    JButton BtnIzq,btnDr,btnSig,btnAra,btnArd,btnArb,
            btnPq,btnMd,btnGd;
    JLabel labelLetra,labelFondo,labelBorde;

    public Letra_A(){
        setLayout(null);
        /*
        
        JFrame V = new JFrame();
        V.getContentPane().setLayout(new FlowLayout());
        
        */
        
        BtnIzq = new JButton ();
        btnSig = new JButton ();
        btnDr = new JButton ();
        
        
        btnAra = new JButton ();
        btnArd = new JButton ();
        btnArb = new JButton ();
        
        btnPq = new JButton ();
        btnMd = new JButton ();
        btnGd = new JButton ();
        
        labelBorde = new JLabel ();
        labelFondo = new JLabel ();
        labelLetra = new JLabel ();
        
        BtnIzq.setIcon(new ImageIcon(getClass().getResource("/Imagenes_Acciones/Btn-Izq.png"))); 
        BtnIzq.setContentAreaFilled(false);
        BtnIzq.setBounds(0,0,90,100);
        BtnIzq.setFocusPainted(true);
        BtnIzq.setBorderPainted(false);
        BtnIzq.setCursor(new Cursor(Cursor.HAND_CURSOR));
        getContentPane().add(BtnIzq);
        BtnIzq.setVisible(true);
        
        
        btnDr.setIcon(new ImageIcon(getClass().getClass().getResource("/Imagenes_Acciones/Btn-der.png")));
        btnDr.setBounds(90,10,70,80);
        btnDr.setBorderPainted(false);
        btnDr.setFocusPainted(true);
        btnDr.setContentAreaFilled(false);
        btnDr.setCursor(new Cursor(Cursor.HAND_CURSOR));
        getContentPane().add(btnDr);
        btnDr.setVisible(true);
        
        btnSig.setIcon(new ImageIcon(getClass().getClass().getResource("/Imagenes_Acciones/Btn-sig.png")));
        btnSig.setBounds(180,380,220,60);
        btnSig.setBorderPainted(false);
        btnSig.setContentAreaFilled(false);
        btnSig.setFocusPainted(true);
        btnSig.setCursor(new Cursor(Cursor.HAND_CURSOR));
        getContentPane().add(btnSig);
        btnSig.setVisible(true);
        
        
        labelLetra.setIcon(new ImageIcon(getClass().getClass().getResource("/Imagenes_Letras/A.png")));
        labelLetra.setBounds(230,10,100,100);
        getContentPane().add(labelLetra);
        labelLetra.setVisible(true);
        
        labelBorde.setIcon(new ImageIcon(getClass().getClass().getClass().getResource("/Imagenes_Acciones/BordeS.png")));
        labelBorde.setBounds(-5,0,590,40);
        getContentPane().add(labelBorde);
        labelBorde.setVisible(true);
     
        btnGd.setBackground(new Color(255, 0, 51));
        btnGd.setForeground(new Color(255, 255, 255));
        btnGd.setBounds(440,280,110,60);
        btnGd.setText("Grande");
        btnGd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        getContentPane().add(btnGd);
        btnGd.setVisible(true);
        
        
        btnMd.setBackground(new Color(255, 0, 51));
        btnMd.setForeground(new Color(255, 255, 255));
        btnMd.setBounds(230,300,110,40);
        btnMd.setText("Mediano");
        btnMd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        getContentPane().add(btnMd);
        btnMd.setVisible(true);
        
        
        btnPq.setBackground(new Color(255, 0, 51));
        btnPq.setForeground(new Color(255, 255, 255));
        btnPq.setBounds(50,320,80,32);
        btnPq.setText("pequeño");
        btnPq.setCursor(new Cursor(Cursor.HAND_CURSOR));
        getContentPane().add(btnPq);
        btnPq.setVisible(true);
        
        btnAra.setIcon(new ImageIcon(getClass().getClass().getResource("/Imagenes_Animacion/ARAÑA.png")));
        btnAra.setBounds(40,220,100,50);
        btnAra.setBorderPainted(false);
        btnAra.setContentAreaFilled(false);
        btnAra.setCursor(new Cursor(Cursor.HAND_CURSOR));
        getContentPane().add(btnAra);
        btnAra.setVisible(true);
        
        btnArd.setIcon(new ImageIcon(getClass().getClass().getResource("/Imagenes_Animacion/ARDILLA.png")));
        btnArd.setBounds(220,120,130,150);
        btnArd.setBorderPainted(false);
        btnArd.setContentAreaFilled(false);
        btnArd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        getContentPane().add(btnArd);
        btnArd.setVisible(true);
        
        btnArb.setIcon(new ImageIcon(getClass().getClass().getResource("/Imagenes_Animacion/Arbol.png")));
        btnArb.setBounds(370,70,210,210);
        btnArb.setBorderPainted(false);
        btnArb.setContentAreaFilled(false);
        btnArb.setCursor(new Cursor(Cursor.HAND_CURSOR));
        getContentPane().add(btnArb);
        btnArb.setVisible(true);
        
        
        labelFondo.setIcon(new ImageIcon(getClass().getClass().getResource("/Imagenes_Fondo/label-A.jpg")));
        labelFondo.setBounds(0,0,600,450);
        getContentPane().add(labelFondo);
        labelFondo.setVisible(true);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    
    }
    
}
