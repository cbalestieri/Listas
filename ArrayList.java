package br.com.digitalhouse;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        List<String> nomes = new java.util.ArrayList<>();

        nomes.add("Camille");
        nomes.add("Sol");
        nomes.add("Erica");
        nomes.add("Bruno");

        String valor = nomes.get(2);

        nomes.forEach(System.out::println);

        nomes.remove(2);
    }
}
