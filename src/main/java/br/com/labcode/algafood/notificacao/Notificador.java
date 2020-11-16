package br.com.labcode.algafood.notificacao;

import br.com.labcode.algafood.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
