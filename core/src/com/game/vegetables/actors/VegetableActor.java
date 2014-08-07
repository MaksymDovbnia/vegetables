package com.game.vegetables.actors;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.scenes.scene2d.utils.DragListener;

/**
 * Date: 01.08.2014
 * Time: 22:05
 *
 * @author Maksym Dovbnia (maksym.dovbnia@gmail.com)
 */
public class VegetableActor extends Actor {
    private TextureRegion textureRegion = new TextureRegion(new Texture("tomato.png"));
    private int width = 50;
    private int height = 50;

    public VegetableActor() {
        setSize(width, height);
     //   addListener(new VegetableInputListener());
        addListener(new VegetablDragListener());
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(textureRegion, getX(), getY(), getWidth(), getHeight());
    }

    private class VegetableInputListener extends InputListener {
        @Override
        public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
            event.getListenerActor().setSize(width * 2, height * 2);
            return true;
        }

        @Override
        public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
            event.getListenerActor().setSize(width, height);

        }
    }

    private class VegetablDragListener extends DragListener {
        @Override
        public void touchDragged(InputEvent event, float x, float y, int pointer) {
            float xS = event.getStageX();

        }
    }

    float posX = getX();
    float posY = getY();

    public void move(float startX, float starY) {
        posX = startX;
        posY = starY;

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    posX += 5;
                    setPosition(posX, posY);
                    setRotation(10f);
                }
            }
        }).start();
    }
}
