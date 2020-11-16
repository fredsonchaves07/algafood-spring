package br.com.labcode.algafood;

import br.com.labcode.algafood.notificacao.NotificadorEmail;
import br.com.labcode.algafood.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Component que tem como função definir os beans
@Configuration
public class Algaconfig {

    // Indica que o método será executado e instanciado pelo spring. Definindo bean
    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.algaemail.com");
        notificador.setCaixaAlta(true);

        return notificador;
    }

    @Bean
    public AtivacaoClienteService ativacaoClienteService(){
        // Chama um bean que já foi criado
        return new AtivacaoClienteService(this.notificadorEmail());
    }
}
