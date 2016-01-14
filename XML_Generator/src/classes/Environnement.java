package classes;

public class Environnement {

	private Graph environnementGraph;
	
	private Picture environnementPicture;
	
	public Environnement(Graph graph, Picture picture) {
		
		this.environnementGraph = graph;
		
		this.environnementPicture = picture;
	}
	
	
	public Graph getEnvironnementGraph() {
		return environnementGraph;
	}

	public void setEnvironnementGraph(Graph environnementGraph) {
		this.environnementGraph = environnementGraph;
	}

	public Picture getEnvironnementPicture() {
		return environnementPicture;
	}

	public void setEnvironnementPicture(Picture environnementPicture) {
		this.environnementPicture = environnementPicture;
	}

	
}
