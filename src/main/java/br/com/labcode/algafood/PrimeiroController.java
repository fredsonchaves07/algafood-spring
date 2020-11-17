package br.com.labcode.algafood;

import br.com.labcode.algafood.modelo.Cliente;
import br.com.labcode.algafood.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrimeiroController {
    private AtivacaoClienteService ativacaoClienteService;

    public PrimeiroController(AtivacaoClienteService ativacaoClienteService){
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String helloWord(){
        Cliente joao = new Cliente("João", "joao@email.com", "86765674");

        ativacaoClienteService.ativar(joao);
        return "Hello!";
    }
}
