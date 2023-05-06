package boletin33;

public class Seleccionador extends SeleccionFutbol {

    public Seleccionador() {
    }

    public Seleccionador(Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
    }
    
    


    public void seleccionarXogador() {
        System.out.println("El seleccionador selecciona jugadores");
    }

    @Override
    public void concentrarse() {
        System.out.println("El seleccionador se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El seleccionador viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El seleccionador entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El seleccionador juega el partido");
    }

    @Override
    public String toString() {
        return "Seleccionador: "+super.toString();
    }
    
    

}
