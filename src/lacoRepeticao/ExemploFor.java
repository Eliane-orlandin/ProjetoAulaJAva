package lacoRepeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
	 	String nome;
        Scanner leia = new Scanner(System.in);
        int i; 
        
        for (i=1; i<4 ; i++) {
        	System.out.println("\nDigite o " + i + "º nome: ");
            nome = leia.nextLine();
            System.out.println("O " + i + "º nome: " + nome);
        }
        
        
        
        

	}

}
