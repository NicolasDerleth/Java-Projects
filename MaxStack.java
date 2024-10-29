public class MaxStack{
	private class Node { // this class is what keeps track of the max
		private int value;
		private Node next;
		private Node oldMax;
	}
	
	private Node stack; 
	private Node max;
	
	public MaxStack() {}
	
	public void push(int x) {
		Node n = new Node();
		n.value = x;
		
		if(stack == null) {
			stack = n;
		}else {
			n.next = stack;
			stack = n;
		}
		
		if(max == null || n.value >max.value) {
			n.oldMax = max;
			max = n;
		}
	}
	public int pop() {
		if(stack == null) throw new IllegalArgumentException;
		Node n = stack;
		stack = n.next;
		if(n.oldMax != null) max = n.oldMax;
			return n.value;
		
		
	}
	public int max() {
		if(max == null) throw new IllegalArgumentException;
		return max.value;
	}


}