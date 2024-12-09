public abstract class Loja {
    void processarPedido(String produto, boolean empacotamento, String formaPagamento) {
        selecao(produto);
        if(empacotamento) {
            empacotamento();
        }
        pagamento(formaPagamento);
        entrega();
    }

    abstract void selecao(String produto);
    abstract void empacotamento();
    abstract void pagamento(String formaPagamento);
    abstract void entrega();
}
