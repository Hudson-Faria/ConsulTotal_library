package br.com.SystemOnLine.ConsulTotal_library.service.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import br.com.SystemOnLine.ConsulTotal_library.model.domain.Paciente;

public interface PacienteService extends Remote {

	static final String NOME_SERVICO = "ServicoPaciente";
	
	static final String URL_SERVICO = "rmi://127.0.0.1/"+NOME_SERVICO;
	
	public void salvar(Paciente paciente) throws RemoteException;
	
	public void excluir(Paciente paciente) throws RemoteException;
	
	public List<Paciente> pesquisar(Paciente paciente) throws RemoteException;
	
}
