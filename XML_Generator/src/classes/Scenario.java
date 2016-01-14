package classes;

import java.util.ArrayList;
import java.util.List;

public class Scenario {

	private Environnement environnementScenario;
	
	private List<Vehicle> vehicleList;
	
	public Scenario(Environnement environnement) {
		
		this.environnementScenario = environnement;
		this.vehicleList = new ArrayList<Vehicle>();
	}
	
	public void addVehicle(Vehicle vehicle) {
		
		this.vehicleList.add(vehicle);
	}
	
	
}
