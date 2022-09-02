package com.astradev.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Teste {

	/*
	public static void main(String[] args) {
		
	}*/

	static SpriteBatch batch;
	static Texture img;
	
	public void create() {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");		
	}
	
	public static void create01() {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");		
	}

}
