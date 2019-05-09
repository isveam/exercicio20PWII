package br.com.etechoracio.exercicio20.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.etechoracio.exercicio20.enums.TipoFuncionarioEnum;

@Entity
@Table(name="tbl_funcionario")
public class Funcionario {
	@Id
	@GeneratedValue
	@Column(name="id_funcionario")
	private Long id;
	@Column(name="tx_nome")
	private String nome;
	@Column(name="tx_fone")
	private String fone;
	@Column(name="tp_funcionario")
	@Enumerated(EnumType.STRING)
	private TipoFuncionarioEnum tipo;
	@Column(name="dt_cadastro")
	@Enumerated(EnumType.STRING)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public TipoFuncionarioEnum getTipo() {
		return tipo;
	}
	public void setTipo(TipoFuncionarioEnum tipo) {
		this.tipo = tipo;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
