package org.example;

import java.util.ArrayList;
import java.util.List;

public class BasePorto {
    String nome;
    List<Barco> barcosAtracados = new ArrayList<Barco>();

    void atracarBarco(Barco b){

        barcosAtracados.add(b);
    };

    void desatracarBarco(Barco b){
        try {
            barcosAtracados.remove(b);
        }
        catch (Exception e){
            System.out.println("esse barco nao existe ou não esta atracado! ");
            System.out.println("ERRO!!! " + e);
        }
    }
}
