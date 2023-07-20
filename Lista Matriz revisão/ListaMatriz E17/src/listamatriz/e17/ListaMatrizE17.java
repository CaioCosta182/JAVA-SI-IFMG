/*
Faça um programa em Java para corrigir uma prova com 10 questões de múltipla escolha( a, b, c, d ou e) de uma turma com 3 alunos. 
Cada questão vale 1 ponto. Para proceder com a correção, o programa deve ler o gabarito. 
Em seguida, ler as respostas dos alunos, e comparar essas respostas com o gabarito. 
A cada acerto, o aluno ganha 1 ponto. Ao final o programa deve calcular e escrever para cada aluno, a sua nota (0 a 10). 
E apresentar o número de notas que ficaram acima da média para aprovação, assumindo que essa média é 6.

Entrada

A entrada é composta de 4 sequências de 10 caracteres (composto por letras minúsculas, de a - e), 
onde a primeira sequência corresponde ao gabarito e as 3 sequências seguintes correspondem às respostas dos 3 alunos.

 */
package listamatriz.e17;
import java.util.Scanner;
public class ListaMatrizE17 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
         
           
            //para ler as questões do gabarito
         System.out.println("Informe um caractere referente a resposta do gabarito: ");
        char gabarito[] = new char[10];
        String teste = teclado.nextLine();
        for (int i = 0; i < 10; i++) {
            gabarito[i] = teste.charAt(i);

        }
        
        // Lendo as respostas dos alunos
        System.out.println("Informe as notas dos alunos : ");
        char[][] questAlunos = new char[3][10];
        String sequencia;
        for (int i = 0; i < 3; i++) {
            sequencia = teclado.nextLine();
            for (int j = 0; j < 10; j++) {
                questAlunos[i][j] = sequencia.charAt(j);
            }
        }
        
        // Corrigindo as respostas e calculando as notas
        int[] notas = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if (questAlunos[i][j] == gabarito[j]) {
                    notas[i]++;
                }
            }
        }
        
        // Imprimindo as notas dos alunos
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota do Aluno" + (i + 1) + ": " + notas[i]);
        }
        
        // Calculando o número de notas acima da média
        int notasAcimaMedia = 0;
        for (int i = 0; i < 3; i++) {
            if (notas[i] >= 6) {
                notasAcimaMedia++;
            }
        }
        
        // Imprimindo o número de notas acima da média
        System.out.println("Notas acima da média: " + notasAcimaMedia);

    
    }
}
