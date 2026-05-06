package metodos;

import metodoExterno.ExemploMetodExterno;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		int resultado = somar(2, 5);
		System.out.println("Resultado soma: " + resultado);

		mensagem();
		saudacao("Olá, Braseelllll");
		
		ExemploMetodExterno.info();
	}
	
	public static int somar(int num1, int num2) { // Assinatura do método
		return num1 + num2; // lógica do método
	}
	
	public static void mensagem() {
		System.out.println("Esse método não tem retorno (void)");
	}
	
	public static void saudacao (String msg) {
		System.out.println(msg);
	}

}
