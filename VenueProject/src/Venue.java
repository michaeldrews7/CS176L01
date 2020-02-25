
public class Venue {
	private boolean [][][] allSeats;
		
	public Venue (int section, int row, int seats)
	{
		allSeats = new boolean[section][row][seats];
		for (int i = 0; i < section; i++)
			for (int j = 0; j < row; j++)
				for (int k = 0; k < seats; k++)
				{
					allSeats [i][j][k]= false;
				}
	}
	
	public boolean seatLookup (int section, int row, int seats)
	{
		if (allSeats[section][row][seats] == true) {
			return false;
		}
		else 
			allSeats[section][row][seats]=true;
			return true;
		
	}

}
