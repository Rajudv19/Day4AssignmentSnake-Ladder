package com.BridgeLabs.day4;

public class SnakeNLadderUc2 
{
	static final int START_POSITION = 0;

    public static void main(String[] args) {
        // Dices Rolling
        
        int diceRolling = (int) Math.floor(Math.random() * 10) % 7;
        if (diceRolling == 0) {
            diceRolling = diceRolling + 1;
        }
        System.out.println("Number on die is: " + diceRolling);
    }
}
