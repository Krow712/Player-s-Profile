/**
 * 	Author		: Juan P. Munoz
 *	Date		: Feb 22, 2022
 *	File		: BaseballPlayer.java
 *	Description	: The BaseballPlayer is a sub-class that extends the super 
 *				  class Player.  The BaseballPlayer class receives 
 *				  the number of hits by the player and the number of times
 *				  that the player was at the bat. With these variables calculates 
 *				  the statistics of a player. Also determine the status of 
 *				  the player to be true or false.
 */

public class BaseballPlayer extends Player {
	
	private int numberOfHits;		// An int variable to hold the number of hits.
	
	private int numOfTimesAtBat;	// An int variable to hold the number of times
									// at the bat.
	
	public static final double GRADEPOINT = 0.25;	// Creates the check point to
													// determine the player status.
	
	// Creates a default constructor.
	public BaseballPlayer () {
		
	}
	
	// Creates a constructor with eight parameters, two from this subclass
	// and six from the superclass.
	public BaseballPlayer ( int id, String playerName, String teamName,
							String position, double salary, double commissionRate, 
							int numberOfHits, int numOfTimesAtBat) {
		
		setId(id);
		setPlayerName(playerName);
		setTeamName(teamName);
		setPosition(position);
		setSalary(salary);
		setCommissionRate(commissionRate);
		this.numberOfHits = numberOfHits;
		this.numOfTimesAtBat = numOfTimesAtBat;
		
	}
	
	// Getters Methods.
	/**
	 * @return the numberOfHits
	 */
	public int getNumberOfHits() {
		return numberOfHits;
	}

	/**
	 * @return the numOfTimesAtBat
	 */
	public int getNumOfTimesAtBat() {
		return numOfTimesAtBat;
	}
	
	
	// Setters Methods.
	/**
	 * @param numberOfHits the numberOfHits to set
	 */
	public void setNumberOfHits(int numberOfHits) {
		this.numberOfHits = numberOfHits;
	}

	/**
	 * @param numOfTimesAtBat the numOfTimesAtBat to set
	 */
	public void setNumOfTimesAtBat(int numOfTimesAtBat) {
		this.numOfTimesAtBat = numOfTimesAtBat;
	}
	
	// A double data type method to calculate the player's batting average.
	public double calculateStatistics() {
		double average = ((double) numberOfHits / numOfTimesAtBat);
		return average;
	}
	
	// A boolean data type method to determine the player's status.
	// If the player's average is .25 or greater returns true, 
	// otherwise returns false.
	public boolean determineStatus() {
		
		if (calculateStatistics() >= GRADEPOINT) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
