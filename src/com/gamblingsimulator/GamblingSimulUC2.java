package com.gamblingsimulator;

public class GamblingSimulUC2 {
	
      public static void main(String[] args) {
 
    	  int stake = 100;
    	  int bet = 1;
    	  int TRIAL = (int)Math.floor(Math.random()*2);
    	  if(TRIAL == 0) {
    		  stake++;
    		  System.out.println("Gambler won the game" + stake);
    	  }else {
    		  stake--;
    		  System.out.println("Gambler loose the game " + stake);
    		  System.out.println("Gambler having stake after bet are of $" + stake);
    	  }
        }
    }
