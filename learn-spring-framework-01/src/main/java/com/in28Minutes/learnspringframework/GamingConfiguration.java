package com.in28Minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.in28Minutes.learnspringframework.game.GameRunner;
import com.in28Minutes.learnspringframework.game.GamingConsol;
import com.in28Minutes.learnspringframework.game.PacManGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsol game(){
		var game=new PacManGame();
		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsol game) {
		var gameRunner=new GameRunner(game);
		return gameRunner;
	}	

}
