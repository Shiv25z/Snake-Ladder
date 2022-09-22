package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class SnakeLadder {

    public static void main(String[] args) {
        System.out.println(" Welcome to Snake and Ladder Game! ");
        Random random = new Random();


        int player = 0;// uc1
        System.out.println("Player position => "+player);

        int dice = random.nextInt(6)+1;// uc2


        int game = random.nextInt(3)+1; // uc3

        switch(game){
            case 1:
                player +=0;
                System.out.println("New Score of Player is => "+player);
                break;

            case 2:
                player = player + dice;
                System.out.println("New Score of Player is => "+player);
                break;

            case 3:
                player = player - 2 * dice;
                System.out.println("New Score of Player is => "+player);
                break;
        }




    }

}
