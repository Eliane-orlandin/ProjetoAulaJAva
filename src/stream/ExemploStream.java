package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"Rio Grande do Sul", "Santa Catarina", "Paraná");
		
		// Stream
		List<String> estadosEmMaiusculo = estados.stream()
				.map(x -> x.toUpperCase()) // Operação intermediária (Processamento)
				.collect(Collectors.toList()); // Operação terminal (Finalição)
		
		List<String> estadosUnicos = estados.stream()
				.distinct()
				.collect(Collectors.toList());
		
		long quantidadeDeEstados = estados.stream().count(); // Operação terminal
		
		System.out.println("Estados em maiúsculo: " + estadosEmMaiusculo);
		System.out.println("\nColeção/Dados Inicial: " + estadosUnicos);
		System.out.println("\nQuantidade de Estados Únicos: " + quantidadeDeEstados);
		
		System.out.println("\nColeção/Dados Inicial: " + estados);
	}

}
