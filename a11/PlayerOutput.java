public class PlayerOutput {
	String Age;
	String Player;
	String Position;
	String Team;
	String Weight;
	static int instance_count;
	int pos = 0;
	
	public PlayerOutput(String Age, String Player, String Position, String Team, String Weight){
		instance_count += 1;
		this.pos = instance_count;
		this.Age = Age;
		this.Player = Player;
		this.Position = Position;
		this.Team = Team;
		this.Weight = Weight;
	}
	
	public String displayInfo() {
		String retvar = pos + ") Age:" + Age +
			" Player: " + Player +
			" Position: " + Position + 
			" Team: " + Team +
			" Weight: " + Weight;
		return retvar;
	}
	
}
