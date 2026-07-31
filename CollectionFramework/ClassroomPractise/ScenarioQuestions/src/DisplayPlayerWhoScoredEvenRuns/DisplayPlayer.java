//Q14.Create Player class:
//playerId
//playerName
//runs
//Store players in Vector and display players who scored even runs.
//Description
//Logical condition:
//runs % 2 == 0
//Input
//1 Virat 75
//2 Rohit 80
//3 Gill 66
//4 KL 59
//Output
//Players with even runs:
//
//2 Rohit 80
//3 Gill 66

package DisplayPlayerWhoScoredEvenRuns;
import java.util.*;

class Player{
	int playerId;
	String playerName;
	int runs;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
}


public class DisplayPlayer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n=sc.nextInt();
		Vector<Object>v=new Vector<>();
		for(int i=0;i<n;i++) {
			Player p=new Player();
			System.out.println("Enter player id name and runs");
			p.setPlayerId(sc.nextInt());
			sc.nextLine();
			p.setPlayerName(sc.nextLine());
			p.setRuns(sc.nextInt());
			v.add(p);
		}
		System.out.println("Players with even runs:");
		for(Object obj:v) {
			Player p=(Player)obj;
			if(p.getRuns()%2==0) {
				System.out.println(p.getPlayerId()+"\t"+p.getPlayerName()+"\t"+p.getRuns()+"\n");
			}
		}

	}

}




