package ZombieCrushSaga.data;

/**
 * This class stores game results for a given level. Note that this is
 * just a data holding class. It will be manipulated fully by the
 * ZombieCrushSagaRecord class, which stores all the records and manages
 * loading and saving.
 * 
 * @author Zhenjin Wang
 */
public class ZombieCrushSagaLevelRecord
{
    public int gamesPlayed;
    public int wins;
    public int losses;
    public int moves;
    public int target;
    public long HighestScore;
    public boolean visible;

}
