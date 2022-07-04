package br.com.projetoCadastroFuncionario.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;



@Entity
@SequenceGenerator(name = "seq_funcionarios", sequenceName = "seq_funcionarios", allocationSize = 1, initialValue = 1)
public class Funcionarios implements Serializable {

	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_funcionarios")
	private long id_funcionario;
	
	public long getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(long id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getRegistroFuncionario() {
		return registroFuncionario;
	}
	public void setRegistroFuncionario(String registroFuncionario) {
		this.registroFuncionario = registroFuncionario;
	}
	public int getIdadeFuncionario() {
		return idadeFuncionario;
	}
	public void setIdadeFuncionario(int idadeFuncionario) {
		this.idadeFuncionario = idadeFuncionario;
	}
	public String getDataNascimentoFuncionario() {
		return dataNascimentoFuncionario;
	}
	public void setDataNascimentoFuncionario(String dataNascimentoFuncionario) {
		this.dataNascimentoFuncionario = dataNascimentoFuncionario;
	}
	public String getEnderecoFuncionario() {
		return enderecoFuncionario;
	}
	public void setEnderecoFuncionario(String enderecoFuncionario) {
		this.enderecoFuncionario = enderecoFuncionario;
	}
	public String getCidadeFuncionario() {
		return cidadeFuncionario;
	}
	public void setCidadeFuncionario(String cidadeFuncionario) {
		this.cidadeFuncionario = cidadeFuncionario;
	}
	public String getEstadoFuncionario() {
		return estadoFuncionario;
	}
	public void setEstadoFuncionario(String estadoFuncionario) {
		this.estadoFuncionario = estadoFuncionario;
	}
	public String getEstadoCivilFuncionario() {
		return estadoCivilFuncionario;
	}
	public void setEstadoCivilFuncionario(String estadoCivilFuncionario) {
		this.estadoCivilFuncionario = estadoCivilFuncionario;
	}
	public String getSalarioFuncionario() {
		return salarioFuncionario;
	}
	public void setSalarioFuncionario(String salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}
	private String nomeFuncionario;
	private String registroFuncionario;
	private int idadeFuncionario;
	private String dataNascimentoFuncionario;
	private String enderecoFuncionario;
	private String cidadeFuncionario;
	private String estadoFuncionario;
	private String estadoCivilFuncionario;
	private String salarioFuncionario;
	
	
}
