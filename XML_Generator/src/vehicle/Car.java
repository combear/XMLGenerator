package vehicle;

import classes.Vehicle;

public class Car extends Vehicle{

	private static final int CAR_WIDTH = 2;
	
	private static final int CAR_LENGTH = 4;
	
	private static final int CAR_MAX_SPEED = 130; 
	
	public Car(){
		
		this.width = CAR_WIDTH;
		
		this.length = CAR_LENGTH;
		
		this.maxSpeed = CAR_MAX_SPEED;
	}
	
	public Car(int carWidth, int carLength){
		
		this.width = carWidth;
		
		this.length = carLength;
		
		this.maxSpeed = CAR_MAX_SPEED;
	}
}
