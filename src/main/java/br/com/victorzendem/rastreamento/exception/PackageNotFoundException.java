package br.com.victorzendem.rastreamento.exception;

public class PackageNotFoundException extends  RuntimeException{

    public PackageNotFoundException(){
        super("Package not found!");
    }
}
