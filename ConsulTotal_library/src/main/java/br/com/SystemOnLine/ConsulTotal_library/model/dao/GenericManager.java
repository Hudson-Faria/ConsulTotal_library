package br.com.SystemOnLine.ConsulTotal_library.model.dao;

import java.io.Serializable;
import java.util.Map;

public interface GenericManager <E extends Serializable,I>{
	
	public abstract I getChave(E e);
	
	public abstract String getConsultaSql(E e);
	
	public abstract Map<String,Object> getParametrosMapa(E e);

}
