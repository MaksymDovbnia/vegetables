package com.game.vegetables.actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Date: 06.08.14
 * Time: 20:28
 * Actor only with texture
 *
 * @author Maksym Dovbnia (maksym.dovbnia@gmail.com)
 */
public class TextureActor extends Actor {
    private Texture mTexture;

    public TextureActor(Texture texture) {
        mTexture = texture;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(new TextureRegion(mTexture), getX(), getY(), getWidth(), getHeight());
    }
}
