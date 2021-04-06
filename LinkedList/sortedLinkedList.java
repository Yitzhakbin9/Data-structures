package LinkedList;

public class sortedLinkedList {

	Node head , tail;
	int size;

	public sortedLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	
	
	
	
	public void Add(int d) {
		// In case the list is empty
		if(head == null) {
			Node n = new Node(d , null);
			head = tail = n;
		}
		//** Adding with sort **

		// if the inserted node is smaller then the head - it becomes the new head
		else if (d <= head.data) {
			Node n = new Node(d,this.head); 
			head = n;
		}

		// 	if the inserted node should be entered in the middle
		else {
			Node temp = head;
			Node prev = head;

			while(temp != null && temp.data < d) {
				prev = temp;
				temp = temp.next;
			}

			// adding after tail
			if (temp == null) {
				Node n = new Node(d , null);
				tail.next = n;
				tail = n;
			}
			// adding in the middle
			else {
				Node n = new Node(d , temp);
				prev.next = n;
			}
		}

		this.size++;
	}




	public int getHead() {
		return head.data;
	}


	public int getTail() {
		return tail.data;
	}


	public int getSize() {
		return size;
	}


	@Override
	public String toString() {

		Node temp = head;
		while(temp != tail) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print(tail.data + "\n");  // This for the String will look like this 1->2->3 (without arrow after the last item)
		return "sortedLinkedList [head=" + head.data + ", tail=" + tail.data + ", size=" + size + "]";
	}




	public void Remove(int data) {
		if(head == null) return;

		else if(head.data == data) {
			this.head = head.next;
			this.size--;
		}

		Node temp = head;
		Node prev = head;

		// find the place of the Node we want to remove
		while(temp.next != null && temp.data < data) {
			prev = temp;
			temp = temp.next;

		}
		// remove tail
		if (temp.next == null && temp.data == data) {
			prev.next = null;
			size--;		
		}

		// remove middle element
		if (temp.next != null && temp.data == data) {
			prev.next = temp.next;
			size--;
		}

	}
}

