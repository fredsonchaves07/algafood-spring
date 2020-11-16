package br.com.labcode.algafood.service;

import br.com.labcode.algafood.modelo.Cliente;
import br.com.labcode.algafood.notificacao.Notificador;
import br.com.labcode.algafood.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;


public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;

        System.out.println("AtivacaoClienteService: " + notificador);
    }

    public void ativar(Cliente cliente){
        cliente.ativarCliente();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
    }
}
