
package com.datos;

import com.amestoy.libreria.PedirDatos;
import com.entidades.EContratado;
import com.entidades.EDestajo;
import com.entidades.Empregado;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaEmpleados {
    
    Empregado contratado = new EContratado(PedirDatos.pedirString("DNI:"),PedirDatos.pedirString("Nombre:"),PedirDatos.pedirString("Apellidos:"),PedirDatos.pedirString("Fecha de ingreso: "),PedirDatos.pedirFloat("Salario:"));;
    Empregado destajo = new EDestajo(PedirDatos.pedirString("DNI:"),PedirDatos.pedirString("Nombre:"),PedirDatos.pedirString("Apellidos:"),PedirDatos.pedirString("Ingrese la fecha de ingreso en formato dd/mm/yyyy: "),PedirDatos.pedirEntero("Cantidad de clientes:"),PedirDatos.pedirFloat("Comisión por clientes:"));;
    
     public ArrayList<Empregado> agregarEmpleado(ArrayList<Empregado> lista) {
        lista.add(contratado);
        lista.add(destajo);
        return lista;
    }
    
    public static void mostrarLista(ArrayList<Empregado> lista) {
        //for each
        for (Empregado elemento : lista) {
            System.out.println(elemento);
        if(elemento instanceof EContratado){
            EContratado e=(EContratado)elemento;
            JOptionPane.showInputDialog(elemento.toString()+e.complementoSalarial());
        }
        }
    }
    
    
    
    
    
    
    
}
