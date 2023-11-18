import java.util.Scanner;
public class suma{
    public static void main(String[]args){
        //variables
        int n1, n2, resultado;
        Scanner entrada=new Scanner(System.in);
        System.out.println("\n Ingresa el primer número: ");
        n1=entrada.nextInt();
        System.out.println("\nIngresa el segundo número: ");
        n2=entrada.nextInt();
        resultado=n1+n2;
        System.out.println("\n El resultado de la suma es: "+ resultado);
        entrada.close();
    } // el try ya no se usa porque no hay que mandar a llamar otra clase
}
