package com.cognixia.jump.classandobjects;

//This is a class designed to be inherited from

public abstract class TeamSport implements BallPlayer {
	//abstract method - needs to be overridden before its ready to be used
	public abstract void talkToTeamMater();
	// concrete method - ready to be used once inherited
	public double callTimeOut() {
		return 0.0;
	}

}
