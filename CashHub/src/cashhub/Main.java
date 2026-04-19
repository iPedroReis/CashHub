package cashhub;

import cashhub.model.Categoria;
import cashhub.model.Gasto;

public class Main {
	public static void main(String[] args) {
		try {
            // 1. Criar uma categoria primeiro (Gasto precisa dela)
            Categoria lazer = new Categoria(1, "Lazer");

            // 2. Criar um gasto válido
            Gasto g1 = new Gasto(1, 100.50, "Cinema", 2026, 4, 25, lazer, false);
            System.out.println("Gasto criado: " + g1.obterResumo());

            // 3. Testar a Regra de Status (Simulando que hoje é 19/04/2026)
            String status = g1.identificarStatus(19, 4, 2026);
            System.out.println("Status do gasto: " + status); // Deve imprimir "Pendente" [cite: 242]

            // 4. TESTE DE ERRO: Tentar inserir um dia inválido
            System.out.println("\nTestando erro de data...");
            g1.setDia(32); // Isso vai disparar a sua Exception!

        } catch (IllegalArgumentException e) {
            // Captura o erro que você definiu no 'throw' e mostra a mensagem
            System.err.println("Capturado com sucesso: " + e.getMessage());
        }
    }
}
