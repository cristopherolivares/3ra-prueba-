package ico.fes;

public class Persona{

    private String nombre; // atributos
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private String curp;

    public Persona(){  // método constructor
        nombre="No asignado";
    }
    /*
     Método de acceso getNombre()
       para el atributo nombre 
     no recibe parámetro de entrada, pero regresa el valor nombre
    */
    public String getNombre(){
        return this.nombre; 
    } 
    public void setNombre(String n ){
        this.nombre = n;
    }
}