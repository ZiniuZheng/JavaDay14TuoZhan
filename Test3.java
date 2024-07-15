package tuozhan;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		MyStack<String> myStack = new MyStack<String>(new ArrayList<String>());
		
		//压栈
		myStack.popIn("你好");
		myStack.popIn("我好");
		myStack.popIn("小雅好");
		myStack.popIn("冰冰好");
		myStack.popIn("可乐好");
		
		//弹栈
		System.out.println(myStack.popOut());
		System.out.println(myStack.popOut());
		System.out.println(myStack.popOut());
		System.out.println(myStack.popOut());
		System.out.println(myStack.popOut());
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("你好");
		arrayList.add("我好");
		arrayList.add("他好");
		
		System.out.println(arrayList.remove(arrayList.size()-1));
		System.out.println(arrayList.remove(arrayList.size()-1));
		System.out.println(arrayList.remove(arrayList.size()-1));
	}
}

class MyStack<E>{
	//需要一个容器
	private ArrayList<E> list;
	
	public MyStack(ArrayList<E> list) {
		super();
		this.list = list;
	}
	
	public void popIn(E e) {
		list.add(e); //压栈的本质就是将元素存到集合中
	}
	
	public E popOut() {
		if(list.size()==0) {
			return null;
		}else {
			return list.remove(list.size()-1);
		}
	}
}
