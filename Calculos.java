import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tú mes de nacimiento (en números): ");
        int a = scanner.nextInt();

        System.out.print("Ingresa tú día de nacimiento: ");
        int b = scanner.nextInt();

        scanner.close();
    

       int suma = a + b;
       int resta = a - b;
       int multiplicacion = a * b;
       double division = (double) a / b;

       DecimalFormat df = new DecimalFormat("#,##0.00");


        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicación es " + multiplicacion);
        System.out.println("El resultado de la division es " + df.format(division));
    }
}