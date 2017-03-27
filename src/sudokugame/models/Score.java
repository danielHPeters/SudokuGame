package sudokugame.models;

/**
 * Created by Daniel on 27.03.2017.
 */
public class Score {

    /**
     *
     */
    private String playerName;

    /**
     *
     */
    private long time;

    /**
     *
     * @param playerName
     * @param time
     */
    public Score(String playerName, long time){
        this.playerName = playerName;
        this.time = time;
    }

    /**
     *
     * @return
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     *
     * @return
     */
    public long getTime() {
        return time;
    }
}
