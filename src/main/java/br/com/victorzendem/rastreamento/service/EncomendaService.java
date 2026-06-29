package br.com.victorzendem.rastreamento.service;

import br.com.victorzendem.rastreamento.enums.StatusEncomenda;
import br.com.victorzendem.rastreamento.exception.InvalidTrackingCodeException;
import br.com.victorzendem.rastreamento.exception.PackageAlreadyExistException;
import br.com.victorzendem.rastreamento.exception.PackageNotFoundException;
import br.com.victorzendem.rastreamento.model.Encomenda;
import br.com.victorzendem.rastreamento.repository.EncomendaRepository;
import br.com.victorzendem.rastreamento.validator.EncomendaValidator;

import java.util.List;
import java.util.Optional;

public class EncomendaService {
    private final EncomendaRepository ENCOMENDA_REPOSITORY;
    private final EncomendaValidator encomendaValidator;


    public EncomendaService(EncomendaRepository ENCOMENDA_REPOSITORY, EncomendaValidator encomendaValidator) {
        this.ENCOMENDA_REPOSITORY = ENCOMENDA_REPOSITORY;
        this.encomendaValidator = encomendaValidator;
    }

    public void cadastrarEncomenda(String codigoRastreio, String destinatario){


        //validando informações recebidas
        encomendaValidator.validarCadastro(destinatario, codigoRastreio);

        //verifica se exista uma encomenda com esse codigo
        ENCOMENDA_REPOSITORY.buscarEncomenda(codigoRastreio)
                .ifPresent(encomenda -> {throw new PackageAlreadyExistException();});

        //cria um objeto de encomenda
        Encomenda encomenda = new Encomenda(codigoRastreio, destinatario);
        //salva o objeto no repositorio
        ENCOMENDA_REPOSITORY.salvar(encomenda);
    }

    public List<Encomenda> listarEncomendas(){
        return ENCOMENDA_REPOSITORY.listaEncomenda();
    }

    public void atualizarStatus(String codigoRastreio, StatusEncomenda novoStatusEncomenda){

        Encomenda encomenda = buscarEncomenda(codigoRastreio).orElseThrow(PackageNotFoundException::new);

        encomenda.atualizarStatus(novoStatusEncomenda);
    }

    public Optional<Encomenda> buscarEncomenda(String codigoRastreio){

        if(codigoRastreio == null || codigoRastreio.isBlank()){
            throw new InvalidTrackingCodeException();
        }

        return ENCOMENDA_REPOSITORY.buscarEncomenda(codigoRastreio);
    }
}
