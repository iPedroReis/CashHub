package cashhub;

import cashhub.model.Gasto;
import cashhub.model.Repositorio;
import cashhub.view.TelaPrincipal; // Importe a tela!

public class Main {
	public static void main(String[] args) {
	    // Seus gastos de teste aqui...
	    Gasto g1 = new Gasto(1, 2000.0, "Salário", 2026, 4, 21, null, false);
	    Gasto g2 = new Gasto(2, -150.0, "Conta Luz", 2026, 4, 21, null, false);
	    
	    Repositorio.salvar(g1);
	    Repositorio.salvar(g2);

	    // O QUE FALTA PARA A TELA APARECER:
	    TelaPrincipal frame = new TelaPrincipal();
	    frame.setVisible(true); // <--- Isso faz a mágica acontecer
	}
}
