package br.com.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
