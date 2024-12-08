package ExerciciosPOO.Ex11Supermercado;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens;
    private Pagamento pagamento;

    public Pedido(Pagamento pagamento) {
        this.itens = new ArrayList<>();
        this.pagamento = pagamento;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
        item.getProduto().diminuirEstoque(item.getQuantidade());
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "itens=" + itens +
                ", pagamento=" + pagamento +
                ", total=" + calcularTotal() +
                '}';
    }
}
