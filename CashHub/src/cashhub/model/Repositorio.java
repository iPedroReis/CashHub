package cashhub.model;

import java.util.ArrayList; // Importa a classe ArrayList para criação de listas dinâmicas
import java.util.List; // Importa a interface List para manipulação de coleções

public class Repositorio { // Declara a classe "Repositorio" responsável por armazenar os gastos


	private static List<Gasto> listaGastos = new ArrayList<>(); // Declara uma lista estática de objetos "Gasto" inicializada como ArrayList
	
	public static void salvar(Gasto gasto) { // Método estático que recebe um objeto "Gasto" como parâmetro
		listaGastos.add(gasto); // Adiciona o objeto "gasto" à lista de gastos
	}
	
	public static List<Gasto> getLista() { // Método que retorna a lista de gastos
		return listaGastos; // Retorna a lista completa de gastos
	}
	
	
	
	public static double calcularTotalGanhos() { // Método que calcula o total de ganhos (valores positivos)
		double total = 0; // Declara variável "total" inicializada com zero
		for (Gasto g : listaGastos) { // Percorre cada objeto "Gasto" na lista
			if (!g.isAgendado() && g.getValor() > 0) {  // Verifica se o gasto NÃO é agendado e se o valor é positivo
				total += g.getValor(); // Soma o valor ao total
			}
		}
		return total; // Retorna o total de ganhos
	}
	
	public static double calcularTotalDespesas() { // Método que calcula o total de despesas (valores negativos)
		double total = 0; // Declara variável "total" inicializada com zero
		for (Gasto g : listaGastos) { // Percorre cada objeto "Gasto" na lista
			if (!g.isAgendado() && g.getValor() < 0) {  // Verifica se o gasto NÃO é agendado e se o valor é negativo
				total += g.getValor(); // Soma o valor ao total
			}
		}
		return Math.abs(total); // Retorna o valor absoluto do total (positivo)
	}
	
	public static Gasto getUltimoGanho() { // Método que retorna o último ganho registrado
		List<Gasto> lista = getLista(); // Obtém a lista de gastos
		for (int i = lista.size() - 1; i >= 0; i--) { // Percorre a lista de trás para frente
			if (!lista.get(i).isAgendado() && lista.get(i).getValor() > 0) {  // Verifica se o gasto NÃO é agendado e se o valor é positivo
				return lista.get(i); // Retorna o último ganho encontrado
			}
		}
		return null; // Retorna null caso não encontre nenhum ganho
	}
	
	public static Gasto getUltimaDespesa() { // Método que retorna a última despesa registrada
		List<Gasto> lista = getLista(); // Obtém a lista de gastos
		for (int i = lista.size() - 1; i >= 0; i--) { // Percorre a lista de trás para frente
			if (!lista.get(i).isAgendado() && lista.get(i).getValor() < 0) { // Verifica se o gasto NÃO é agendado e se o valor é negativo
				return lista.get(i); // Retorna a última despesa encontrada
			}
		}
		return null; // Retorna null caso não encontre nenhuma despesa
	}
}
