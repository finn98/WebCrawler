package webcrawler;
import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String url;
	private boolean visited;
//	private Vertex previousVertex;
	private List<Vertex> adjacenciesList;
	
	public Vertex(String url){
		this.url = url;
		this.adjacenciesList = new ArrayList<>();
	}
	
	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

//	public Vertex getPreviousVertex() {
//		return previousVertex;
//	}
//
//	public void setPreviousVertex(Vertex previousVertex) {
//		this.previousVertex = previousVertex;
//	}

	public List<Vertex> getAdjacenciesList() {
		return adjacenciesList;
	}

	public void addNeighbour(Vertex vertex) {
		this.adjacenciesList.add(vertex);
	}

	@Override
	public String toString() {
		return this.url;
	}
}
