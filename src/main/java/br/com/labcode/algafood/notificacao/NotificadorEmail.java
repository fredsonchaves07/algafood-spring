package br.com.labcode.algafood.notificacao;

import br.com.labcode.algafood.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {
    @Autowired
    private NotificadorProperties properties;

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Host: %s\n", properties.getHostServidor());
        System.out.printf("Porta: %d\n", properties.getPortaServidor());

        System.out.printf("Notificando %s por email através do email %s: %s\n",
                cliente.getNome(),
                cliente.getEmail(),
                mensagem);
    }
}
