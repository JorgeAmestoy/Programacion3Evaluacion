
package boletin33;

import java.util.ArrayList;


public class Boletin33 {


    public static void main(String[] args) {
   
        ArrayList<SeleccionFutbol> lista = new ArrayList<>();
        
        SeleccionFutbol fu = new Futbolista(20,"delantero",12,"cristiano","ronaldo",38);
        
        SeleccionFutbol ent = new Entrenador(30,20,"jorge","amestoy",25);
        
        SeleccionFutbol ma = new Masajista("fisio",30,2001,"angi","casella",36);
        
        SeleccionFutbol sel = new Seleccionador(20,"jorge","balsa",25);
        
        lista.add(fu);
        lista.add(ent);
        lista.add(ma);
        lista.add(sel);
        System.out.println(lista);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
