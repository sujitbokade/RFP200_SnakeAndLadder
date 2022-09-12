package com.bridgelabs;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake & Ladder Game");
        int startPosition = 0;
        int dice = (int) (Math.random() * 10) % 6 + 1;
        System.out.println(dice);
    }
}
