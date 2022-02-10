package com.tiago.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiago.helpdesk.domain.Chamado;
import com.tiago.helpdesk.domain.Cliente;
import com.tiago.helpdesk.domain.Tecnico;
import com.tiago.helpdesk.domain.enums.Perfil;
import com.tiago.helpdesk.domain.enums.Prioridade;
import com.tiago.helpdesk.domain.enums.Status;
import com.tiago.helpdesk.repositories.ChamadoRepository;
import com.tiago.helpdesk.repositories.PessoaRepository;

@Service
public class DBService {

	@Autowired
	private ChamadoRepository chamadoRepository;
	@Autowired
	private PessoaRepository pessoaRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Tiago Santos", "741.423.050-34", "tiago@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Richard Stallman", "576.052.700-20", "stallman@mail.com", "123");
		Tecnico tec3 = new Tecnico(null, "Claude Shannon", "078.683.510-98", "shannon@mail.com", "123");
		Tecnico tec4 = new Tecnico(null, "Tim Berners-Lee", "709.267.720-31", "lee@mail.com", "123");
		Tecnico tec5 = new Tecnico(null, "Linus Torvalds", "608.006.440-50", "torvalds@mail.com", "123");

		Cliente cli1 = new Cliente(null, "Albert Einstein", "876.883.650-31", "albert@mail.com", "123");
		Cliente cli2 = new Cliente(null, "Marie Curie", "972.165.370-50", "curie@mail.com", "123");
		Cliente cli3 = new Cliente(null, "Charles Darwin", "345.338.940-97", "darwin@mail.com", "123");
		Cliente cli4 = new Cliente(null, "Stephen Hawking", "688.654.480-24", "hawking@mail.com", "123");
		Cliente cli5 = new Cliente(null, "Max Planck", "906.166.740-23", "planck@mail.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Teste Chamado 1", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 02", "Teste Chamado 2", tec1, cli2);
		Chamado c3 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 03", "Teste Chamado 3", tec2, cli3);
		Chamado c4 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 04", "Teste Chamado 4", tec3, cli3);
		Chamado c5 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 05", "Teste Chamado 5", tec2, cli1);
		Chamado c6 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 06", "Teste Chamado 6", tec1, cli5);

		pessoaRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5, cli1, cli2, cli3, cli4, cli5));
		chamadoRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6));
	}

}
