package com.controle.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controle.estoque.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
