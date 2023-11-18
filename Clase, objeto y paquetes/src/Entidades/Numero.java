package Entidades;
public class Numero{
    //atributo 
    public double Num;
    //contructor vacío
    public Numero() {}
    //constructor común
    public Numero(double Num){
        this.Num=Num;
    }
    //Método que verifica si un número es primo
    public String Primo(){
        String men; 
        int a=0;
        for(double i=1; i<=Num; i++){
            if(Num % i == 0){
                a++;
            }                   
        }
        if(a==2){
            men="El número es Primo";
        }else
            men="El número no es Primo";
        return men; 
    }//fin método Primo
    //Método que verifica si el número es perfecto
    public String Perfecto(){
        String men;
        double a=0;
        for(double i=0;i<Num;i++){
            if(Num % i==0){
                a=a+i;
            }
        }    
            if(a==Num){
                men="El número es Perfecto";
            }else
                men="El número no es Perfecto";
                return men;    
    }//fin método Perfecto
    
    public double Factorial(){
        double fac=1;
        while(Num!=0){
            fac=fac*Num;
            Num--;
        }
        return fac;
    }//fin método Factorial
}//fin de la clase Número