package br.edu.dsj.automovel.web;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.dsj.automovel.entidade.Marca;
import br.edu.dsj.automovel.modelo.MarcaFake;
import br.edu.dsj.automovel.web.util.JSFUtils;

@Named
@RequestScoped
public class MarcaBean {

	private Marca marca;
	
	public MarcaBean() {
		this.marca = new Marca();
	}
	
	public void salvarMarca() {
		MarcaFake.cadastrarMarca(this.marca);
		this.marca = new Marca();
		JSFUtils.enviarMensagemDeSucesso("Marca cadastrada com sucesso!");
	}
	
	public ArrayList<Marca> listarMarcas() {
		return MarcaFake.listar();
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}