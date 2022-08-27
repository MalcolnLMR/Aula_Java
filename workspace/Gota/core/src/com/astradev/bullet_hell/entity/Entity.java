package com.astradev.bullet_hell.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class Entity {
	
	private Texture sprite;
	private Rectangle rectangle;
	
	public Entity() {
		setRectangle(new Rectangle());		
	}

	public Texture getSprite() {
		return sprite;
	}

	public void setSprite(String sprite_file) {		
		this.sprite = new Texture(Gdx.files.internal(sprite_file));
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	
	
	
	

}
