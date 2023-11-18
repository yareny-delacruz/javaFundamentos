import java.util.Scanner;
import Entidades.Numero;

public class testNumero{
    public static void main(String[] args){
        try{
            Numero Onum=new Numero();
            Scanner Leer=new Scanner (System.in);
            System.out.println("\n Ingrese el número:  \t");
            double n= Leer.nextDouble();
            Onum.Num=n;
            System.out.println("  " + Onum.Primo());
            System.out.println("  " + Onum.Perfecto());
            System.out.println("Factorial= " + Onum.Factorial());
            Leer.close();
        }catch(Exception e) {}
    }
     
}
