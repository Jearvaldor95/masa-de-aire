//Programa que calcula el valor de la masa
package masadeaire;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class MasaDeAire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner calcular = new Scanner(System.in);
        float Presion, Volumen, Temperatura, masa;
        System.out.println("Ingrese el valor de la presion");
        Presion= calcular.nextFloat();
        System.out.println("Ingrese el valor del volumen");
        Volumen= calcular.nextFloat();
        System.out.println("Ingrese el valor de la temperatura");
        Temperatura= calcular.nextFloat();
        masa= (float) ((Presion * Volumen)/(0.37 * (Temperatura + 460)));
        System.out.println("El valor de la masa es: "+masa);
    }
    
}
