
package operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a=2;
        aritmetica1.b=2;
        aritmetica1.sumar();
        System.out.println("\n");
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(13, 6);
        System.out.println("resultado = " + resultado);
        System.out.println("\n");
        Aritmetica aritmetica2 = new Aritmetica(5, 30);
        System.out.println(aritmetica2.a);
        System.out.println(aritmetica2.b);
        resultado=aritmetica2.sumarConRetorno();
        System.out.println("resultado = " + resultado);
    }
}
