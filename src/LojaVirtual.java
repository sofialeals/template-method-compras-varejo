public class LojaVirtual extends Loja{
    @Override
    void selecao(String produto) {
        System.out.println("Produto '"+ produto +"'"+" colocado no carrinho virtual.");
    }

    @Override
    void empacotamento() {
        System.out.println("Embalando pedido.");
    }

    @Override
    void pagamento(String formaPagamento) {
        System.out.println("Pagamento por meio de "+formaPagamento+".");
    }

    @Override
    void entrega() {
        System.out.println("Enviando o produto pelos Correios.");
    }
}
