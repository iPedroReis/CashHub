package cashhub.model;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {

	private static List<Gasto> listaGastos = new ArrayList<>();
	
	public static void salvar(Gasto gasto) {
		listaGastos.add(gasto);
	}
	
	public static List<Gasto> getLista() {
		return listaGastos;
	}
	
	public static double calcularTotalGanhos() {
		double total = 0;
		for (Gasto g : listaGastos) {
			if (g.getValor() > 0) {
				total += g.getValor();
			}
		}
		return total;
	}
}
