
package com.entidades;


public class EDestajo extends Empregado {
    
     private int numeroCliente;
    private float comisionPorCliente;

    public EDestajo() {
    }

    public EDestajo(String dni, String nombre, String apellidos, String fechaIngreso, int numeroCliente, float comisionPorCliente) {
        super(dni, nombre, apellidos, fechaIngreso);
        this.numeroCliente = numeroCliente;
        this.comisionPorCliente = comisionPorCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    @Override
    public String toString() {
        return "EDestajo{" + "numeroCliente=" + numeroCliente + ", comisionPorCliente=" + comisionPorCliente + '}';
    }

    
    
    
    
    
    
    
    
}
