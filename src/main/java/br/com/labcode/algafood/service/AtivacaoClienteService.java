package br.com.labcode.algafood.service;

import br.com.labcode.algafood.modelo.Cliente;
import br.com.labcode.algafood.notificacao.NivelUrgencia;
import br.com.labcode.algafood.notificacao.Notificador;
import br.com.labcode.algafood.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    public void ativar(Cliente cliente){
        cliente.ativarCliente();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
    }
}
