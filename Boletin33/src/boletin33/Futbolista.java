
package boletin33;


public class Futbolista extends SeleccionFutbol{
    
    private Integer dorsal;
    private String desenmarcacion;

    public Futbolista() {
    }

    public Futbolista(Integer dorsal, String desenmarcacion) {
        this.dorsal = dorsal;
        this.desenmarcacion = desenmarcacion;
    }

    public Futbolista(Integer dorsal, String desenmarcacion, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.desenmarcacion = desenmarcacion;
    }
    
    
    
    public void entrevista(){
        System.out.println("Entrevista ao futbolista");
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El futbolista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista juega el partido");
    }

    @Override
    public String toString() {
        return super.toString()+"Futbolista: " + "dorsal: " + dorsal + ", desenmarcacion: " + desenmarcacion;
    }
    
    
    
    
    
    
    
    
}
