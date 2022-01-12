package GRaph;



public class AdjList {
	
	LinkedLIstTest [] list;
	int size;
	AdjList(int v){
		
		list=new LinkedLIstTest[v];
		this.size=v;
		//creating linked list for each nodes
		
		for(int i=0;i<v; i++) {
			list[i]=new LinkedLIstTest();
		}
	}
	
	public void addEdge(int source,int destination) {
		
		list[source].addNode(destination);
		list[destination].addNode(source);
	}
	
	public void printGraph() {
		
		for(int i=0;i<size;i++) {
			
			System.out.print(i+" is connected to ");
			if(list[i].getSize()>0) {
				for(int j=1;j<=list[i].getSize();j++) {
					System.out.print(list[i].getDataAtPos(j)+" ");	
				}
			}

			System.out.println("");
		}
	}
	
	public static void main(String [] args) {
		
		AdjList adj=new AdjList(4);
		adj.addEdge(0, 1);
		adj.addEdge(0, 2);
		adj.addEdge(0, 3);
		adj.addEdge(2, 3);
		adj.printGraph();
	
		
	}
	

}
