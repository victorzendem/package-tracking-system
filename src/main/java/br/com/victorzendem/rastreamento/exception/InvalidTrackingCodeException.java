package br.com.victorzendem.rastreamento.exception;

public class InvalidTrackingCodeException  extends RuntimeException{

    public InvalidTrackingCodeException(){
        super("Invalid tracking code!");
    }
}
