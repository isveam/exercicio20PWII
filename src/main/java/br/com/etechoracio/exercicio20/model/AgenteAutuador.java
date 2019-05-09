package br.com.etechoracio.exercicio20.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.exercicio20.enums.StatusAgenteEnum;
import br.com.etechoracio.exercicio20.enums.TipoAgenteEnum;

@Entity
@Table(name="tbl_agente_autuador")
public class AgenteAutuador {
	@Id
	@GeneratedValue
	@Column(name="id_agente")
	private Long id;
	
	@Column(name="tx_nome")
	private String nome;
	
	@Column(name="tx_fone")
	private String telefone;
	
	@Column(name="tp_agente")
	@Enumerated(EnumType.STRING)
	private TipoAgenteEnum tipo;
	
	@Column(name="st_agente")
	@Enumerated(EnumType.STRING)
	private StatusAgenteEnum status;
}