package br.com.victorzendem.rastreamento.model;

import br.com.victorzendem.rastreamento.enums.StatusEncomenda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Encomenda {
    private final List<HistoricoStatus> HISTORICO_STATUSES;
    private final String CODIGO_RASTREAMENTO;
    private final String DESTINATARIO;
    private StatusEncomenda statusEncomenda;


    public Encomenda(String codigoRastreio, String destinatario) {
        this.CODIGO_RASTREAMENTO = codigoRastreio;
        this.DESTINATARIO = destinatario;
        this.statusEncomenda = StatusEncomenda.PEDIDO_CRIADO;
        this.HISTORICO_STATUSES = new ArrayList<>();
        this.HISTORICO_STATUSES.add(new HistoricoStatus(LocalDateTime.now(), statusEncomenda));
    }

    public void atualizarStatus(StatusEncomenda statusNovo){

        this.statusEncomenda = statusNovo;
        this.HISTORICO_STATUSES.add(new HistoricoStatus(LocalDateTime.now(), statusNovo));
    }


    @Override
    public String toString() {
        return "Encomenda{" +
                "HISTORICO_STATUSES=" + HISTORICO_STATUSES +
                ", CODIGO_RASTREAMENTO='" + CODIGO_RASTREAMENTO + '\'' +
                ", DESTINATARIO='" + DESTINATARIO + '\'' +
                ", statusEncomenda=" + statusEncomenda +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Encomenda encomenda = (Encomenda) o;
        return Objects.equals(CODIGO_RASTREAMENTO, encomenda.CODIGO_RASTREAMENTO);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(CODIGO_RASTREAMENTO);
    }



    public boolean foiEntregue(){
        return this.statusEncomenda.equals(StatusEncomenda.ENTREGUE);
    }

    public List<HistoricoStatus> getHISTORICO_STATUSES() {
        return HISTORICO_STATUSES;
    }

    public String getCODIGO_RASTREAMENTO() {
        return CODIGO_RASTREAMENTO;
    }

    public String getDESTINATARIO() {
        return DESTINATARIO;
    }

    public StatusEncomenda getStatusEncomenda() {
        return statusEncomenda;
    }
}
