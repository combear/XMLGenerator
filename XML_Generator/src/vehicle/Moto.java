package vehicle;

import classes.Vehicle;

public class Moto extends Vehicle {
	
	private static final int MOTO_WIDTH = 1;
	
	private static final int MOTO_LENGTH = 2;
	
	private static final int MOTO_MAX_SPEED = 160; 
	
	public Moto() {
		
		this.width = MOTO_WIDTH;
		
		this.length = MOTO_LENGTH;
		
		this.maxSpeed = MOTO_MAX_SPEED;
	}
	
	public Moto(int motoWidth, int motoLength){
		
		this.width = motoWidth;
		
		this.length = motoLength;
		
		this.maxSpeed = MOTO_MAX_SPEED;
	}

}
