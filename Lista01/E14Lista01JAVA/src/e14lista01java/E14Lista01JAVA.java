/*
 Faça um programa para ler um número inteiro n, calcular e exibir a soma dos números
inteiros ímpares no intervalo [1;n].
*/
package e14lista01java;
import java.util.Scanner;

public class E14Lista01JAVA {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n, soma = 0, cont =1;
    
    System.out.print("Infome um número: ");
    n = teclado.nextInt();
    while(cont < n){
    if(cont % 2 != 0){
    soma = soma + cont;
    }
    cont++;
    }
    System.out.print("A soma dos números ímpares contidos no intervalo informado é: "+ soma +"\n");
    }
    
}
