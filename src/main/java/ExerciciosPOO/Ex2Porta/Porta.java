package ExerciciosPOO.Ex2Porta;

public class Porta {

    private boolean aberta = false;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public Porta(String cor, double dimensaoX, double dimensaoY, double dimensaoZ){
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }

    public void abre() {
        if (aberta)
        {
            System.out.println("Porta já está aberta.");
        }

        aberta = true;
    }

    public void fecha() {
        if (!aberta)
        {
            System.out.println("Porta já está fechada.");
        }

        aberta = false;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public boolean estaAberta() {
        return aberta;
    }

    @Override
    public String toString() {
        String dados = "";

        dados += "Cor da porta: " + cor + "\n";
        dados += "Dimensão X: " + dimensaoX + "\n";
        dados += "Dimensão Y: " + dimensaoY + "\n";
        dados += "Dimensão Z: " + dimensaoZ + "\n";

        if (aberta) {
            dados += "A porta está aberta!";
        }
        else {
            dados += "A porta está fechada!";
        }
        return dados;
    }

}
