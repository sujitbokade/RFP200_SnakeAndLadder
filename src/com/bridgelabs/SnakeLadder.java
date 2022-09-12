package com.bridgelabs;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake & Ladder Game");
        int noPlay = 0;
        int ladder = 1;
        int snake = 2;
        int position = 0;
        while (position < 100) {
            int dice = (int) (Math.random() * 10) % 6 + 1;
            System.out.println("Dice " + dice);
            int optionCheck = (int) (Math.random() * 10) % 3;
            System.out.println("Option " + optionCheck);

            if (optionCheck == ladder) {
                System.out.println("Get Ladder");
                position += dice;
            } else if (optionCheck == snake) {
                System.out.println("Get Snake");
                position -= dice;
            } else {
                System.out.println("NO Play");
                position = position;
            }
            if (position < 0) {
                position = 0;
            }
            System.out.println("Position " + position);
        }
    }
}
