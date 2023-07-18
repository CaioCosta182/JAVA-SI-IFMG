/*
 Crie um programa que leia um valor de hora (hh:mm:ss) [hh no formato de 24h] inserido
pelo usuário e informe quantos segundos se passaram desde o início do dia.
*/
package e09lista01java;
import java.util.Scanner;

public class E09Lista01JAVA {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    double hora,minutos,segundos;
    
    System.out.print("Infome a hora: ");
    hora = teclado.nextDouble();
    System.out.print("Informe os minutos: ");
    minutos = teclado.nextDouble();
    System.out.print("Informe os segundos: ");
    segundos = teclado.nextDouble();
    hora = hora * 3600;
    minutos = minutos * 60;
    segundos = (segundos + hora + minutos);
    
    System.out.print("Já se passaram "+ segundos + " desde o início do dia.");
    }
    
}
