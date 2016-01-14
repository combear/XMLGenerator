package classes;

public class Driver {
	
	private static final int STRESSED = 100;
	private static final int CALM = 0;
	private static final int KIND_OF_STRESSED = 50;
	
	private int stressLevel;
	
	public Driver(){
		
		this.setStressLevel(KIND_OF_STRESSED); 
	}
	
	public Driver(int stress){
		
		this.setStressLevel(stress);
	}

	public int getStressLevel() {
		return stressLevel;
	}

	public void setStressLevel(int stressLevel) {
		this.stressLevel = stressLevel;
	}
	
		
}
