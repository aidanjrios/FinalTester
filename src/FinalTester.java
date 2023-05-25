import java.util.Scanner;

//purpose of the code is to collect a list of NBA players given by the user
//users can sort players by whether they were an all star or not
public class FinalTester {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int x = 0;

        //makes the code loop (x can't be -1, so the only way to exit the code is to say "n" at the end)
        while(x != -1) {
            //asks the user for an NBA player
            System.out.print("Name an NBA player: ");
            String player = input.nextLine();
            //asks the user if the player was ever an all star
            System.out.print("Was your player ever an All Star? \ny or n ");
            String good = input.nextLine();
            //if the player was an all star, they get put into an all star object
            if(good.equals("y"))
            {
                boolean star = true;
                AllStar bestOfBest = new AllStar(player, star);
            }
            //if the player was not an all star, they get put into a normal NBAPlayer object
            else if(good.equals("n"))
            {
                NBAPlayer hooper = new NBAPlayer(player);
            }
            //if the user gives neither of the said responses, it just puts the player into an NBAPlayer object
            else
            {
                System.out.println("I'm just going to assume no...");
                NBAPlayer hooper = new NBAPlayer(player);
            }
            //the list of players is printed
            System.out.println(NBAPlayer.printPlayerList());
            //asks the user if they want to add more players
            System.out.println("Do you want to add any more players? \ny or n");
            String decision1 = input.nextLine();
            //if the user says no, then it exits the loop
            if (decision1.equals("n")) {
                break;
            }
            // yes will continue the loop
            else if (decision1.equals("y")) {
                x = 0;
            }
            //it continues looping until it gets either "y" or "n"
            else {
                System.out.println("That's not a decision...");
            }
        }
        //another while loop for the next decisions (x can't be -1, so the only way to exit the code is to say "finish")
        while(x != -1)
        {
            //asks the user to pick between the options of what they want to do
            System.out.println("What do you want to do now? \n'add' to add more players\n'show' to show your list \n'allstar' to only show all stars\n'finish' to exit");
            String decision2 = input.nextLine();
            //if user says "add", then it goes back to the previous code
            if (decision2.equals("add"))
            {
                while(x != -1) {
                    System.out.print("Name an NBA player: ");
                    String player = input.nextLine();
                    System.out.print("Was your player ever an All Star? \ny or n ");
                    String good = input.nextLine();
                    if(good.equals("y"))
                    {
                        boolean star = true;
                        AllStar goodPlayer = new AllStar(player, star);
                    }
                    else if(good.equals("n"))
                    {
                        NBAPlayer hooper = new NBAPlayer(player);
                    }
                    else
                    {
                        System.out.println("I'm just going to assume no...");
                        NBAPlayer hooper = new NBAPlayer(player);
                    }
                    System.out.println("Do you want to add any more players? \ny or n");
                    String decision1 = input.nextLine();
                    if (decision1.equals("n")) {
                        break;
                    }
                    else if (decision1.equals("y")) {
                        x = 0;
                    }
                    else {
                        System.out.println("That's not a decision...");
                    }
                }
                //if user says "show", then it just prints the list of players
            }
            if(decision2.equals("show"))
            {
                System.out.println(NBAPlayer.printPlayerList());
            }
            //if the user says "allstar", then it sorts the players based on if they were an all star
            if(decision2.equals("allstar"))
            {
                System.out.println(AllStar.goodPlayerList);
            }
            //if the user says "finish", then the code ends
            if (decision2.equals("finish"))
            {
                break;
            }
        }
    }
}