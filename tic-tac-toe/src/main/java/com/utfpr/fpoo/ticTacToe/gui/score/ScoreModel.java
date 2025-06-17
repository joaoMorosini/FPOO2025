package com.utfpr.fpoo.ticTacToe.gui.score;

import com.utfpr.fpoo.ticTacToe.model.score.ReadOnlyScoreModel;

public interface ScoreModel extends ReadOnlyScoreModel  {

    void incScoreX();
    void incScoreO();
    void reset();
    
}