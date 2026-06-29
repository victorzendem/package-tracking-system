package br.com.victorzendem.rastreamento.validator;

import br.com.victorzendem.rastreamento.exception.InvalidRecipientException;
import br.com.victorzendem.rastreamento.exception.InvalidTrackingCodeException;

public class EncomendaValidator {



    public void validarCadastro(String destinatario, String codigoRastreio){
        validarNomeDestinatario(destinatario);
        validarCodigo(codigoRastreio);
    }



    private void validarNomeDestinatario(String nome){
        if(nome == null || nome.isBlank()){
            throw new InvalidRecipientException();
        }
    }

    private void validarCodigo(String codigoRastreamento){
        if(codigoRastreamento == null || codigoRastreamento.isBlank() || codigoRastreamento.length() < 7){
            throw new InvalidTrackingCodeException();
        }
    }


}
