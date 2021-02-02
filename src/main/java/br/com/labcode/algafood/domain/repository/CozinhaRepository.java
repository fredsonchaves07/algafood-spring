package br.com.labcode.algafood.domain.repository;

import br.com.labcode.algafood.domain.model.Cozinha;

import java.util.List;

// Repositório é do dominio pois não apresenta detalhes de persistência de dados
// Repositório orientado a persistência
// O repositório imita uma coleção em java
// O padrão de repositórios são para entidades de agregate root
public interface CozinhaRepository {
    List<Cozinha> listar();
    Cozinha buscar(Long id);
    Cozinha adicionar(Cozinha cozinha);
    void remover(Cozinha cozinha);
}
