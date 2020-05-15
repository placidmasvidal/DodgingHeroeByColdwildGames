package com.placidmasvidal.dodgingheroebycoldwildgames.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.placidmasvidal.dodgingheroebycoldwildgames.DodgingHero;

public class GameScreen extends DefaultScreen {

    SpriteBatch batch;

    public GameScreen(DodgingHero game) {
        super(game);
        batch = new SpriteBatch();
    }


    @Override
    public void render(float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(game.res.ground, 0, 0, 32, 32);
        batch.draw(game.res.wall, 0, 16, 32, 32);
        batch.end();
    }


    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();
    }
}
