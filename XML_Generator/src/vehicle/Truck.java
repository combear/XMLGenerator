package vehicle;

import classes.Vehicle;

public class Truck extends Vehicle {
	
	private static final int TRUCK_WIDTH = 3;
	
	private static final int TRUCK_LENGTH = 6;
	
	private static final int TRUCK_MAX_SPEED = 90;
	
	public Truck() {
		
		this.width = TRUCK_WIDTH;
		
		this.length = TRUCK_LENGTH;
		
		this.maxSpeed = TRUCK_MAX_SPEED;
	}
	
	public Truck(int truckWidth, int truckLength){
		
		this.width = truckWidth;
		
		this.length = truckLength;
		
		this.maxSpeed = TRUCK_MAX_SPEED;
	}

}
