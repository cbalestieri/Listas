package br.com.digitalhouse;

import java.util.HashMap;
import java.util.Map;

public class ExemploHash {
    public static void main(String[] args) {

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "fizemos 1 gol!");
        mapa.put(2, "fizemos 2 gols!");

        String valor = mapa.get(1);
        System.out.println(valor);

        for (Integer chave :mapa.keySet()){
            String gol = mapa.get(2);
            System.out.println(gol);
        }
    }
}
