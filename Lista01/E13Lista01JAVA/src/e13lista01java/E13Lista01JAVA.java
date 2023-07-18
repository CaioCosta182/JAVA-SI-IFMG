/*
 Desenvolva um programa para calcular a soma dos pesos das pessoas com mais de trinta
anos. O usuário deverá informar a quantidade de pessoas e em seguida a idade e o peso de
cada uma delas. Exiba o resultado na tela.
*/
package e13lista01java;
import java.util.Scanner;

public class E13Lista01JAVA {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int idade,chave = 0, cont = 0;
    float peso, soma = 0;
    
    System.out.print("Informe a quantidade de pessoas a serem analisadas: ");
    chave = teclado.nextInt();
    while(cont < chave ){
    System.out.print("Informe sua Idade: ");
    idade = teclado.nextInt();
    System.out.print("Informe seu peso: ");
    peso = teclado.nextFloat();
   
    if(idade > 30){
    soma = soma + peso;
    }
     cont++ ;
    }
    System.out.print("A soma do peso das pessoas com mais de 30 anos é: "+soma + "Kg.\n");
    }
    
}
