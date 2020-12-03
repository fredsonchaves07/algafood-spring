package br.com.labcode.algafood.listener;

import br.com.labcode.algafood.notificacao.NivelUrgencia;
import br.com.labcode.algafood.notificacao.Notificador;
import br.com.labcode.algafood.notificacao.TipoDoNotificador;
import br.com.labcode.algafood.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoDoNotificador(NivelUrgencia.URGENTE)
    @Autowired
    private Notificador notificador;

    @EventListener
    private void clienteAtivadoListener(ClienteAtivadoEvent event){
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
    }
}
