package com.generation.lojagames.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O Atributo nome é Obrigatório!")
	private String nome;
	
	@NotBlank(message = "O Atributo descricao é Obrigatório!")
	@Size(max = 1000, message = "O atributo descricao  deve conter no máximo 1000 caracteres")
	private String descricao;
	
	@NotNull
	@PositiveOrZero
	private BigDecimal preco;
	
	@UpdateTimestamp
	private LocalDate dateLancamento;
	
	@Size(max = 1000, message = "O atributo foto deve conter no máximo 1000 caracteres")
	private String foto;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public LocalDate getDateLancamento() {
		return dateLancamento;
	}

	public void setDateLancamento(LocalDate dateLancamento) {
		this.dateLancamento = dateLancamento;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
}
