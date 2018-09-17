package com.dungeoncrawler;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.dungeoncrawler.screens.ScrGame;


public class DungeonCrawler extends Game {

	// Width and Height Of Screen
	public int nWidth, nHeight;

	// Screens
	public ScrGame scrGame;
	
	@Override
	public void create () {
		// Gets the width and height
		nWidth = Gdx.graphics.getWidth();
		nHeight = Gdx.graphics.getHeight();

		// Create Screens
		scrGame = new ScrGame(this);
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {

	}

	public void changeScreen(int nScreen) {
		switch (nScreen) {
			case 0:
				// Game
				setScreen(scrGame);
				break;
			default:
				System.out.println("ERROR: INVALID SCREEN ID '"+nScreen+"' Could not switch to that screen");
				break;
		}
	}
}
