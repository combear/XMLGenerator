package classes;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	private List<Position> positionList;
	
	private List<TrafficObject> trafficObjectList;
	
	public Graph() {
		
		this.positionList = new ArrayList<Position>();
		this.trafficObjectList= new ArrayList<TrafficObject>();
	}
	
	public void addPosition(Position position){
		
		this.positionList.add(position);
	}
	
	public void addObject(TrafficObject object){
		
		this.trafficObjectList.add(object);
	}

	public List<Position> getPositionList() {
		return positionList;
	}

	public List<TrafficObject> getTrafficObjectList() {
		return trafficObjectList;
	}

}
