/*
Faça um programa que leia dois números, calcule e imprima a soma dos mesmos. O
programa deve repetir até que ambos os valores digitados sejam iguais a zero.
*/
package e12lista01java;
import java.util.Scanner;

public class E12Lista01JAVA {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int n1 = 1, n2 = 1, soma  = 0;
    
    while((n1 != 0) | (n2 != 0)){
    
    System.out.print("Informe o primeiro número ou  0  para finalizar a operação: ");
    n1 = teclado.nextInt();
    System.out.print("Infome o segundo número ou 0 para finalizar a operação: ");
    n2 = teclado.nextInt();
     soma = (n1 + n2);
     System.out.print("A soma dos valores informados é: " + soma + "\n");
    }
    
    }
    
}
