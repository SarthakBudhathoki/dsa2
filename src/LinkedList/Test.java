package LinkedList;

public class Test {
	
	public static void main(String [] args) {
		LinkedLIstTest list=new LinkedLIstTest();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.PrintLIst();
		System.out.println("printin any posistion data");
		System.out.println(list.getDataAtPos(2));
		list.removeAtPos(3);
		System.out.println("after removing node");
		list.PrintLIst();
	}

}
