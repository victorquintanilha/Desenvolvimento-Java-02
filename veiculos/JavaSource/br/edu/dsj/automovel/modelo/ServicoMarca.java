package br.edu.dsj.automovel.modelo;

import java.util.ArrayList;

import br.edu.dsj.automovel.entidade.Marca;

/**
 * Classe para teste de persistencia.
 * 
 * @author 1829203
 *
 */
public class ServicoMarca {

	/**
	 * Lista fake de banco de dados
	 */
	private static ArrayList<Marca> marcasCadastradas = new ArrayList<Marca>();
	
	static {
		marcasCadastradas.add(new Marca("Fiat","aaa"));
		marcasCadastradas.add(new Marca("Volvo","bbb"));
		marcasCadastradas.add(new Marca("Renault","ccc"));
		marcasCadastradas.add(new Marca("Hyundai","ddd"));
	}
	
	public static void salvarMarca(Marca marca) {
		marcasCadastradas.add(marca);
	}
	
	public static ArrayList<Marca> listar() {
		return marcasCadastradas;
	}
	
	public static void excluirMarca(Marca marca) {
		marcasCadastradas.remove(marca);
	}
	
}