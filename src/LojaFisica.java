public class LojaFisica extends Loja {
    @Override
    void selecao(String produto) {
        System.out.println("Produto '"+ produto +"'"+" selecionado da prateleira.");
    }

    @Override
    void empacotamento() {
        System.out.println("Empacotando o pedido no balcão.");
    }

    @Override
    void pagamento(String formaPagamento) {
        System.out.println("Pagamento por meio de "+formaPagamento+".");
    }

    @Override
    void entrega() {
        System.out.println("Produto entregue ao cliente no balcão.");
    }
}
