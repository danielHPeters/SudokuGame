package sudokugame.controller;

import sudokugame.models.Score;

import java.util.List;

/**
 * Created by Daniel on 27.03.2017.
 */
public class ScoreManager {

    /**
     *
     */
    private List<Score> scores;

    /**
     *
     * @param name
     * @param time
     */
    public void submitScore(String name, long time){

    }

    public void getAllHighScores(){

    }

    /**
     *
     * @return
     */
    public List<Score> getScores() {
        return scores;
    }

    /**
     *
     * @param scores
     */
    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}
