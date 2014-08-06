package com.game.vegetables.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

/**
 * General screen for game.
 * Extends this class for create new screen.
 * <p/>
 * Date: 06.08.14
 * Time: 20:49
 *
 * @author Maksym Dovbnia (maksym.dovbnia@gmail.com)
 */
public abstract class GeneralScreen implements Screen {
    protected SpriteBatch mSpriteBatch;
    protected Stage mStage;
    protected int mScreenWidth;
    protected int mScreenHeight;


    public GeneralScreen(SpriteBatch spriteBatch) {
        mSpriteBatch = spriteBatch;
        mScreenWidth = Gdx.graphics.getWidth();
        mScreenHeight = Gdx.graphics.getHeight();
        mStage = new Stage(new ScreenViewport(), mSpriteBatch);
        onCreate();
    }

    /**
     * initialization operation for screen
     */
    protected abstract void onCreate();

    @Override
    public void render(float delta) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void resize(int width, int height) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void show() {
        //To change body of implemented methods use File | Settings | File Templates.
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
