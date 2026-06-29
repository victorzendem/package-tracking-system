package br.com.victorzendem.rastreamento.exception;

public class OrderDelivereException extends RuntimeException {

    public OrderDelivereException(){
        super("Order delivered!");
    }
}
