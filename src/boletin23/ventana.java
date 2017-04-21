/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author ggarciamartinez
 */
public class ventana {
    JFrame fram=new JFrame("BOL 23");
    JPanel panel=new JPanel();
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JLabel etiqueta=new JLabel("Nombre");
    JButton bot1=new JButton("Pulsar");
    JButton bot2=new JButton("Limpiar");
    String[] lista= {"Elem1", "Elem2","Elem3"};
    JList lis=new JList(lista);
    
    
    JPasswordField pass=new JPasswordField("           ");
    JTextArea tx=new JTextArea("Area de texto");
    JButton bot3=new JButton("Botón");
    
    public void crearVent(){
   
      fram.getContentPane().setBackground(Color.white);
      fram.setSize(600, 600);
      fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fram.setVisible(true);
      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      panel.add(panel1, BorderLayout.NORTH);
      panel.add(panel2, BorderLayout.CENTER);
      fram.add(panel);
    }
    public void panel1(){
      panel1.setLayout(null);
      panel1.setBackground(Color.lightGray);
      panel1.setSize(300, 300);
      etiqueta.setBounds(100, 100, 100, 60);
      pass.setBounds(100, 150, 100, 60);
      pass.setSize(100,20);
      
      bot1.setBounds(120, 250, 100, 50);
      bot2.setBounds(275, 250, 100, 50);
      panel1.add(etiqueta);
      panel1.add(bot1);
      panel1.add(bot2);
      panel1.add(pass);
    
    }  
    public void panel2(){
      panel2.setLayout(null);
      tx.setBounds(450, 100, 100, 120); 
      bot3.setBounds(270, 200, 100, 50);
      lis.setBounds(100, 100, 100, 120);
      panel2.add(tx);
      panel2.add(bot3);
      panel2.add(lis);
      panel2.setBackground(Color.DARK_GRAY);  
    } 
}
