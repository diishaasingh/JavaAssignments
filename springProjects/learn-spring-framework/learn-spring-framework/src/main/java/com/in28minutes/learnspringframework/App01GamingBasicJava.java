package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;


public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();//1.Object creation
		var gameRunner = new GameRunner(game);//2. Object creation + wiring of dependencies
		//game is a dependency of GamerUNNER
		gameRunner.run();

	}

}
