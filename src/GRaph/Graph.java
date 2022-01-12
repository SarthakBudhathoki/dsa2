package GRaph;

public class Graph {
	
	int matrix[][];
	int size;
	
	Graph(int v){
		matrix=new int[v][v];
		this.size=v;	
	}
	
	public void addEdges(int source, int destination) {
	  matrix[source][destination]=1;
	  matrix[destination][source]=1;
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
	Graph g=new Graph(4);
	g.addEdges(0, 1);
	g.addEdges(0, 2);
	g.addEdges(0, 3);
	g.addEdges(1, 3);
	g.printMatrix();
	g.printGraph();
}	

}
