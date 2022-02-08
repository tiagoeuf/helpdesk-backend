package com.tiago.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.tiago.helpdesk.domain.enums.Perfil;

@Entity
public class Cliente extends Pessoa {

	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "cliente")
	private List<Chamado> chamados = new ArrayList<>();

	//constructor from superclass
	public Cliente() {
		super();
		addPerfil(Perfil.CLIENTE);
	}
	
	//constructor from superclass
	public Cliente(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
		addPerfil(Perfil.CLIENTE);
	}

	//getters && setters
	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}

	
	
	
	
}
