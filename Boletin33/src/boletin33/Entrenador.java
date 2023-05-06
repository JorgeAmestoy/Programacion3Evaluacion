
package boletin33;

public class Entrenador extends SeleccionFutbol{
    
    private Integer idFederacion;

    public Entrenador() {
    }

    
    
    public Entrenador(Integer idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(Integer idFederacion, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    
    
    public void planificarEntrenamiento(){
        System.out.println("El entrenadr planifica el entrenamiento");
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador viaja");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El entrenador juega el partido");
    }

    @Override
    public String toString() {
        return super.toString()+"Entrenador: " + "idFederacion: " + idFederacion;
    }
    
    
    
    
}
