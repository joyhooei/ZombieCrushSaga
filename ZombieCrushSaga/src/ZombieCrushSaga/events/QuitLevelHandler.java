/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ZombieCrushSaga.events;

import ZombieCrushSaga.ui.ZombieCrushSagaMiniGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author zhenjin wang
 */
public class QuitLevelHandler implements ActionListener {

    private ZombieCrushSagaMiniGame miniGame;

    public QuitLevelHandler(ZombieCrushSagaMiniGame initMiniGame) {
        miniGame = initMiniGame;
    }

    /**
     * This method is called when the user clicks the window'w X. We respond by
     * giving the player a loss if the game is still going on.
     *
     * @param we Window event object.
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        miniGame.switchToLevelScoreScreen();
    }

}
