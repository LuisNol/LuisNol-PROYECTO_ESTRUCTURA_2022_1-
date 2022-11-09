/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AVANCE_01;

import java.util.Scanner;
import javax.xml.stream.util.EventReaderDelegate;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel
 * @phone 930518038
 * @institutional_mail nolberto.sumaran@unas.edu.pe
 * @personal_mail nolberto.sumaran@gmail.com
 */
public class MetodoNumeroPrimo_Eratostenes {

    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese  un numero a  sacar numeros primos :    ");
        n = entrada.nextInt();

        boolean[] primos = new boolean[n];

        for (int i = 0; i < primos.length; i++) {
            primos[i] = true;

        }
        for (int i = 2; i < primos.length; i++) {
             ///   i*2  i*3        i*4     i*5   i*6   
            for (int j = 2; i   * j < primos.length; j++) {

                primos[i * j] = false;
               
                //System.out.print("\t"+i*j);
            }
      //System.out.println("\n");
        }
        int p = 0;
        for (int i = 2; i < primos.length; i++) {

            if (primos[i]) {
                if (p == 10) {
                    System.out.print("\n");
                    p = 0;
                }
              System.out.print("\t " + i);
               p++;
            }    
        }
         System.out.println("\n");
    }

}
