package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[][] filmes = {{"Homens de Preto", "Arrival"}, {"Shrek", "Gladiador"}};

        System.out.println("Pergunta 1: Que ambientação você prefere?");
        System.out.println("1. Sci-fi ");
        System.out.println("2. Medieval ");
        int ambientacao = leitor.nextInt();

        System.out.println("-----------------");
        System.out.println("Pergunta 2: Que gênero você prefere? ");
        System.out.println("1. Comédia");
        System.out.println("2. Drama");
        int genero = leitor.nextInt();
        System.out.println("-----------------");

        System.out.println(filmes[ambientacao-1][genero-1]);
    }
}