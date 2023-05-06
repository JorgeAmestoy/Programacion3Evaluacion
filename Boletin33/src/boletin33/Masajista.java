
package boletin33;


public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private Integer anhosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, Integer anhosExperiencia) {
        this.titulacion = titulacion;
        this.anhosExperiencia = anhosExperiencia;
    }

    public Masajista(String titulacion, Integer anhosExperiencia, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anhosExperiencia = anhosExperiencia;
    }
    
    
    
    public void darMasaje(){
        System.out.println("El masajista da masajes");
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El masajista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista juega el partido");
    }

    @Override
    public String toString() {
        return super.toString()+"Masajista: " + "titulacion: " + titulacion + ", anhosExperiencia: " + anhosExperiencia;
    }
    
    
    
}
