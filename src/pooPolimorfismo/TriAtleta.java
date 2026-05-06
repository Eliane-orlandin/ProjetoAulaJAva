package pooPolimorfismo;

public class TriAtleta extends Pessoa implements ICiclista {

	int competicoes;

	public TriAtleta(String nome, int idade, int competicoes) {
		super(nome, idade);
		this.competicoes = competicoes;
	}

	public int getCompeticoes() {
		return competicoes;
	}

	public void setCompeticoes(int competicoes) {
		this.competicoes = competicoes;
	}

	public void competicoesConcluidas() {
		System.out.println("Competições concluídas: " + this.competicoes);
	}

	// Polimorfismo de Sobrecarga (Sobrecarga de Método)
	public void competicoesConcluidas(int numero) {
		System.out.println("Competições concluídas: " + numero);
	}
	
	// Polimorfismo de Sobrescrita (Sobrescrita de Método)
	public void visualizar() {
		super.visualizar();
		System.out.println("Competições: " + this.competicoes);
	}
	
	// Métodos Implementados das Interfaces
	public void pedalar() {
		System.out.println("Estou pedalando... ");
	}

	@Override // Anotação - Etiqueta de Dados/Info
	public String aquecer() {
		return "Estou me aquecendo...";
	}
}

