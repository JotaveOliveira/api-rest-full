package com.controle.estoque.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_category")
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Getter
	@Setter
	private Long id;
	@Getter
	@Setter
	private String nome;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "categories")
	private Set<Product> produtcs= new HashSet<>();
	
	public Category() {}

	public Category(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	
	
	

}
