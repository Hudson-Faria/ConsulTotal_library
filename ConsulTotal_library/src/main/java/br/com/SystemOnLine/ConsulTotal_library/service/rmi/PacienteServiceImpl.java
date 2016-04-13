package br.com.SystemOnLine.ConsulTotal_library.service.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import br.com.SystemOnLine.ConsulTotal_library.model.dao.GenericDao;
import br.com.SystemOnLine.ConsulTotal_library.model.dao.GenericDaoImp;
import br.com.SystemOnLine.ConsulTotal_library.model.dao.PacienteDao;
import br.com.SystemOnLine.ConsulTotal_library.model.domain.Paciente;

public class PacienteServiceImpl extends UnicastRemoteObject implements PacienteService {

	private static final long serialVersionUID = 1L;
	
	private GenericDao<Paciente> pacienteDao;
	
	public PacienteServiceImpl() throws RemoteException {
		pacienteDao = new GenericDaoImp<Paciente, Integer>(new PacienteDao());
	}
	
	@Override
	public void salvar(Paciente paciente) throws RemoteException {
		pacienteDao.salvarAtualizar(paciente);
	}

	@Override
	public void excluir(Paciente paciente) throws RemoteException {
		pacienteDao.excluir(paciente);
	}

	@Override
	public List<Paciente> pesquisar(Paciente paciente) throws RemoteException {
		return pacienteDao.pesquisar(paciente) ;
	}
	
}
