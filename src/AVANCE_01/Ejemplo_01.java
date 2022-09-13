/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package AVANCE_01;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
 * @phone  930518038
 * @institutional_mail nolberto.sumaran@unas.edu.pe
 * @personal_mail nolberto.sumaran@gmail.com

 */
class primo {

    public void esprimo(int n) {
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            System.out.print("," + n);
        }
    }
}

public class Ejemplo_01{

    public static void main(String[] args) {
        primo p1 = new primo();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            p1.esprimo(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("\n\nTIEMPO DE EJECUCION: " + (fin - inicio));
    }

}

