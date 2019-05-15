package br.edu.web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import br.edu.lista01.Exercicios;

/**
 * Calculo da progressão aritmética.
 * 
 * @author 1829203
 *
 */
@Named
@RequestScoped
public class ProgressaoBean {
	
	@NotNull
	private Double a1;
	
	@NotNull
	private Integer n;
	
	@NotNull
	private Double r;
	
	private Double an;
	
	public void calcular() {
		this.an = Exercicios.calcularNEsimoTermo(a1, n, r);
	}

	public Double getA1() {
		return a1;
	}

	public void setA1(Double a1) {
		this.a1 = a1;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public Double getR() {
		return r;
	}

	public void setR(Double r) {
		this.r = r;
	}

	public Double getAn() {
		return an;
	}

	public void setAn(Double an) {
		this.an = an;
	}
	
}