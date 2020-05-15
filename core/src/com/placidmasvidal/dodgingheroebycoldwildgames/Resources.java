package com.placidmasvidal.dodgingheroebycoldwildgames;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Resources {

    TextureAtlas gameSprites;

    public TextureRegion ground;
    public TextureRegion wall;

    public Resources(){

        gameSprites = new TextureAtlas(Gdx.files.internal("packed/game.atlas"));
        ground = gameSprites.findRegion("ground");
        wall = gameSprites.findRegion("wall");
    }

    public void dispose(){
        gameSprites.dispose();
    }

}
