/*
 Faça um programa que some todos os números digitados até que o número 0 seja digitado.
Exiba a soma dos números digitados.
 */
package e11lista01java;
import java.util.Scanner;

public class E11Lista01JAVA {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int valor = 1, soma = 0;
    while(valor != 0){
    System.out.print("Informe um valor ou digite 0 para finalizar o programa. ");
    valor = teclado.nextInt();
    soma = (soma + valor);
    }
    System.out.println("A soma dos valores informados é: "+ soma);
    }
    
}
