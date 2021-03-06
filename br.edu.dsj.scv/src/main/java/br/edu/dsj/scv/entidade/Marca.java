package br.edu.dsj.scv.entidade;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

/**
 * Representa a {@link Marca} de um Automóvel.
 * 
 * @author 4694
 *
 */
@Entity
public class Marca {

	@Id
	@SequenceGenerator(name = "NUM_SEQ_MARCA", sequenceName = "NUM_SEQ_MARCA", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_MARCA")
	private Integer id;

	@NotNull
	private String nome;

	@NotNull
	private String descricao;

	@OneToMany(mappedBy = "marca", fetch = FetchType.LAZY)
	private List<Veiculo> veiculos;

	public Marca() {

	}

	public Marca(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

}
