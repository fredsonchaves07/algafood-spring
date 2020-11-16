package br.com.labcode.algafood;

import br.com.labcode.algafood.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {

    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.algaemail.com");
        notificador.setCaixaAlta(true);

        return notificador;
    }
}
