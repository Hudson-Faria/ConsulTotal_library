package br.com.SystemOnLine.ConsulTotal_library.service.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import br.com.SystemOnLine.ConsulTotal_library.model.domain.Usuario;

public interface UsuarioService extends Remote {
	
	static final String NOME_SERVICO = "ServicoUsuario";
	
	static final String URL_SERVICO = "rmi://127.0.0.1/"+NOME_SERVICO;
	
	public void salvar(Usuario usuario) throws RemoteException;
	
	public void excluir(Usuario usuario) throws RemoteException;
	
	public List<Usuario> pesquisar(Usuario usuario) throws RemoteException;

}
