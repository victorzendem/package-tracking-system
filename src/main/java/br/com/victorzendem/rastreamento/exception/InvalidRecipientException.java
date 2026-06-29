package br.com.victorzendem.rastreamento.exception;

public class InvalidRecipientException extends RuntimeException{

    public InvalidRecipientException(){
        super("Invalid recipient!");
    }
}
