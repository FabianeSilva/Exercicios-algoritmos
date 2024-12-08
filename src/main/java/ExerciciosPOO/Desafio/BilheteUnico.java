package ExerciciosPOO.Desafio;

public interface BilheteUnico {
    void pagarPassagem(); //Método para pagar a passagem
    void recarregarBilhete(); //Método para recarregar o bilhete
    String getCodigo(); //Método para obter o código do bilhete
    Usuario getUsuario(); //Método para obter o usuário associado ao bilhete
    String getTipoBilhete(); //Método para obter o tipo de bilhete (comum ou estudante)
}
