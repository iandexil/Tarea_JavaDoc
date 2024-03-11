/**
 * La clase Calculadora por medio de metodos simples hace operaciones simples (suma y resta).
 */
public class Calculadora {

    /**
     * Suma dos números.
      @param a El primer número.
      @param b El segundo número.
      @return EL resultado de la suma.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números.
     @param a El número del que se resta.
     @param b El número que se resta.
     @return La resta de los dos números.
     */
    public int restar(int a, int b) {
        return a - b;
    }
    /**
     * Uso de la calculadora
      @param args argumentos para la linea de comandos
     */
    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();

        // Salida por pantalla de el resultado de las operaciones
        int suma = miCalculadora.sumar(10, 5);
        int resta = miCalculadora.restar(20, 8);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
    }
}
