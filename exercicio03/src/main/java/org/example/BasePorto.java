package org.example;

import java.util.ArrayList;
import java.util.List;

public class BasePorto {
    String nome;
    List<Barco> barcosAtracados = new ArrayList<Barco>();

    protected boolean atracarBarco(Barco b) {
        barcosAtracados.add(b);
        return true;
    }

    void desatracarBarco(Barco b){
        barcosAtracados.remove(b);
    }
}
