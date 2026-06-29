package br.com.victorzendem.rastreamento.repository;

import br.com.victorzendem.rastreamento.model.Encomenda;

import java.util.*;

public class EncomendaRepository {
    private final Map<String, Encomenda> ENCOMENDAS;


    public EncomendaRepository(){
        this.ENCOMENDAS = new HashMap<>();
    }

    public void salvar(Encomenda encomenda){
        ENCOMENDAS.put(encomenda.getCODIGO_RASTREAMENTO(), encomenda);
    }

    public List<Encomenda> listaEncomenda(){
        return new ArrayList<>(ENCOMENDAS.values());
    }

    public Optional<Encomenda> buscarEncomenda(String codigoRastreio){
        return Optional.ofNullable(ENCOMENDAS.get(codigoRastreio));
    }

    public void apagarEncomenda(String codigo){
        ENCOMENDAS.remove(codigo);
    }




}
