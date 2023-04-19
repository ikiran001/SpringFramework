package com.in28Minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	private	GamingConsol game;

	public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsol game) {
		this.game=game;
	}

	public void run() {
		System.out.println("ganeRunner :"+game);
		game.up();
		game.down();
		game.left();
		game.right();

	}


}
