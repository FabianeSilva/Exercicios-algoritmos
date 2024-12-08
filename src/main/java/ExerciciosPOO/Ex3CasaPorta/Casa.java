package ExerciciosPOO.Ex3CasaPorta;

public class Casa {

    private String cor;
    public Porta p1;
    public Porta p2;
    public Porta p3;

    public Casa(String cor, Porta p1, Porta p2, Porta p3) {
        this.cor = cor;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public int quantasPortasEstaoAbertas ()
    {
        int quantPortasAbertas = 0;
        if(p1.estaAberta())
            quantPortasAbertas++;
        if(p2.estaAberta())
            quantPortasAbertas++;
        if(p3.estaAberta())
            quantPortasAbertas++;

        return quantPortasAbertas;
    }

    public String toString() {
        String dados ="";

        dados += "Cor da casa: " + cor + "\n";
        dados += "Cor da porta 1: " + p1.getCor() + "\n";
        dados += "Cor da porta 2: " + p2.getCor() + "\n";
        dados += "Cor da porta 3: " + p3.getCor() + "\n";

        return dados;
    }
}
