package br.com.victorzendem.rastreamento.application;

import br.com.victorzendem.rastreamento.enums.StatusEncomenda;
import br.com.victorzendem.rastreamento.model.Encomenda;
import br.com.victorzendem.rastreamento.repository.EncomendaRepository;
import br.com.victorzendem.rastreamento.service.EncomendaService;
import br.com.victorzendem.rastreamento.validator.EncomendaValidator;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //repositorio
        EncomendaRepository encomendaRepository = new EncomendaRepository();
        //validator
        EncomendaValidator encomendaValidator = new EncomendaValidator();
        // encomenda service
        EncomendaService encomendaService = new EncomendaService(encomendaRepository, encomendaValidator);

        //cadastrando encomenda
        encomendaService.cadastrarEncomenda("BR123456", "Victor Zendem");


        List<Encomenda> encomendas = encomendaService.listarEncomendas();


        encomendaService.atualizarStatus("BR123456", StatusEncomenda.PAGAMENTO_APROVADO);

        System.out.println(encomendaService.buscarEncomenda("BR123456"));

        System.out.println(encomendas);


    }
}
