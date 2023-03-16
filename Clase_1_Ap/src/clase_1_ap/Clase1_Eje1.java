/*1. Vamos a practicar operaciones básicas con números
a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
y “b”. Su código puede arrancar (por ejemplo):
int numeroInicio = 5;
int numeroFin = 14;
// Se deberían mostrar los números:
5,6,7,8,9,10,11,12,13,14
b. A lo anterior, solo muestre los números pares
c. A lo anterior, con una variable extra, elija si se deben mostrar los números
pares o impares
d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden*/
package clase_1_ap;

import java.util.Scanner;

public class Clase1_Eje1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in).useDelimiter("\n");
       //Variables
       int numeroInicio = 5;
       int numeroFin = 14;
       boolean par;
       
       //Acciones
       //a
        System.out.print("Mostrar numeros de "+ numeroInicio + " a "+ numeroFin+": ");
        while (numeroInicio <= numeroFin) {
            System.out.print(numeroInicio++ + " ");
        }
        System.out.println(" ");
        //b
        numeroInicio = 5;
        System.out.print("Mostrar solo los numeros pares: ");
        while (numeroInicio <= numeroFin) {
            if (numeroInicio%2 == 0) {
                System.out.print(numeroInicio+" ");
            }
            numeroInicio++;
        }
        System.out.println(" ");
        //c
        numeroInicio = 5;
        System.out.println("Ingrese true si quiere seguir mostrando numeros par.");
        System.out.println("De lo contrario ingrese false para mostrar numeros impar");
        par = sc.nextBoolean();
        while (numeroInicio <= numeroFin) {
            if (par && numeroInicio%2 == 0) {
                System.out.print(numeroInicio+" ");
            }
            else if(!par && numeroInicio%2 != 0){
                System.out.print(numeroInicio+" ");
            }
            numeroInicio++;
        }
        System.out.println(" ");
        
     //d   
        System.out.println("Mostramos los numeros pares pero de forma descendente");
        for (int i = 14; i >= 5; i--) {
            if (i%2 == 0) {
                System.out.print(i+" ");
            }
        }
        
    }    
}
