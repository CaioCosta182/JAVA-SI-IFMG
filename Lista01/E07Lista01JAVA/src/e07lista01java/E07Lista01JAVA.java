/*Faça um programa que leia um número e some 5 caso seja par e divisível por 5 ou some 8
caso seja ímpar. Imprimir o resultado desta operação.
 */
package e07lista01java;
import java.util.Scanner;

public class E07Lista01JAVA {
    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);

float valor;

System.out.print("Informe um número: ");
valor = teclado.nextFloat();
if(valor % 2 == 0 && valor % 5 == 0){
    valor = valor + 5;
    System.out.print("Resultado da operação é um número par igual a: "+ valor);
}else if(valor % 2 != 0){
    valor = valor + 8;
    System.out.print("Resultado é um numero ímpar igual a: " + valor + "\n");
}
    }
    
}
