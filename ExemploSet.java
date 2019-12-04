package br.com.digitalhouse;

import java.util.HashSet;

public class ExemploSet {
    public static void main(String[] args) {

        HashSet<String> nomes2 = new HashSet<>();

        nomes2.add("Camille");
        nomes2.add("Sol");
        nomes2.add("Erica");
        nomes2.add("Bruno");

        for (String valor :nomes2){
            System.out.println((nomes2));
        }

        nomes2.remove("Sol");
        System.out.println(nomes2);
    }
}
