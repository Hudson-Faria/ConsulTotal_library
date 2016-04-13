package br.com.SystemOnLine.ConsulTotal_library.model.domain;

import java.io.Serializable;
import javax.persistence.*;

import br.com.SystemOnLine.ConsulTotal_library.util.ValidacaoException;

@Entity
@Table(name="tbl_usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="us_codigo")
	private Integer codigo;

	@Column(name="us_login")
	private String login;

	@Column(name="us_nome")
	private String nome;

	@Column(name="us_permissao")
	private String permissao;

	@Column(name="us_senha")
	private String senha;

	public Usuario() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPermissao() {
		return this.permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	public void validar() throws ValidacaoException {
		if (this.nome == null || this.nome.equals("")) {
            throw new ValidacaoException("Campo nome não preenchido");
        }
		if (this.login == null || this.login.equals("")) {
            throw new ValidacaoException("Campo login não preenchido");
        }
		if (this.senha == null || this.senha.equals("")) {
            throw new ValidacaoException("Campo senha não preenchido");
        }
		if (this.permissao == null || this.permissao.equals("")) {
            throw new ValidacaoException("Campo permissão não preenchido");
        }	
	}
	
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", login=" + login + ", senha=" + senha + ", permissão=" + permissao + "]";
	}

}