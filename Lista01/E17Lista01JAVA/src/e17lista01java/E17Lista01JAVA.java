/*
 Desenvolva um programa que leia dois números fornecidos pelo usuário. O primeiro
número será o início do intervalo e o segundo número o final do intervalo. Verifique cada
número desse intervalo, incluindo o número inicial e final do intervalo, e exiba as seguintes
mensagens:
a. “pif”: caso o número seja divisível por 3
b. “paf”: caso o número seja divisível por 5
c. “pifpaf”: caso o número seja divisível por 3 e 5 
 */
package e17lista01java;

import java.util.Scanner;

public class E17Lista01JAVA {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.print("Digite o número inicial do intervalo: ");
         n1 = teclado.nextInt();
        
        System.out.print("Digite o número final do intervalo: ");
         n2 = teclado.nextInt();
        
        for (int i = n1; i <= n2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": pifpaf");
            } else if (i % 3 == 0) {
                System.out.println(i + ": pif");
            } else if (i % 5 == 0) {
                System.out.println(i + ": paf");
            }
        }
    }
    
}
