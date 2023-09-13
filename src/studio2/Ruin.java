package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter staring amount of money");
		double startAmount= in.nextDouble();
		System.out.println("Enter win probability");
		double winChance= in.nextDouble();
		System.out.println("Enter win limit");
		double winLimit= in.nextDouble();
		System.out.println("How many days do you want to play?");
		double totalSimulations= in.nextDouble();
	 double alpha = (1-winChance)/winChance; 
		double expectedRuin = 0;
		int win = 0; 
		int lose = 0;
		if (winChance == 0.5) {
			expectedRuin = (1-((startAmount)/winLimit));
			
		}
		else 
		{
			expectedRuin= (Math.pow(alpha,startAmount)- Math.pow(alpha, winLimit))/(1-Math.pow(alpha, winLimit));
		}
		int currentSimulation = 0;
	 
    while (totalSimulations > 0)
    	
    {
    	double random = Math.random();
    
    	if (random >= winChance){
    		
    		win ++;
    		currentSimulation ++;
    		System.out.println("Simulation " + currentSimulation + ":"+ "WIN");
    	}
    	else {
    		lose ++;
    		currentSimulation ++;
    		System.out.println("Simulation " + currentSimulation + ":"+ "LOSE");
    	}
    	
       }
	}
	
}
