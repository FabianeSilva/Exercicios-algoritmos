package ExerciciosPOO.Ex11Supermercado;

public class Pagamento {
    public enum TipoPagamento {
        DINHEIRO, CHEQUE, CARTAO
    }

    private TipoPagamento tipo;

    public Pagamento(TipoPagamento tipo) {
        this.tipo = tipo;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "tipo=" + tipo +
                '}';
    }
}
