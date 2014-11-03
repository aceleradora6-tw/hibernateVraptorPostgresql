package org.aceleradora.registrolivre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@SequenceGenerator(name="cliente_idcliente_seq", sequenceName="cliente_idcliente_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_idcliente_seq")
	@Column(name="id", updatable=false)
	private long id;
	private String nome;
	private int idade;
	
	
	public long getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}	
}
