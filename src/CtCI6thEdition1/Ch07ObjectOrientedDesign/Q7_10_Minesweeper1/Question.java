package CtCI6thEdition1.Ch07ObjectOrientedDesign.Q7_10_Minesweeper1;

public class Question {	
	public static void main(String[] args) {
		Game game = new Game(7, 7, 3);
		game.initialize();
		game.start();
	}

}
