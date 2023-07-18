/*
Escrever um programa que leia três números e exiba-os em ordem decrescente.
 */
package e04lista01java;

import java.util.Scanner;

public class E04Lista01JAVA {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int n1,n2,n3;
        System.out.print("Informe o primeiro número: ");
        n1 = teclado.nextInt();
        System.out.print("Informe o segundo número: ");
        n2 = teclado.nextInt();
        System.out.print("Informe o terceiro número: ");
        n3 = teclado.nextInt();
        
              if (n1 >= n2 && n1 >= n3) {
              if (n2 >= n3) {
                System.out.println("Números em ordem decrescente: " + n1 + ", " + n2 + ", " + n3);
            } else {
                System.out.println("Números em ordem decrescente: " + n1 + ", " + n3 + ", " + n2);
            }
            } else if (n2 >= n1 && n2 >= n3) {
                if (n1 >= n3) {
                System.out.println("Números em ordem decrescente: " + n2 + ", " + n1 + ", " + n3);
            } else {
                System.out.println("Números em ordem decrescente: " + n2 + ", " + n3 + ", " + n1);
            }
            } else {
                if (n1 >= n2) {
                System.out.println("Números em ordem decrescente: " + n3 + ", " + n1 + ", " + n2);
            } else {
                System.out.println("Números em ordem decrescente: " + n3 + ", " + n2 + ", " + n1);
            }
        }
        

    }
    
}
