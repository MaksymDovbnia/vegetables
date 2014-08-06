package com.game.vegetables.screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.game.vegetables.actors.VegetableActor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Date: 06.08.14
 * Time: 20:24
 * Screen for our main window, it's game field window
 *
 * @author Maksym Dovbnia (maksym.dovbnia@gmail.com)
 */
public class GameFieldScreen extends GeneralScreen {
    private VegetableActor mVegetableActor;
    private List<VegetableActor> vegetableActorLis;

    public GameFieldScreen(SpriteBatch mSpriteBatch) {
        super(mSpriteBatch);
    }

    @Override
    protected void onCreate() {

        vegetableActorLis = new ArrayList<VegetableActor>();
        initActors();
        moveAllActors();



    }

    private void initActors() {
        int i = 10;
        while (i-- > 0) {
            VegetableActor mVegetableActor = new VegetableActor();
            vegetableActorLis.add(mVegetableActor);
            mStage.addActor(mVegetableActor);

        }
    }

    private void moveAllActors() {
        float x = 0f;
        float y = 0f;
        for (VegetableActor actor : vegetableActorLis) {
            y += mScreenHeight / 9;
            actor.move(x, y);
        }
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        mStage.act(delta);
        mStage.draw();
    }


    @Override
    public void show() {
        Gdx.input.setInputProcessor(mStage);
    }

    @Override
    public void hide() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void pause() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void resume() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void dispose() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
