package LinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sortedLinkedList slt = new sortedLinkedList();
//		slt.Add(1);
//		slt.Add(1);
//		slt.Add(9);
//		slt.Add(9);
		for (int i = 0; i < 100; i++) {
			int rand = (int)(Math.random() * 10) + 1;
			slt.Add(rand);
		}


		System.out.println("Head = " + slt.getHead());
		System.out.println("Tail = " + slt.getTail());
		System.out.println(slt);

	}

}
