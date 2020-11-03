package br.com.labcode.algafood.notificacao;

import br.com.labcode.algafood.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail {
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através do email %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
