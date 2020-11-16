package br.com.labcode.algafood.service;

import br.com.labcode.algafood.modelo.Cliente;
import br.com.labcode.algafood.notificacao.Notificador;
import br.com.labcode.algafood.notificacao.NotificadorEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class AtivacaoClienteService {

    // Também é possível injetar através do atributo
    // Problema é dificuldades com testes
    @Autowired
    private Notificador notificador;
    // Uso dessa anotação defin um ponto de injeção
    // A anotação fica opcional quando tem apenas 1 construtor
    // Ponto de injeção por construtor
    // O ideal é deixar no construtor
    @Autowired
    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente){
        cliente.ativarCliente();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
    }
    // Também é possível atribuit um ponto de injeção no método com métodos
    @Autowired
    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }
}
