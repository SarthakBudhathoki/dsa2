package GRaph;

public class weightedGraph {
	
	int matrix[][];
	int size;
	int weight;
	
	weightedGraph(int v){
		matrix=new int[v][v];
		this.size=v;
	}
	
	public void addEdges(int source, int destination, int weight) {
	  matrix[source][destination]=weight;
	}
	
	public void printMatrix() {
		System.out.println("printing matrix");
		for(int i=0;i<size;i++) {
			//i=1
			for(int j=0;j<size;j++) {
				//j=0
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
			
		}
	}
	
	public void printGraph() {
		for(int i=0;i<size;i++) {
			System.out.print(i +" is connected to: ");
			for(int j=0;j<size;j++) {
			if(matrix[i][j]!=0) {
				System.out.print(j+" ");
			}
			}
			System.out.println("");
			
		}
	}
	
public static void main(String [] args) {
	weightedGraph g=new weightedGraph(4);
	g.addEdges(0, 1,4);
	g.addEdges(0, 2,5);
	g.addEdges(0, 3,6);
	g.addEdges(1, 3,7);
	g.printMatrix();
	g.printGraph();
}	

}
