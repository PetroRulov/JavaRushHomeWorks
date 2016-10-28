package com.javarush.test.patterns.ifabrics.chessgames;

public class Games {

    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while(s.move());
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
