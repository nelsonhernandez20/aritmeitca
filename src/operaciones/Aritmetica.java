
package operaciones;


public class Aritmetica {
    int a;
    int b;
    
    public Aritmetica(){
        System.out.println("Se esta ejecutando un constructor sin argumentos");
    
    }
    
    public Aritmetica(int a, int b){
    this.a= a;
    this.b= b;
        System.out.println("se esta ejecutando un constructor con argumentos");
    }
    
 public void sumar(){
     int resultado = a+b;
     System.out.println("resultado = " + resultado);
 
 }
 
 public int sumarConRetorno(){
     int resultado = a+b;
     return resultado;
 }
 
 public int sumarConArgumentos(int a, int b){
   this.a = a;
   this.b = b;
   return sumarConRetorno();
 }
}
