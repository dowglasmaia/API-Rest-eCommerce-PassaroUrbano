package org.maiati.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Oferta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String categoria;

	private String titulo;

	private String descricaoOferta;

	private String anunciante;

	private Double valor;

	private boolean destaque;

	private String img1;

	private String img2;

	private String img3;

	public Oferta() {

	}

	public Oferta(Long id, String categoria, String titulo, String descricaoOferta, String anunciante, Double valor,
			boolean destaque, String img1, String img2, String img3) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.titulo = titulo;
		this.descricaoOferta = descricaoOferta;
		this.anunciante = anunciante;
		this.valor = valor;
		this.destaque = destaque;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricaoOferta() {
		return descricaoOferta;
	}

	public void setDescricaoOferta(String descricaoOferta) {
		this.descricaoOferta = descricaoOferta;
	}

	public String getAnunciante() {
		return anunciante;
	}

	public void setAnunciante(String anunciante) {
		this.anunciante = anunciante;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public boolean isDestaque() {
		return destaque;
	}

	public void setDestaque(boolean destaque) {
		this.destaque = destaque;
	}

	public String getImg1() {
		return img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	public String getImg2() {
		return img2;
	}

	public void setImg2(String img2) {
		this.img2 = img2;
	}

	public String getImg3() {
		return img3;
	}

	public void setImg3(String img3) {
		this.img3 = img3;
	}

}
