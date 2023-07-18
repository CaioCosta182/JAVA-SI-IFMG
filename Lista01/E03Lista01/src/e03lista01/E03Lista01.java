/*Fazer um programa que leia a sigla do estado de uma pessoa e imprima uma das mensagens
abaixo de acordo com estado informado:
carioca (RJ)
paulista (SP)
mineiro (MG)
potiguar (RN)
capixaba (ES)
gaucho (RS)
catarino (SC)
outro estado*/
package e03lista01;

import java.util.Scanner;

public class E03Lista01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String local;
        
        System.out.print("Informe a sigla do seu estado: ");
        local = teclado.nextLine();
        
        if(local.equals("RJ") || local.equals("rj")){
        System.out.print("Carioca.");
    }else if("SP".equals(local) || "sp".equals(local)){
        System.out.print("Paulista.");
    }else if(local.equals("MG") || local.equals("mg")){
        System.out.print("Mineiro.");
    }else if(local.equals("RN") || local.equals("rn")){
        System.out.print("Potiguar.");
    }else if(local.equals("ES") || local.equals("es")){
        System.out.print("Capixaba.");
    }else if(local.equals("SC") || local.equals("sc")){
        System.out.print("Catarinense.");
    }
            else{
            System.out.print("Outro estado.");
            }
        
    }
    
}
