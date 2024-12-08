package Algoritmos;

import java.util.Scanner;

public class MultiplosCinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 50; i ++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }


    }
}
