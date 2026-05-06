package poo;

public class TestaCarro {

	public static void main(String[] args) {
		
		// Instanciamento 
		Carro c1 = new Carro("Kombi", 4, 4, "Modelo XYW");
		Carro c2 = new Carro("Toyota", 2, 4, "Supra");
		// c1.marca = "Kombi";
		// c1.portas = 4;
		
		// c1.setMarca("Kombi");
		// c1.setPortas(4);
		
		// c1.locomover();
		
		System.out.println("Marca: " + c1.getMarca());
		System.out.println("Qtd. Portas: " + c1.getPortas());
		System.out.println(c1.parar());
		
		System.out.println(" ");
		
		System.out.println("Marca: " + c2.getMarca());
		System.out.println("Qtd. Portas: " + c2.getPortas());
		System.out.println(c2.parar());
	}

}
