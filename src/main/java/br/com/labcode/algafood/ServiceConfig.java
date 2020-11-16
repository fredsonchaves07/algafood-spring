package br.com.labcode.algafood;

import br.com.labcode.algafood.notificacao.Notificador;
import br.com.labcode.algafood.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador){
        return new AtivacaoClienteService(notificador);
    }
}
