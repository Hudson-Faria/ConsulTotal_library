package br.com.SystemOnLine.ConsulTotal_library.model.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.SystemOnLine.ConsulTotal_library.model.domain.Paciente;

public class PacienteDao implements GenericManager<Paciente, Integer> {
	
	@Override
	public Integer getChave(Paciente paciente) {
		return paciente.getCodigo();
	}

	@Override
	public String getConsultaSql(Paciente paciente) {
		StringBuilder sql = new StringBuilder("from Paciente p "
                + "where 1 = 1 ");
        if (paciente.getCodigo() != 0) {
            sql.append("and p.codigo = :codigo");
        }
        if (paciente.getNome() != null && 
                !paciente.getNome().equals("")) {
            sql.append("and p.nome like :nome");
        }
        return sql.toString();
	}
	
	@Override
	public Map<String, Object> getParametrosMapa(Paciente paciente) {
		Map<String,Object> mapa = new HashMap<String, Object>();
		if (paciente.getCodigo() != 0) {
            mapa.put("codigo",paciente.getCodigo());            
        }
        if (paciente.getNome() != null && 
                !paciente.getNome().equals("")) {
            mapa.put("nome", paciente.getNome());            
        }
        return mapa;
	}

}
