package br.edu.infnet.clientService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Cliente {
	
	
    @ApiModelProperty(value = "Códigodo cliente")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    
    @ApiModelProperty(value = "Nome da pessoa")
    @Column(nullable = false)
	private String nome;
    
    @ApiModelProperty(value = "email do cliente")
    @Column(nullable = false)
	private String email;
    
    @ApiModelProperty(value = "CPF do cliente")
    @Column(nullable = false)
	private Long cpf;
    
    @ApiModelProperty(value = "endereco do cliente")
    private String endereco;
    
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	

}
