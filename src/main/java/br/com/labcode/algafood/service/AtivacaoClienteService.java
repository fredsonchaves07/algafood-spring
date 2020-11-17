package br.com.labcode.algafood.service;

import br.com.labcode.algafood.modelo.Cliente;
import br.com.labcode.algafood.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class AtivacaoClienteService {

    @Qualifier("urgente")
    @Autowired
    private Notificador notificador;

    public void ativar(Cliente cliente){
        cliente.ativarCliente();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo");

    }
}
