package buebuja;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Buebuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,aux; // Declaro variables.

        System.out.print("Digite la cantidad de elementos del arreglo: ");
        nElementos = entrada.nextInt();
        arreglo = new int[nElementos]; //asignacion de elementos.

        // Ingresamos los valores al Arreglo.
        for(int i = 0; i < nElementos; i++) {
            System.out.print("Digite valor numero "+(i+1)+" = ");
            arreglo[i] = entrada.nextInt();
        }

        // este es el metodo burbuja, lo que hace es organizar los valores. ⬇️⬇️
        for(int i = 0; i < (nElementos - 1); i++) {
            for(int j = 0; j < (nElementos - 1); j++) {
                if(arreglo[j] > arreglo[j+1]) { // si numeroActual > numeroSiguiente.
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1]; // este bloque de codigo es para intercambiar los valores del indice entre ellos.
                    arreglo[j+1] = aux;
                }
            }
        }
        
        // Aca mostramos todo el arreglo ordenado de menor a mayor.🔼🔼
        System.out.println("\n\nArreglo de menor a mayor: ");
        for(int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + ",");
        }
        System.out.println("\n\nArreglo de mayor a menor");
        
        // Aca mostramos todo el arreglo ordenado de mayor a menor.🔼🔼
        for(int i = (nElementos -1); i >= 0; i--) {
            System.out.print(arreglo[i]+",");
        }
        System.out.println("\n\nFin del metodo burbuja.");
    }
    
}
