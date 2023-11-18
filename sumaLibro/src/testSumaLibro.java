import java.util.Scanner;

public class testSumaLibro {
    public static void main(String[] args){
        //para que ejecute lo que le vamos a poner
        try{
            sumaLibro Onum=new sumaLibro();//objeto
            Scanner entrada=new Scanner(System.in); //los argumentos para entrada y me marca error porque tengoq ue cerrarlo
            System.out.println("\n Ingresa el primer número: ");
            int n1=entrada.nextInt();
            Onum.n1=n1; 
            System.out.println("\n Ingresa el segundo número: ");
            int n2=entrada.nextInt();
            Onum.n2=n2; 
            System.out.println("\n El resultado de la suma es: " + Onum.suma()); //mandar llamar el método suma
            entrada.close(); //el recolector de basura no cierra este objeto
        }finally{} //para terminar el try
        //el catch es para que tome la exception
        //el finally omite el error 
    }
}
