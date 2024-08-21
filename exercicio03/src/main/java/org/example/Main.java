package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("Barco 1", 2));
        barcos.add(new Barco("Barco 2", 5));
        barcos.add(new Barco("Barco 3", 7));
        barcos.add(new Barco("Barco 4", 12));
        barcos.add(new Barco("Barco 5", 20));

        PortoPequeno portoPequeno = new PortoPequeno();
        PortoGrande portoGrande = new PortoGrande();


        for (Barco barco : barcos) {
            boolean atracado = false;

            if (portoPequeno.atracarBarco(barco)) {
                System.out.println(barco.getNome() + " atracado no porto pequeno");
                atracado = true;
            }

            if (!atracado) {
                if (portoGrande.atracarBarco(barco)) {
                    System.out.println(barco.getNome() + " atracado no porto grande");
                }
            }
        }
    }
}
