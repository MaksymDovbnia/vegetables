package com.game.vegetables.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.game.vegetables.VegetablesGame;
import com.game.vegetables.actors.TextureActor;

/**
 * Start Screen for game
 * <p/>
 * Date: 06.08.14
 * Time: 20:20
 *
 * @author Maksym Dovbnia (maksym.dovbnia@gmail.com)
 */
public class StartScreen extends GeneralScreen {
    private TextureActor mStartGameButton;


    public StartScreen(SpriteBatch mSpriteBatch) {
        super(mSpriteBatch);

    }

    @Override
    protected void onCreate() {
        mStartGameButton = new TextureActor(new Texture("knopka_zvychaina.png"));
        mStartGameButton.setSize(100, 100);
        mStartGameButton.setPosition(mScreenWidth / 2, mScreenHeight / 2);
        mStartGameButton.addListener(new StartGameButtonClickListener());
        mStage.addActor(mStartGameButton);
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

    private static class StartGameButtonClickListener extends ClickListener {
        @Override
        public void clicked(InputEvent event, float x, float y) {
            VegetablesGame.getInstance().showGameFieldScreen();

        }
    }
}
