package br.edu.dsj.automovel.web;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.dsj.automovel.entidade.Marca;
import br.edu.dsj.automovel.modelo.ServicoMarca;
import br.edu.dsj.automovel.web.util.JSFUtils;

@Named
@RequestScoped
public class MarcaBean {

	private Marca marca;
	
	public MarcaBean() {
		this.marca = new Marca();
	}
	
	public void salvarMarca() {
		ServicoMarca.salvarMarca(this.marca);
		this.marca = new Marca();
		JSFUtils.enviarMensagemDeSucesso("Marca cadastrada com sucesso!");
	}
	
	public ArrayList<Marca> listarMarcas() {
		return ServicoMarca.listar();
	}
	
	public void excluirMarca(Marca marca) {
		ServicoMarca.excluirMarca(marca);
		JSFUtils.enviarMensagemDeSucesso("Marca excluída com sucesso!");
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}