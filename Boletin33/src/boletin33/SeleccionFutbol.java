
package boletin33;


public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    
    protected Integer id;
    protected String nombre;
    protected String apellidos;
    protected Integer edad;

    public SeleccionFutbol(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public SeleccionFutbol() {
    }

    @Override
    public String toString() {
        return "id: " + id + ", nombre: " + nombre + ", apellidos: " + apellidos + ", edad: " + edad;
    }
    
    
    
    
    
    
    
    
}
