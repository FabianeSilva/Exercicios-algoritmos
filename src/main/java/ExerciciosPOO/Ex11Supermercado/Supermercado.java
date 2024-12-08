package ExerciciosPOO.Ex11Supermercado;

public class Supermercado {
    public static void main(String[] args) {
        //Criando produtos
        Produto produto1 = new Produto("Arroz", 5.0, 100);
        Produto produto2 = new Produto("Feijão", 4.0, 200);
        Produto produto3 = new Produto("Macarrão", 3.0, 150);

        //Criando itens do pedido
        ItemPedido item1 = new ItemPedido(produto1, 10);
        ItemPedido item2 = new ItemPedido(produto2, 20);
        ItemPedido item3 = new ItemPedido(produto3, 5);

        //Criando pagamento
        Pagamento pagamento = new Pagamento(Pagamento.TipoPagamento.CARTAO);

        //Criando pedido
        Pedido pedido = new Pedido(pagamento);
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);

        //Exibindo detalhes do pedido
        System.out.println(pedido);
    }
}
