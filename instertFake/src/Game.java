
import java.lang.String;


/**
 * Created by Phillip on 4/15/2017.
 */
public class Game {
    public int gameId;
    public String homeTeam;
    public String awayTeam;
    public String goalH;
    public String goalA;
    public String yellowH;
    public String yellowA;
    public String foulsH;
    public String foulsA;
    public String cornersH;
    public String cornersA;
    public String redA;
    public String redH;


    public Game(int gameId, String homeTeam, String awayTeam, String goalsH, String goalsA, String cornersH, String cornersA, String foulsH, String foulsA, String yellowH, String yellowA, String redH, String redA)
    {
        this.gameId = gameId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.goalH = goalsH;
        this.goalA = goalsA;
        this.yellowA = yellowA;
        this.yellowH = yellowH;
        this.foulsA = foulsA;
        this.foulsH = foulsH;
        this.cornersA = cornersA;
        this.cornersH =cornersH;
        this.redA = redA;
        this.redH = redH;

    }

}
