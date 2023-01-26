package com.sreejithsown.springsamples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sreejithsown.springsamples.game.GameRunner;
import com.sreejithsown.springsamples.game.MarioGame;
import com.sreejithsown.springsamples.game.PacmanGame;
import com.sreejithsown.springsamples.game.SuperContraGame;

public class App02HelloWorldSpringJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
	}

}
