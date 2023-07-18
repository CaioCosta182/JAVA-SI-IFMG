/*Faça um programa que leia o número e a altura de 5 atletas. Calcular o exibir o número e a
altura do maior atleta. A entrada da altura será em centímetros.*/

package E01Lista01.java;

import java.util.Scanner;

public class E01Lista01JAVA {
 int maiorAltura = 0, maiorNumero = 0;
    public static void main(String[] args) {
    
    int numero, altura;
    Scanner teclado = new Scanner (System.in);
        int i,  maiorAltura = 0, maiorNumero = 0;
    
    for(i = 1; i <= 5; i++){
    System.out.print("Informe o número do " + i +"º atleta:");
    numero = teclado.nextInt();
    System.out.print("Informe a altura do mesmo: ");
    altura = teclado.nextInt();
       
    
    if(altura > maiorAltura){
        maiorAltura = altura;
        maiorNumero = numero;
        
        }
    }
         System.out.println("O maior atleta é o número: " + maiorNumero + " com a altura de: " + maiorAltura +" centimetros.");
    }
    
}
