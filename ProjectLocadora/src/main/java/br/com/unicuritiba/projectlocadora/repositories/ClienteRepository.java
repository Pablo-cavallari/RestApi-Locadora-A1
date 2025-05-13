package br.com.unicuritiba.projectlocadora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.projectlocadora.models.Cliente;

public interface ClienteRepository 
extends JpaRepository<Cliente, Long> {

}
