/*Mariela Ramones Balvoa IMT A01411449
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mramonesb.a06p1;
import java.util.Scanner;
/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBA06P1 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
solicitarDato();
    
    }
    
    public static void solicitarDato(){
        int num, suma;
        suma = 0;
        do {
            System.out.println("Introduce un numero:");
            Scanner KB = new Scanner(System.in);
            num = KB.nextInt();
            if (num < 0){
                System.out.println("La suma total de los numeros positivos ingresados es " + suma);
             System.exit(0);
            } else {
            suma = suma + num;
            }
        } while (num >= 0);
        System.out.println("La suma total es: " + suma);
        }
    
}
