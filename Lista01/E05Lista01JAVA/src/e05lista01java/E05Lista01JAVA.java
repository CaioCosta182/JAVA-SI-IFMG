/*
 Faça um programa que receba as notas AV1, AV2 e a frequência (em porcentagem) de um
aluno. Caso a frequência seja inferior a 50% ou ambas as notas sejam inferiores a 4,0, o
programa deve imprimir que o aluno está reprovado. Caso contrário, se apenas uma das
notas for inferior a 4,0 ou a média AV1 e AV2 for inferior a 6,0, o programa deve imprimir
que o aluno está de recuperação. Caso nenhuma das restrições anteriores se aplique, o
programa deve imprimir que o aluno está aprovado e apresentar sua média.
 */
package e05lista01java;
import java.util.Scanner;

public class E05Lista01JAVA {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double AV1, AV2, frequencia, media;

        System.out.print("Informe a nota da primeira avaliação: ");
        AV1 = teclado.nextDouble();
        System.out.print("Informe o valor da segunda avaliação: ");
        AV2 = teclado.nextDouble();
        System.out.print("Informe o percentual de frequência do aluno: ");
        frequencia = teclado.nextDouble();
        media = (AV1+AV2)/2;
        if(AV1 < 40 && AV2 < 40 || frequencia < 50){
         System.out.print("Reprovado!!!");
        }else if((AV1<40 || AV2 < 40) || (media < 60) ){
        System.out.print("Recuperação!!! ");
        }else{
        System.out.print("Aprovado!!!");
        }
        
        
    }
    
}
