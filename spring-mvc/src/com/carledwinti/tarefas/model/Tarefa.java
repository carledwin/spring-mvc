package com.carledwinti.tarefas.model;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class Tarefa {
	
	private Long id;
	//bean validation
	/*@NotNull(message="{descricao.required}")
	@Size(message="{descricao.size}", min=5, max=100)*/
	@NotNull(message="A descrição é um campo obrigatório.")
	@Size(message="A descrição deve ter entre 5 e 100 caracteres.", min=5, max=100)
	private String descricao;
	private boolean finalizado;
	private Calendar dataFinalizacao;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isFinalizado() {
		return finalizado;
	}
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
}
