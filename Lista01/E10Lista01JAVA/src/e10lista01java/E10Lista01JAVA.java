/*
 Desenvolva um programa que solicite e leia as alturas de quatro atletas que participaram dos
Jogos Olímpicos do Rio 2016. Após a leitura das alturas o programa deve exibir as seguintesinformações.
● maior altura
● menor altura
● altura média
*/
package e10lista01java;
import java.util.Scanner;

public class E10Lista01JAVA {
    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
float alt1, alt2, alt3, alt4, maior, menor, media;

System.out.print("Informe a altura do primeiro atleta: ");
alt1 = teclado.nextFloat();
System.out.print("Informe a altura do segundo atleta: ");
alt2 = teclado.nextFloat();
System.out.print("Informe a altura do terceiro atleta: ");
alt3 = teclado.nextFloat();
System.out.print("Informe a altura do quarto atleta: ");
alt4 = teclado.nextFloat();

media = (alt1+alt2+alt3+alt4) / 4;

if(alt1 > alt2 && alt1 > alt3 && alt1 > alt4){
maior = alt1;
}else if(alt2 > alt1 && alt2 > alt3 && alt2 > alt4){
maior = alt2;
}else if(alt3 > alt1 && alt3 > alt2 && alt3 > alt4){
maior = alt3;
}else{
maior = alt4;
}
if(alt1 < alt2 && alt1 < alt3 && alt1 < alt4){
menor = alt1;
}else if(alt2 < alt1 && alt2 < alt3 && alt2 < alt4){
menor = alt2;
}else if(alt3 < alt1 && alt3 < alt2 && alt3 < alt4){
menor = alt3;
}else{
menor = alt4;
}
System.out.println("A maior altura foi: " + maior);
System.out.println("A menor altura foi: "+ menor );
System.out.print("A altura media foi: "+ media +"\n");
    }
    
}
