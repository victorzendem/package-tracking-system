package br.com.victorzendem.rastreamento.model;

import br.com.victorzendem.rastreamento.enums.StatusEncomenda;

import java.time.LocalDateTime;

public class HistoricoStatus {
    private final LocalDateTime LOCAL_DATE_TIME;
    private final StatusEncomenda STATUS_ENCOMENDA;


    public HistoricoStatus(LocalDateTime localDateTime, StatusEncomenda statusEncomenda) {
        this.LOCAL_DATE_TIME = localDateTime;
        this.STATUS_ENCOMENDA = statusEncomenda;
    }


    @Override
    public String toString() {
        return "HistoricoStatus{" +
                "LOCAL_DATE_TIME=" + LOCAL_DATE_TIME +
                ", STATUS_ENCOMENDA=" + STATUS_ENCOMENDA +
                '}';
    }

    public LocalDateTime getLOCAL_DATE_TIME() {
        return LOCAL_DATE_TIME;
    }

    public StatusEncomenda getSTATUS_ENCOMENDA() {
        return STATUS_ENCOMENDA;
    }
}
