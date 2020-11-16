package br.com.labcode.algafood.notificacao;

import br.com.labcode.algafood.modelo.Cliente;
import br.com.labcode.algafood.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class NotificadorEmail implements Notificador {
    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp){
        this.hostServidorSmtp = hostServidorSmtp;
        System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){
        if(caixaAlta){
            mensagem = mensagem.toUpperCase();
        }

        System.out.printf("Notificando %s através do email %s: %s", cliente.getNome(), cliente.getEmail(), mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }


}
