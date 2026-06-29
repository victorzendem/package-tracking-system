package br.com.victorzendem.rastreamento.exception;

public class PackageAlreadyExistException extends RuntimeException{

    public PackageAlreadyExistException(){
        super("Package already exist!");
    }
}
