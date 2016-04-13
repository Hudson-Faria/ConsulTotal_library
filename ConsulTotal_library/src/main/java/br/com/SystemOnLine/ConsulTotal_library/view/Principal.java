package br.com.SystemOnLine.ConsulTotal_library.view;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import br.com.SystemOnLine.ConsulTotal_library.service.rmi.PacienteService;
import br.com.SystemOnLine.ConsulTotal_library.service.rmi.PacienteServiceImpl;
import br.com.SystemOnLine.ConsulTotal_library.service.rmi.UsuarioService;
import br.com.SystemOnLine.ConsulTotal_library.service.rmi.UsuarioServiceImpl;

public class Principal 
{
    public static void main( String[] args )
    {
    	try{
    		System.out.println("Tentando subir o serviço");
			LocateRegistry.createRegistry(1099);
			Naming.rebind(PacienteService.NOME_SERVICO, new PacienteServiceImpl());
			Naming.rebind(UsuarioService.NOME_SERVICO, new UsuarioServiceImpl());
			System.out.println("Serviço de pé");
    	}catch(Exception e){
    		System.out.println("Erro ao iniciar o serviço " + e);
    	}
    }
}
