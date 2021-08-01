package cs.mum.edu.statepattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatePatternApplication {

	public static void main(String[] args) {

		SpringApplication.run(StatePatternApplication.class, args);

		Game game = new Game();
		Level level1 =  new Level1();
		game.setLevel(level1);
		game.play();
		game.play();
		game.play();
		game.play();
		game.play();
	}

}
