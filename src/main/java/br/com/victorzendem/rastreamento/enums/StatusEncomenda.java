package br.com.victorzendem.rastreamento.enums;

public enum StatusEncomenda {
    PEDIDO_CRIADO("Pedido criado!", false){
        @Override
        public boolean podeAtualizarStatus(StatusEncomenda statusEncomenda) {
            return statusEncomenda == PAGAMENTO_APROVADO;
        }
    },
    PAGAMENTO_APROVADO("Pagamento aprovado!", false) {
        @Override
        public boolean podeAtualizarStatus(StatusEncomenda statusEncomenda) {
            return statusEncomenda == EM_SEPARACAO;
        }
    },
    EM_SEPARACAO("Pedido em separação!", false) {
        @Override
        public boolean podeAtualizarStatus(StatusEncomenda statusEncomenda) {
            return statusEncomenda == ENVIADO;
        }
    },
    ENVIADO("Pedido enviado!", false) {
        @Override
        public boolean podeAtualizarStatus(StatusEncomenda statusEncomenda) {
            return statusEncomenda == EM_TRANSITO;
        }
    },
    EM_TRANSITO("Pedido em trânsito!", false) {
        @Override
        public boolean podeAtualizarStatus(StatusEncomenda statusEncomenda) {
            return statusEncomenda == SAIU_PARA_ENTREGA;
        }
    },
    SAIU_PARA_ENTREGA("Pedido saiu para entrega!", false) {
        @Override
        public boolean podeAtualizarStatus(StatusEncomenda statusEncomenda) {
            return statusEncomenda == ENTREGUE;
        }
    },
    ENTREGUE("Pedido entregue!", true) {
        @Override
        public boolean podeAtualizarStatus(StatusEncomenda statusEncomenda) {
            return false;
        }
    };

    private final String DESCRICAO;
    private final boolean FINALIZADO;

    StatusEncomenda(String descricao, boolean finalizado) {
        this.DESCRICAO = descricao;
        this.FINALIZADO = finalizado;
    }


    public boolean foiFinalizado() {
        return FINALIZADO;
    }

    public abstract boolean podeAtualizarStatus(StatusEncomenda statusEncomenda);



    public boolean isFINALIZADO() {
        return FINALIZADO;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }
}
