package com.game.vegetables;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.game.vegetables.screens.GameFieldScreen;
import com.game.vegetables.screens.StartScreen;

/**
 * Main game class.
 *
 * @author Maksym Dovbnia (maksym.dovbnia@gmail.com)
 */

public class VegetablesGame extends GeneralGame {
    private SpriteBatch mBatch;
    private GameFieldScreen mGameFieldScreen;
    private StartScreen mStartScreen;
    private static VegetablesGame sVegetablesGame;


    @Override
    public void create() {
        sVegetablesGame = this;
        mBatch = new SpriteBatch();
        mGameFieldScreen = new GameFieldScreen(mBatch);
        mStartScreen = new StartScreen(mBatch);
        //  Gdx.input.setInputProcessor(new GameInputListener());
        setScreen(mStartScreen);
    }

    /**
     * Singleton for {@link VegetablesGame}
     *
     * @return single object
     */
    public static synchronized VegetablesGame getInstance() {
        return sVegetablesGame;
    }

    @Override
    public void showStartScreen() {
        setScreen(mStartScreen);
    }

    public void showGameFieldScreen() {
        setScreen(mGameFieldScreen);
    }


    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public void resume() {
        super.resume();
    }


    /**
     * TODO I dont know if it need
     */
    private static class GameInputListener implements InputProcessor {
        @Override
        public boolean keyDown(int keycode) {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public boolean keyUp(int keycode) {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public boolean keyTyped(char character) {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public boolean touchDown(int screenX, int screenY, int pointer, int button) {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public boolean touchUp(int screenX, int screenY, int pointer, int button) {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public boolean touchDragged(int screenX, int screenY, int pointer) {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public boolean mouseMoved(int screenX, int screenY) {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public boolean scrolled(int amount) {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }
    }


}
