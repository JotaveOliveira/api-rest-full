package com.controle.estoque.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.controle.estoque.entity.User;

@Configuration
@Profile("test")
public class EstoqueConfigBD {
	
	public static void main(String[] args) {
		User us = new User();
		us.getNome();
		
	}
}
