package cs.mum.edu.statepattern;

import java.util.Random;

public class Game {
    private int totalPoints = 0;
    private Level level;


    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void play() {
        Random random = new Random();
        addPoints(random.nextInt(7));
        System.out.println("points="+totalPoints+" level="+level.getLevel());
    }

    public int addPoints(int newPoints) {
        totalPoints = totalPoints+level.computePoints(this, newPoints);
        return totalPoints;
    }
}
