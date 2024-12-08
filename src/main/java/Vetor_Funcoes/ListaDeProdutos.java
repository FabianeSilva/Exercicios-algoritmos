package Vetor_Funcoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaDeProdutos {

    public static void main (String[] args) {
        //Cria uma lista de produtos com nome e preço
        List<String> nomes = new ArrayList<>();
        List<Double> precos = new ArrayList<>();

        //Adiciona produtos à lista
        nomes.add("Fruta");
        precos.add(140.0);

        nomes.add("Bebida");
        precos.add(200.00);

        nomes.add("Lanche");
        precos.add(120.0);

        nomes.add("Refrigerante");
        precos.add(160.0);

        nomes.add("Doce");
        precos.add(100.0);

        //Aplica o reajuste de preço
        aplicarReajuste(nomes, precos);

        //Cria uma lista de índices e ordena pelos preços
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < precos.size(); i++) {
            indices.add(i);
        }
        Collections.sort(indices, Comparator.comparingDouble(precos::get));

        //Exibe a lista final no console
        for (int i : indices) {
            System.out.println(nomes.get(i) + " - " + precos.get(i));
        }
    }

    //Função para aplicar o reajuste de preço
    public static void aplicarReajuste(List<String> nomes, List<Double> precos) {
        for (int i = 0; i < precos.size(); i++){
            if (precos.get(i) < 150) {
                precos.set(i, precos.get(i) * 1.10);
            }
        }
    }


}
