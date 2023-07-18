/*
Faça um programa capaz de corrigir provas de múltipla escolha. Cada prova terá 10 questões,
valendo 1 ponto cada uma. O programa deve inicialmente ler o gabarito da prova. Ele será
constituído de um conjunto de dez caracteres representando a resposta para cada uma das
questões. Cada questão pode ter uma das seguintes respostas: 'a', 'b', 'c', 'd' ou 'e'.
Após a leitura do gabarito, o programa deverá ler as respostas dos alunos. Para cada aluno
deverá ser lido o seu número de matrícula e suas respostas. O programa deverá calcular a nota
do aluno e imprimi-la de acordo com o gabarito. A leitura termina com um código de matrícula
negativo. Ao final, o programa deverá imprimir a percentagem de aprovação, sabendo-se que a
nota mínima é 5.
 */
package listamatriz.e17;
import java.util.Scanner;
public class ListaMatrizE17 {
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        String gabarito[] = new String[10], resposta[] = new String[10];
        int notas[] = new int[10];
        int qAlunos = 0, qAprovados = 0, nota = 0, j =0;

        System.out.println("Digite o gabarito da prova: (10 caracteres)");
       for(int i = 0; i < 10; i++){
        gabarito[i] = teclado.next();
       }
        while(true){
            System.out.print("Digite o número da matrícula do aluno, ou um número negativo para finalizar o programa:");
            int matricula = teclado.nextInt();
                if(matricula < 0){
                    break;
                }
                qAlunos++;
            System.out.print("Digite as respostas do aluno" + matricula + ":(10 caracteres)");
            for(int i = 0; i < 10; i++){
            resposta[i] = teclado.next();
            }
            
            for(int i  = 0; i < 10; i++){
                if((resposta[i]).equals(gabarito[i])){
                nota++;
                notas[j] = nota;
                j++;
                }
            }
            System.out.println("Matricula: " + matricula);
            System.out.println("Nota: " + nota);
            
            if(nota >= 5){
                qAprovados++;
            }
            System.out.println();
        }
        double percentAprovados = qAprovados / qAlunos * 100;
        System.out.println("Percentagem de aprovação: " + percentAprovados + "%");
    
    }
}