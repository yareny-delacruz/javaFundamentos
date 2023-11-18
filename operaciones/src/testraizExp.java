/* integrantes:
    Lopez Martínez Gabriel
    García Zavala Eduardo Gamaliel
    Molina Najera Eduardo Iván
    De la Cruz Martínez Fátima
 */
import java.util.Scanner;
public class testraizExp {
    public static void main(String[] args) {
        try{
            raizExp Onum=new raizExp(); 
            Scanner Leer=new Scanner(System.in);
            System.out.println("Ingresa un número");
            int num=Leer.nextInt();
            Onum.num=num;
            System.out.println("El resultado de la raiz es: "+ Onum.raiz());
            System.out.println("Ingresa un la potencia:");
            int pot=Leer.nextInt();
            System.out.println("El resultado de la potencia es: " + Onum.potencia(pot));            
            Leer.close();
        }finally{}
        
    }
}
