public class Reto{
    public static String suma(int valor1, int valor2) {

        int resultado = valor1 + valor2;
        String salida = ("El resultado es: " + resultado); 
        
        return salida;
    }
 
 
    public static void main(String[]args) {
 
        Reto reto = new Reto();
        String resultado = reto.suma(10,5);
 
        System.out.println(resultado);
    }
 
}


