package classes;

public abstract class Vehicle {
	
	protected int length;
	
	protected int width;
	
	protected Driver driver;
	
	protected int maxSpeed;
	
	protected int brakingDistance;
	
	protected Position startingPosition; 	
	
	protected Position endingPosition;

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getBrakingDistance() {
		return brakingDistance;
	}

	public void setBrakingDistance(int brakingDistance) {
		this.brakingDistance = brakingDistance;
	}

	public Position getStartingPosition() {
		return startingPosition;
	}

	public void setStartingPosition(Position startingPosition) {
		this.startingPosition = startingPosition;
	}

	public Position getEndingPosition() {
		return endingPosition;
	}

	public void setEndingPosition(Position endingPosition) {
		this.endingPosition = endingPosition;
	}
		
	
}
