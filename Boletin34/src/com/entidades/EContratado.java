
package com.entidades;

import java.util.GregorianCalendar;


public class EContratado extends Empregado {
    
     private float salario;

    public EContratado() {
    }

    public EContratado(String dni, String nombre, String apellidos, String fechaIngreso, float salario) {
        super(dni, nombre, apellidos, fechaIngreso);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

   
    public float complementoSalarial() {
        String fechaIngreso = super.getFechaIngreso();
        String[] fechaPartes = fechaIngreso.split("/");
        int dia = Integer.parseInt(fechaPartes[0]);
        int mes = Integer.parseInt(fechaPartes[1]) - 1;
        int anho = Integer.parseInt(fechaPartes[2]);
        GregorianCalendar fecha1 = new GregorianCalendar(anho, mes, dia);
        GregorianCalendar fecha2 = new GregorianCalendar();
        long diferenciaEnMilisegundos = fecha1.getTimeInMillis() - fecha2.getTimeInMillis();
        double diferenciaAnhos = Math.floor(diferenciaEnMilisegundos / (365.25 * 24 * 60 * 60 * 1000));
        if (diferenciaAnhos >= 0 || diferenciaAnhos <= 3) {
            salario = (float) ((salario * 0.05) + salario);
        } else if (diferenciaAnhos >= 4 || diferenciaAnhos <= 7) {
            salario = (float) ((salario * 0.10) + salario);
        } else if (diferenciaAnhos >= 8 || diferenciaAnhos <= 15) {
            salario = (float) ((salario * 0.15) + salario);
        } else if (diferenciaAnhos > 15) {
            salario = (float) ((salario * 0.20) + salario);
        }
        return salario;
    }

    @Override
    public String toString() {
        return "EContratado{" + "salario=" + salario + '}';
    }
    
    
    
}
