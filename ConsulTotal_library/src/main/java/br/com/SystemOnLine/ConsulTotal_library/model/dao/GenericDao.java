package br.com.SystemOnLine.ConsulTotal_library.model.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao <E extends Serializable> {
	
	public abstract void salvarAtualizar(E e);

	public abstract void excluir(E e);

	public abstract List<E> pesquisar(E e);
	
}
