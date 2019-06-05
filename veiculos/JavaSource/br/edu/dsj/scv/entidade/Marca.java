package br.edu.dsj.scv.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 * Representa a {@link Marca} de um Automóvel.
 * 
 * @author 4694
 *
 */
@Entity
@Table(name ="SCV_ENT_MARCA")
public class Marca {
	
	@Id
	@SequenceGenerator(name = "NUM_SEQ_MARCA", sequenceName = "NUM_SEQ_MARCA", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_MARCA")
	@Column(name = "SCV_ENT_MARCA_PK")
	private Integer id;

	@Column(name = "SCV_ENT_MARCA_NOME")
	@NotBlank
	private String nome;

	@Column(name = "SCV_ENT_MARCA_DESCRICAO")
	@NotBlank
	private String descricao;

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

}
