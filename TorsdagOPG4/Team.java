import java.util.ArrayList;

//2.b
public class Team{
        //1.c
        private String teamName;
        //1.d
        private int rank;
        //1.e
        private ArrayList<String> players = new ArrayList<>();
//1.f
public Team(String teamName){
    this.teamName = teamName;
}

public void setRank(int rank){
    this.rank = rank;
}

public String toString(){
    String result = "Hold: " + teamName + " Rank: " + rank + "\nSpillere:\n";

for (String e : players) {
        result += e +"\n";
    }
    return result;
    
}
public void addPlayer(String playerName){
    players.add(playerName);
}


}