package com.sreejithsown.springsamples;

import com.sreejithsown.springsamples.game.GameRunner;
import com.sreejithsown.springsamples.game.MarioGame;
import com.sreejithsown.springsamples.game.PacmanGame;
import com.sreejithsown.springsamples.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	var game = new SuperContraGame();
	//	var game = new MarioGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
