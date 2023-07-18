/*A prefeitura de Ouro Branco abriu uma linha de crédito para os funcionários estatutários. O
valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Desenvolva um
programa que permita entrar com o salário bruto e o valor da prestação e informar se o
empréstimo pode ou não ser concedido.*/
package e02lista01java;

import java.util.Scanner;

public class E02Lista01JAVA {
    
    public static void main(String[] args) {
     Scanner teclado = new Scanner (System.in);
     double salario, prestacao, emprestimo ;
     
     System.out.print("Informe o salário bruto: ");
     salario = teclado.nextDouble();
     System.out.print("Informe o valor da prestação: ");
     prestacao = teclado.nextDouble();
     
     emprestimo = salario * 0.3;
     if(prestacao < emprestimo){
     System.out.print("Empréstimo concedido:");
     }else{
     System.out.print("Empréstimo negado.");
     }
    }
    
}
