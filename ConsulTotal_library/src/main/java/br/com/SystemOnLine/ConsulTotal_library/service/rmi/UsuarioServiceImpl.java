package br.com.SystemOnLine.ConsulTotal_library.service.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import br.com.SystemOnLine.ConsulTotal_library.model.dao.GenericDao;
import br.com.SystemOnLine.ConsulTotal_library.model.dao.GenericDaoImp;
import br.com.SystemOnLine.ConsulTotal_library.model.dao.UsuarioDao;
import br.com.SystemOnLine.ConsulTotal_library.model.domain.Usuario;

public class UsuarioServiceImpl extends UnicastRemoteObject implements UsuarioService {
	
	private static final long serialVersionUID = 1L;
	
	private GenericDao<Usuario> usuarioDao;
	
	public UsuarioServiceImpl() throws RemoteException {
		usuarioDao = new GenericDaoImp<Usuario, Integer>(new UsuarioDao());
	}

	@Override
	public void salvar(Usuario usuario) throws RemoteException {
		usuarioDao.salvarAtualizar(usuario);
	}

	@Override
	public void excluir(Usuario usuario) throws RemoteException {
		usuarioDao.excluir(usuario);
	}
	
	@Override
	public List<Usuario> pesquisar(Usuario usuario) throws RemoteException {
		return usuarioDao.pesquisar(usuario);
	}

}
