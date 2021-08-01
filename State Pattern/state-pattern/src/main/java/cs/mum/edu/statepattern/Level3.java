package cs.mum.edu.statepattern;

public class Level3 implements Level{

	@Override
	public int computePoints(Game game, int newPoints) {
		int totalPoints = game.getTotalPoints();
		totalPoints = totalPoints + newPoints*3;
		return totalPoints;
	}

	@Override
	public String getLevel() {
		String level = "level 3";
		return level;
	}

}
