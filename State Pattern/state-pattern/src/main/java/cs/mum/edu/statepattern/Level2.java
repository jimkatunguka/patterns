package cs.mum.edu.statepattern;

public class Level2 implements Level{

	@Override
	public int computePoints(Game game, int newPoints) {
		int totalPoints = game.getTotalPoints();
		totalPoints = totalPoints + newPoints*2;
		if (totalPoints> 20){
			game.setLevel(new Level3());
			totalPoints = totalPoints + 2;//add 2 bonus point
		}
		return totalPoints;
	}

	@Override
	public String getLevel() {
	  String level = "level 2";
	  return level;
	}

}
