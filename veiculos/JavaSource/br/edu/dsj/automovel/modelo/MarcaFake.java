package br.edu.dsj.automovel.modelo;

import java.util.ArrayList;

import br.edu.dsj.automovel.entidade.Marca;

/**
 * Classe para teste de persistencia.
 * 
 * @author 1829203
 *
 */
public class MarcaFake {

	/**
	 * Lista fake de banco de dados
	 */
	private static ArrayList<Marca> marcasCadastradas = new ArrayList<Marca>();
	
	public static void cadastrarMarca(Marca marca) {
		marcasCadastradas.add(marca);
	}
	
	public static ArrayList<Marca> listar() {
		return marcasCadastradas;
	}
	
}