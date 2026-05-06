package pooPolimorfismo;

public class TestaClasse {

	public static void main(String[] args) {
		// Pessoa p = new Pessoa("Maria", 18); // Classes abstratas não podem ser instanciadas

		// p.visualizar();
		TriAtleta t = new TriAtleta("Eliane", 44, 15);
		
		TriAtleta t2 = new TriAtleta("João", 30, 12);

		// t2.competicoesConcluidas();
		// t2.competicoesConcluidas(8);
		
		t.visualizar();
		

	}

}
