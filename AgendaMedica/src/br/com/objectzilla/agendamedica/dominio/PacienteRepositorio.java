package br.com.objectzilla.agendamedica.dominio;

import java.util.List;

import javax.ejb.Local;

@Local
public interface PacienteRepositorio {

	Paciente getPaciente(long id) throws PacienteNaoEncontradoException;
	
	List<Paciente> todosPacientes();
}
