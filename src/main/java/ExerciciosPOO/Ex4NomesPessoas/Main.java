package ExerciciosPOO.Ex4NomesPessoas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main (String[] args) {

        List<String> nomes = new ArrayList<String>();

        nomes.add("Marlon");
        nomes.add("Carlos");
        nomes.add("Zeno");
        nomes.add("João");

        nomes.sort(Comparator.naturalOrder());

        System.out.println(nomes);
    }
}
