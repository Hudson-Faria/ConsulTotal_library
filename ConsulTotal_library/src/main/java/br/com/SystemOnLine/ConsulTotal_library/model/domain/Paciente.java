package br.com.SystemOnLine.ConsulTotal_library.model.domain;

import java.io.Serializable;
import javax.persistence.*;

import br.com.SystemOnLine.ConsulTotal_library.util.ValidacaoException;

import java.util.Date;

@Entity
@Table(name="tbl_paciente")
@NamedQuery(name="Paciente.findAll", query="SELECT p FROM Paciente p")
public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pac_codigo")
	private Integer codigo;

	@Column(name="pac_bairro")
	private String bairro;

	@Column(name="pac_celular")
	private String celular;

	@Column(name="pac_cep")
	private String CEP;

	@Column(name="pac_cidade")
	private String cidade;

	@Column(name="pac_cpf")
	private String CPF;

	@Column(name="pac_email")
	private String email;

	@Column(name="pac_endereco")
	private String endereco;

	@Temporal(TemporalType.DATE)
	@Column(name="pac_nascimento")
	private Date nascimento;

	@Column(name="pac_nome")
	private String nome;

	@Column(name="pac_numero")
	private String numero;

	@Column(name="pac_pais")
	private String pais;

	@Column(name="pac_rg")
	private String RG;

	@Column(name="pac_sexo")
	private String sexo;

	@Column(name="pac_telefone")
	private String telefone;

	public Paciente() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCEP() {
		return this.CEP;
	}

	public void setCEP(String CEP) {
		this.CEP = CEP;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCPF() {
		return this.CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getNascimento() {
		return this.nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getRG() {
		return this.RG;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Paciente other = (Paciente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	public void validar() throws ValidacaoException{
		if (this.nome == null || this.nome.equals("")) {
            throw new ValidacaoException("Campo nome não preenchido");
        }
		if (this.CPF == null || this.CPF.equals("")) {
            throw new ValidacaoException("Campo CPF não preenchido");
        }
		if (this.RG == null || this.RG.equals("")) {
            throw new ValidacaoException("Campo RG não preenchido");
        }
		if (this.CEP == null || this.CEP.equals("")) {
            throw new ValidacaoException("Campo CEP não preenchido");
        }
		if (this.endereco == null || this.endereco.equals("")) {
            throw new ValidacaoException("Campo endereço não preenchido");
        }
		if (this.numero == null || this.numero.equals("")) {
            throw new ValidacaoException("Campo número não preenchido");
        }
		if (this.bairro == null || this.bairro.equals("")) {
            throw new ValidacaoException("Campo bairro não preenchido");
        }
		if (this.cidade == null || this.cidade.equals("")) {
            throw new ValidacaoException("Campo cidade não preenchido");
        }
		if (this.pais == null || this.pais.equals("")) {
            throw new ValidacaoException("Campo pais não preenchido");
        }
		if (this.telefone == null || this.telefone.equals("")) {
            throw new ValidacaoException("Campo telefone não preenchido");
        }
		if (this.celular == null || this.celular.equals("")) {
            throw new ValidacaoException("Campo celular não preenchido");
        }
		if (this.email == null || this.email.equals("")) {
            throw new ValidacaoException("Campo email não preenchido");
        }
		if (this.nascimento == null || this.nascimento.equals("")) {
            throw new ValidacaoException("Campo nascimento não preenchido");
        }
		if (this.sexo == null || this.sexo.equals("")) {
            throw new ValidacaoException("Campo sexo não preenchido");
        }	
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", CPF=" + CPF + ", RG=" + RG + ", CEP=" + CEP
				+ ", endereço=" + endereco + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", pais=" + pais + ", telefone=" + telefone + ", celular=" + celular + ", email=" + email + ", nascimento=" + nascimento
				+ ", sexo=" + sexo + "]";
	}
	
	
	

}