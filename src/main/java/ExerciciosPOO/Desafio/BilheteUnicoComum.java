package ExerciciosPOO.Desafio;

import java.util.Scanner;

public class BilheteUnicoComum implements BilheteUnico {
    private String codigo;  //Código do bilhete
    private Usuario usuario; //Usuário associado ao bilhete
    private double saldo; //Saldo disponível no bilhete

    //Construtor que inicializa os atributos do bilhete comum
    public BilheteUnicoComum(String codigo, Usuario usuario) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.saldo = 0; // saldo inicial é zero
    }

    @Override
    public void pagarPassagem() {
        if (saldo >= 5) {  //Verifica se o saldo é suficiente para pagar a passagem
            saldo -=5;  // Deduz 5 reais do saldo
            System.out.println("Passagem paga com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void recarregarBilhete() {
        System.out.print("Digite o valor para recarga: ");
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble(); //Lê o valor da recarga
        saldo += valor; //adiciona o valor ao saldo
        System.out.println("Bilhete recarregado com sucesso!");
    }

    @Override
    public String getCodigo() {
        return codigo; //Retorna o código do bilhete
    }

    @Override
    public Usuario getUsuario() {
        return usuario; // Retorna o usuário associado o bilhete
    }

    @Override
    public String getTipoBilhete() {
        return "Comum"; // Retorna o saldo disponível no bilhete
    }

    public double getSaldo() {
        return saldo; //Retorna o saldo disponível no bilhete
    }

    @Override
    public String toString() {
        return "BilheteUnicoComum{" +
                "codigo='" + codigo + '\'' +
                ", usuario=" + usuario +
                ", saldo=" + saldo +
                '}';
    }
}