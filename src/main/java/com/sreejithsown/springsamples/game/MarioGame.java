package com.sreejithsown.springsamples.game;

public class MarioGame implements GamingConsole{

	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Go to hole");
	}
	public void right() {
		System.out.println("Accelerate");
	}
	public void left() {
		System.out.println("Go Back");
	}
}
