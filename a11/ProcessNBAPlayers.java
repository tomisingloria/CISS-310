import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ProcessNBAPlayers {
	
	public static void main(String[] args) {
		
		String csvFile = ".\\nbaplayers.csv";
		String line = "";
		String csvSplitBy = ",";
		ArrayList<PlayerOutput> PlayerOutput = new ArrayList<PlayerOutput>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			while ((line = br.readLine()) != null) {
				
				String[] rowdata = line.split(csvSplitBy);
				
				String myAge = rowdata[0];
				String myPlayer = rowdata[1];
				String myPosition = rowdata[2];
				String myTeam = rowdata[3];
				String myWeight = rowdata[4];
				
				PlayerOutput.add(new PlayerOutput(myAge, myPlayer, myPosition, myTeam, myWeight));
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	
	

	System.out.println("\nPrinting first 10 'NBA Players of the Week'!");
	for (PlayerOutput mzip: PlayerOutput) {
		if(mzip.pos < 11)
			System.out.println(mzip.displayInfo());
	}
	
	System.out.println("\nHere are all of the players that have been the NBA Player of the Week from the Golden State Warriors.");
	for (PlayerOutput mzip: PlayerOutput) {
		if(mzip.Team.equals("Golden State Warriors"))
			System.out.println(mzip.displayInfo());
	}
	
		System.out.println("\nHere are all of the players that have been the NBA Player of the Week that are Point Guard.");
	for (PlayerOutput mzip: PlayerOutput) {
		if(mzip.Position.equals("PG"))
			System.out.println(mzip.displayInfo());
	}
	
	
	}
}
