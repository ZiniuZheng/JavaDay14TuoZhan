package tuozhan;

import java.util.LinkedList;

public class Test4 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(new LinkedList<>());
		stack.popIn("java");
		stack.popIn("hello");
		stack.popIn("world");
		
		System.out.println(stack.popOut());
		System.out.println(stack.popOut());
		System.out.println(stack.popOut());
	}
}

class Stack<E>{
	private LinkedList<E> linkedList;
	
	public Stack(LinkedList<E> linkedList) {
		super();
		this.linkedList = linkedList;
	}
	
	public void popIn(E e) {
		linkedList.add(e);
	}
	
	public E popOut() {
		if(linkedList.size()==0) {
			return null;
		}else {
			return linkedList.removeLast();
		}
	}
}
