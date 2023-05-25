import java.util.ArrayList;
//class representing the players
public class NBAPlayer {

    //variable for name
    private String name;
    //arraylist for all players
    public static ArrayList<NBAPlayer> playerList = new ArrayList<NBAPlayer>();


    public NBAPlayer(String theName)
    {
        name = theName;
        playerList.add(this);
    }
//returns the name of the player
    public String getName()
    {
        return this.name;
    }

//prints a list of all of the players given by the user
    public static String printPlayerList()
    {
        String names = "";
        for(NBAPlayer name: playerList)
        {
            names+= name.getName() + "\n";
        }
        return "Player List:\n" + names;
    }
}