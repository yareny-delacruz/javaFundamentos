/* integrantes:
    Lopez Martínez Gabriel
    García Zavala Eduardo Gamaliel
    Molina Najera Eduardo Iván
    De la Cruz Martínez Fátima Yareny
 */
public class raizExp{
    //atributos
    public int num;
    //constructor 
    public raizExp(int num){
        this.num=num;
    }

    public raizExp(){
        this.num=0;
    }
    //métodos raiz
    public double raiz(){
         double raiz=Math.sqrt(num);
         return raiz;
    }
    //método potencia
    public int potencia(int pot){
        int i;
        int resul=1;
        for(i=0; i< pot; i++){
            resul=resul*pot;
        }
        return resul;
    }
}