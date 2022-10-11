package com.cognixia.jump.classandobjects;

//import java.util

public class AbstractClassandInterfacesDriver {

	public static void main(String[] args) {
	
		
		// Showing inheritance and polymorphism in instantiating objects
		BasketballPlayer bBallPlayer1 = new BasketballPlayer();
		TeamSport bBallPlayer2 = new BasketballPlayer();
		BallPlayer bBallPlayer3 = new BasketballPlayer();
		GamePlayer bBallPlayer4 = new BasketballPlayer();
		
		GamePlayer[] team1 = new GamePlayer[5];
		
		System.out.println(bBallPlayer1.callTimeOut());
		System.out.println(bBallPlayer2.callTimeOut());
		
		BallPlayer.showClock();
		
		
		

	}

}
