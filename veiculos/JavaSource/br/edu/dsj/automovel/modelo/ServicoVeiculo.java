package br.edu.dsj.automovel.modelo;

import java.util.ArrayList;

import br.edu.dsj.automovel.entidade.Veiculo;

/**
 * Classe para teste de persistencia.
 * 
 * @author 1829203
 *
 */
public class ServicoVeiculo {
	
	/**
	 * Lista fake de banco de dados
	 */
	private static ArrayList<Veiculo> veiculosCadastrados = new ArrayList<Veiculo>();
	
	public static void salvarVeiculo(Veiculo veiculo) {
		veiculosCadastrados.add(veiculo);
	}
	
	public static ArrayList<Veiculo> listar() {
		return veiculosCadastrados;
	}
	
	public static void excluirVeiculo(Veiculo veiculo) {
		veiculosCadastrados.remove(veiculo);
	}

}