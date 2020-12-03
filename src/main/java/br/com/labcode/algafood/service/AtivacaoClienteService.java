package br.com.labcode.algafood.service;

import br.com.labcode.algafood.modelo.Cliente;
import br.com.labcode.algafood.notificacao.NivelUrgencia;
import br.com.labcode.algafood.notificacao.Notificador;
import br.com.labcode.algafood.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;


@Component
public class AtivacaoClienteService {
    @TipoDoNotificador(NivelUrgencia.URGENTE)
    @Autowired
    private Notificador notificador;

    @PostConstruct()
    public void init(){
        System.out.println("INIT");
    }

    @PreDestroy()
    public void destroy(){
        System.out.println("DESTROY");
    }

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void ativar(Cliente cliente){
        cliente.ativarCliente();

        // Informar o container que o cliente está ativo neste momento
        // A informação é baseada em eventos
        // Baixo aclomento e alta coesão
        eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
    }
}
