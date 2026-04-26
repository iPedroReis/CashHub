package cashhub;

import cashhub.model.Gasto; //Importa a classe "Gasto" que está dentro do pacote "cashhub.model"
import cashhub.model.Repositorio; //Importa a classe "Repositorio" que está dentro do pacote "cashhub.model"
import cashhub.view.TelaPrincipal; //Importa a classe "TelaPrincipal" que está dentro do pacote "cashhub.view"

//teste para conferir se a classe Main está funcionando**

public class Main { 
	public static void main(String[] args) { 
		TelaPrincipal frame = new TelaPrincipal(); // Aqui está acontecendo a criação de um objeto frame.
        frame.setVisible(true); // Torna o objeto "frame" visível na tela.
	}
}
