package br.com.SystemOnLine.ConsulTotal_library.model.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class GenericDaoImp <E extends Serializable,I> implements GenericDao<E> {

private GenericManager<E, I> genericManager;
	
	public GenericDaoImp(GenericManager<E, I> genericManager) {
		this.genericManager = genericManager;
	}
	
	@Override
	public void salvarAtualizar(E e) {
		EntityManager em = Conexao.getEntityManager();
	    em.getTransaction().begin();
	    if (genericManager.getChave(e) != null) {
	    	e = em.merge(e);
	    }
	    em.persist(e);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public void excluir(E e) {
		EntityManager em = Conexao.getEntityManager();
	    em.getTransaction().begin();
	    e = em.merge(e);
	    em.remove(e);
	    em.getTransaction().commit();
	    em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> pesquisar(E e) {
		EntityManager em = Conexao.getEntityManager();
	    Query query = em.createQuery(genericManager.getConsultaSql(e));
	    Map<String,Object> parametros = genericManager.getParametrosMapa(e);
	    for (String chave:parametros.keySet()) {
	    	query.setParameter(chave,parametros.get(chave));
	    }
	    return query.getResultList();
	}

}
