package br.com.SystemOnLine.ConsulTotal_library.model.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.SystemOnLine.ConsulTotal_library.model.domain.Usuario;

public class UsuarioDao implements GenericManager<Usuario, Integer> {
	
	@Override
	public Integer getChave(Usuario usuario) {
		return usuario.getCodigo();
	}

	@Override
	public String getConsultaSql(Usuario usuario) {
		StringBuilder sql = new StringBuilder("from Usuario u"
                + "where 1 = 1 ");
        if (usuario.getCodigo() != 0) {
            sql.append("and u.codigo = :codigo");
        }
        if (usuario.getNome() != null && 
                !usuario.getNome().equals("")) {
            sql.append("and u.nome like :nome");
        }
        return sql.toString();
	}

	@Override
	public Map<String, Object> getParametrosMapa(Usuario usuario) {
		Map<String,Object> mapa = new HashMap<String, Object>();
		if (usuario.getCodigo() != 0) {
            mapa.put("codigo",usuario.getCodigo());            
        }
        if (usuario.getNome() != null && 
                !usuario.getNome().equals("")) {
            mapa.put("nome", usuario.getNome());            
        }
        return mapa;
	}

}
