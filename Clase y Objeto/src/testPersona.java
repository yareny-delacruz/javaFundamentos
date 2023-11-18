public class testPersona {
    public static void main(String[] args){
        System.out.println("\n Cédula \tNombre  Apellido  Sexo    Edad");
        System.out.println("\n ---------------------------------------------");

        //declaración e instanciación de objetos
        //invocación al constructor ordinario
        Persona p=new Persona("0603100533", "Juan", "Perez", 'M', 20);
        Persona p1=new Persona("1234567890", "Ana", "Luna", 'F', 30);
        Persona p2=new Persona(p); //onvoca al constructor por defecto o vacío
        Persona p3=new Persona(); //invoca al constructor copia

        //envio de un mensaje, es decir invocación a un método perzonalizado
        System.out.println(""+p.toString());
        System.out.println(""+p1.toString());
        System.out.println(""+p2.toString());
        System.out.println(""+p3.toString());
    }
}
