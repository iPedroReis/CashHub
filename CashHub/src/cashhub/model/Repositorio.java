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
	
	public static double calcularTotalDespesas() {
	    double total = 0;
	    for (Gasto g : listaGastos) {
	        if (g.getValor() < 0) {
	            total += g.getValor();
	        }
	    }
	    return Math.abs(total);
	}
	
	public static Gasto getUltimoGanho() {
		List<Gasto> lista = getLista();
		for (int i = lista.size() - 1; i >= 0; i--) {
			if (lista.get(i).getValor() > 0) {
				return lista.get(i);
			}
		}
		return null;
	}
	
	public static Gasto getUltimaDespesa() {
		List<Gasto> lista = getLista();
		for (int i = lista.size() - 1; i >= 0; i--) {
			if (lista.get(i).getValor() < 0) {
				return lista.get(i);
			}
		}
		return null;
	}
	
}

