package br.com.labcode.algafood.jpa;

import br.com.labcode.algafood.domain.model.Cozinha;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class CadastroCozinha {

    // Gerencia os contextos de SQL. Realiza a tradução dos comandos
    @PersistenceContext
    private EntityManager manager;

    public List<Cozinha> listar() {
        // Utiliza a linguagem de consulta da JPA -> JPQL
        TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class);

        return query.getResultList();
    }
}
