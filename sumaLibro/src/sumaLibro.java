public class sumaLibro{
    //atributos
    public int n1, n2, resultado;
    //el constructor es para que le digas a JAVA que estás creando una clase.
    //constructor vacio
    public sumaLibro() {}
    //constructor comun
    public sumaLibro(int n1, int n2, int resultado){
        this.n1=0;
        this.n2=0;
        this.resultado=0;  
    }
    //método que suma
    public int suma(){
        return resultado=n1+n2; //return para que pueda usar el resultado
        
    }
}