package br.com.victorzendem.rastreamento.exception;

public class InvalidDataException extends RuntimeException{

    public InvalidDataException(){
        super("Invalid data!");
    }
}
