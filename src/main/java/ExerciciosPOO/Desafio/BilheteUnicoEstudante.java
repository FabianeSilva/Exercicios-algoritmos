package ExerciciosPOO.Desafio;

public class BilheteUnicoEstudante implements BilheteUnico {

    private String codigo;
    private Usuario usuario;
    private int cotas; // Cotas disponíveis no bilhete

    //Construtor que inicializa os atributos do bilhete de estudante
    public BilheteUnicoEstudante(String codigo, Usuario usuario) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.cotas = 48; //Inicializa com 48 cotas
    }

    @Override
    public void pagarPassagem() {
        if (cotas > 0) { //Verifica se há cotas suficientes para pagar a passagem
            cotas -= 1; //Deduz uma cota
            System.out.println("Passagem paga com sucesso!");
        } else {
            System.out.println("Cotas insuficientes!");
        }
    }

    @Override
    public void recarregarBilhete() {
        cotas = 48; //Recarrega o bilhete com 48 cotas
        System.out.println("Bilhete recarregado com sucesso!");
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String getTipoBilhete() {
        return "Estudante"; //Retorna o tipo de bilhete (Estudante)
    }

    public int getCotas() {
        return cotas; // Retorna as cotas disponíveis no bilhete
    }

    @Override
    public String toString() {
            return "BilheteUnicoEstudante{" +
                    "codigo='" + codigo + '\'' +
                    ", usuario=" + usuario +
                    ", cotas=" + cotas +
                    '}';
    }
}
