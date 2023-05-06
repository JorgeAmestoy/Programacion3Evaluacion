
package boletin28;

import java.awt.Color;
import javax.swing.*;

public class Ventana {
    
    JFrame marco;
    JPanel panel;
    JButton botonPremer,botonLimpar;
    JTextField lTexto,lTexto2;
    JLabel etiqueta1,etiqueta2;
    JTextArea aTexto;
    
    
    
    public void componentes(){
        //instancio componentes
        marco = new JFrame("HOLA");
        panel = new JPanel();
        etiqueta1 = new JLabel(" NOME ");
        etiqueta2 = new JLabel(" PASSWORD ");
        lTexto = new JTextField();
        lTexto2 = new JTextField();
        botonPremer = new JButton();
        botonLimpar = new JButton();
        aTexto = new JTextArea("Area de texto");
        marco.setSize(600, 400);
        marco.add(panel);
        
        
        //caracteristicas
        marco.setBounds(0, 0, 800, 800);
        panel.setBounds(5, 5, 750, 750);
        etiqueta1.setBounds(50, 100, 250, 70);
        etiqueta2.setBounds(50, 200, 250, 70);
        lTexto.setBounds(150, 100, 200, 70);
        lTexto2.setBounds(150, 200, 200, 70);
        aTexto.setBounds(50, 300, 400, 150);
        botonPremer.setBounds(100, 500, 200, 70);
        botonLimpar.setBounds(350, 500, 200, 70);
        botonPremer.setText(" PREMER ");
        botonLimpar.setText(" LIMPAR ");
        //engado componentes al panel
        panel.setLayout(null);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
       panel.add(lTexto);
       panel.add(lTexto2);
       panel.add(aTexto);
       panel.add(botonPremer);
       panel.add(botonLimpar);
       cerrarVentana();
       
        
    }
    
    public void cerrarVentana(){
        
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true); 
        
    }
    
    
    
    
    
    
    
    
    
    
}
