package entradaSaida;

import java.util.Scanner;

public class AulaOperadores {

	public static void main(String[] args) {
		
		float celsius, fahrenheit;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em Celsius: ");
		celsius = leia.nextFloat();
		
		fahrenheit = celsius * 1.8f + 32;
		
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		

	}

}
