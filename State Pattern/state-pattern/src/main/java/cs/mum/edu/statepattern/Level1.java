package cs.mum.edu.statepattern;

public class Level1 implements Level {

	@Override
	public int computePoints(Game game, int newPoints) {
		int totalPoints = game.getTotalPoints();
		totalPoints = totalPoints + newPoints;
		if (totalPoints > 10) {
			game.setLevel(new Level2());
			totalPoints = totalPoints + 1;
		}
		return totalPoints;
	}

	@Override
	public String getLevel() {
		String level = "level 1";
		return level;
	}

}
