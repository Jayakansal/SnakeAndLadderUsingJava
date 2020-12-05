package com.java.SnakeAndLadder;
import java.util.Random;

public class SnakeAndLadder {

	//UC1 Variable Initialized at starting Positions
	//public static int getIntilizePosition() {
	     static final int PLAYER=1;
	     static final int STARTPOSTION=0;
	     
      public static void main(String[] args)
	 	{
	 		System.out.println("Welcome to the Snake And Ladder Game");
	 	}	

    //UC2 Rolls the die 
    static int Roll_Dice() {	
	Random random=new Random();
    int randomNum=random.nextInt(5)+1;
    return randomNum;
    }
    
	
}

