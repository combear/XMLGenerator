package object;

import classes.Position;
import classes.TrafficObject;

public class TrafficLight extends TrafficObject {
	
	private final int redDurationTime;
	
	private final int greenDurationTime;
	
	public TrafficLight(int redTime, int greenTime, Position trafficLightPosition) {
		
		this.greenDurationTime = greenTime;
		this.redDurationTime = redTime;
		this.position = trafficLightPosition;
	}

	public int getRedDurationTime() {
		return redDurationTime;
	}

	public int getGreenDurationTime() {
		return greenDurationTime;
	}
}
