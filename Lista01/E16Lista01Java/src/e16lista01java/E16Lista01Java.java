/*
Faça um programa que receba um número inteiro e positivo do usuário e calcule a fatorial
(!) desse número. Exemplo: 4! = 4*3*2*1 = 24. */
package e16lista01java;
import java.util.Scanner;

public class E16Lista01Java {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int numero, cont = 1, fat =1;
    
    System.out.print("Informe um número inteiro que deseja calcular o fatorial: ");
    numero = teclado.nextInt();
    while( cont <= numero){
    fat = fat * cont;
    cont++;
        }
    System.out.print("O fatorial do número informado é: "+ fat +"\n");
    }
    
}
