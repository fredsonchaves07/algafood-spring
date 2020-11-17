package br.com.labcode.algafood.notificacao;

import br.com.labcode.algafood.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("urgente")
@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s por email através do email %s: %s\n",
                cliente.getNome(),
                cliente.getEmail(),
                mensagem);
    }
}
