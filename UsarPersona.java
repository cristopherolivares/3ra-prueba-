import ico.fes.Persona;
public class UsarPersona{
    
    public static void main( String [] args ){
        System.out.println("Programa usar persona");
        Persona per1 = new Persona();
        Persona per2 = new Persona();

        System.out.println( per1.getNombre() );

        per2.setNombre("Jesus");
        System.out.println(per2.getNombre());
    }
}