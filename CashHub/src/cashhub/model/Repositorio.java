package cashhub.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Camada de persistência em memória do sistema CA$H HUB.
 * Utiliza o padrão de membros estáticos para centralizar o armazenamento de dados,
 * garantindo que todas as telas (View) acessem a mesma base de informações[cite: 314, 337].
 */
public class Repositorio {


	/**
	 * Lista centralizada de registros. O modificador static assegura a consistência
	 * dos dados entre diferentes instâncias de telas no CardLayout[cite: 314, 320].
	 */
	private static List<Gasto> listaGastos = new ArrayList<>();
	
	/**
	 * Registra uma nova transação na lista global.
	 */
	public static void salvar(Gasto gasto) {
		listaGastos.add(gasto);
	}
	
	/**
	 * Fornece acesso à coleção completa de transações para operações de listagem e filtragem.
	 */
	public static List<Gasto> getLista() {
		return listaGastos;
	}
	
	/**
	 * Calcula o somatório de todas as entradas confirmadas.
	 * Filtra registros agendados para garantir que o saldo reflita apenas o fluxo real [cite: 272-273].
	 */
	public static double calcularTotalGanhos() {
		double total = 0;
		for (Gasto g : listaGastos) {
			if (!g.isAgendado() && g.getValor() > 0) { 
				total += g.getValor();
			}
		}
		return total;
	}
	
	/**
	 * Calcula o somatório de todas as saídas confirmadas.
	 * Retorna o valor absoluto para facilitar a exibição estética na interface gráfica[cite: 242].
	 */
	public static double calcularTotalDespesas() {
		double total = 0;
		for (Gasto g : listaGastos) {
			if (!g.isAgendado() && g.getValor() < 0) { 
				total += g.getValor();
			}
		}
		return Math.abs(total);
	}
	
	/**
	 * Localiza o ganho mais recente para exibição no resumo do Dashboard[cite: 171].
	 * Realiza uma busca em ordem reversa para otimizar a recuperação do dado.
	 */
	public static Gasto getUltimoGanho() {
		List<Gasto> lista = getLista();
		for (int i = lista.size() - 1; i >= 0; i--) {
			if (!lista.get(i).isAgendado() && lista.get(i).getValor() > 0) { 
				return lista.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Localiza a despesa mais recente para exibição no resumo do Dashboard[cite: 171].
	 */
	public static Gasto getUltimaDespesa() {
		List<Gasto> lista = getLista();
		for (int i = lista.size() - 1; i >= 0; i--) {
			if (!lista.get(i).isAgendado() && lista.get(i).getValor() < 0) {
				return lista.get(i);
			}
		}
		return null;
	}
}