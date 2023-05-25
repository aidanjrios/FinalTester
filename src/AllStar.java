import java.util.ArrayList;
//represents the NBA players who are also considered all stars
public class AllStar extends NBAPlayer
{
    //boolean for whether a player is an all star or not
    private static boolean goodPlayer;
    //array representing all the all stars
    public static ArrayList<AllStar> goodPlayerList = new ArrayList<AllStar>();
    public AllStar(String theName, boolean goodPlayer) {
        super(theName);
        goodPlayerList.add(this);
        this.goodPlayer = goodPlayer;
    }

  //prints the names of the all stars within the arraylist
    public String toString()
    {
        return super.getName();
    }

}
//public static AllStar[] goodPlayerList = new AllStar[playerList.size()];