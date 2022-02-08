package com.tiago.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Pessoa{

	private List<Chamado> chamados = new ArrayList<>();

	//constructor from superclass
	public Tecnico() {
		super();
	}

	//constructor from superclass
	public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
	}

	//getters && setters
	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}
	

	

}
