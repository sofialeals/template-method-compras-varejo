public class Cliente {
    public static void main(String[] args) {
        Loja loja = new LojaVirtual();
        loja.processarPedido("Vestido", true, "Pix");
        System.out.println();
        loja = new LojaFisica();
        loja.processarPedido("Saia", false, "Dinheiro");
    }
}
