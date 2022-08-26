package com.astradev.gota;

import java.util.Iterator;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.TimeUtils;

public class Gota extends ApplicationAdapter {
	private SpriteBatch batch;
	private OrthographicCamera camera;
	private Texture gotaImage;
	private Texture baldeImage;
	private Sound gotaSound;
	private Music chuvaMusic;
	
	private Rectangle balde;
	private Array<Rectangle> droplets;
	private long instanceLastDroplet;
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		gotaImage = new Texture(Gdx.files.internal("gota.png"));
		baldeImage = new Texture(Gdx.files.internal("balde.png"));
		
		gotaSound = Gdx.audio.newSound(Gdx.files.internal("gota.wav"));
		chuvaMusic = Gdx.audio.newMusic(Gdx.files.internal("chuva.mp3"));
		
		chuvaMusic.setLooping(true);
		chuvaMusic.play();
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
		
		//Criar Balde
		balde = new Rectangle();
		balde.x = 800 / 2 - 64 / 2;
		balde.y = 20;
		
		balde.width = 64;
		balde.height = 64;	
		
		droplets = new Array<Rectangle>();
		newDroplet();
	}

	@Override
	public void render () {
		
		tick();
		
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		camera.update();
		
		batch.setProjectionMatrix(camera.combined);
		
		batch.begin();
		batch.draw(baldeImage, balde.x, balde.y);
		for(Rectangle droplet: droplets) {
			batch.draw(gotaImage, droplet.x, droplet.y);
		}
		batch.end();		
	}
	
	@Override
	public void dispose () {
		baldeImage.dispose();	
		gotaSound.dispose();
		chuvaMusic.dispose();
		gotaSound.dispose();
		batch.dispose();
		
	}
	
	private void tick() {
		if(Gdx.input.isTouched()) {
			Vector3 location = new Vector3();
			location.set(Gdx.input.getX(), Gdx.input.getY(), 0);
			camera.unproject(location);
			balde.x = location.x - 64 / 2;					
		}
		
		if(Gdx.input.isKeyPressed(Keys.LEFT)) 
			balde.x -= 200 * Gdx.graphics.getDeltaTime();
		if(Gdx.input.isKeyPressed(Keys.RIGHT))
			balde.x += 200 * Gdx.graphics.getDeltaTime();
		if(balde.x < 0) balde.x = 0;
		if(balde.x > 800 - 64) balde.x = 800 - 64;
		
		if(TimeUtils.nanoTime() - instanceLastDroplet > 1000000000)
			newDroplet();
		
		for (Iterator<Rectangle> iter = droplets.iterator(); iter.hasNext();) {
			Rectangle droplet = iter.next();
			droplet.y -= 200 * Gdx.graphics.getDeltaTime();
			if (droplet.y + 64 < 0) iter.remove();
			if (droplet.overlaps(balde)) {
				gotaSound.play();
				iter.remove();								
			}
		}
		
	}
	
	private void newDroplet() {
		Rectangle droplet = new Rectangle();
		droplet.x = MathUtils.random(0, 800-64);
		droplet.y = 480;
		droplet.width = 64;
		droplet.height = 64;
		droplets.add(droplet);
		instanceLastDroplet = TimeUtils.nanoTime();
	}
}
