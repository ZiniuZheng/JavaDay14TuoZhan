package tuozhan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		Collection c = new ArrayList<>();
		
		c.add(new Object());
		c.add("abc");
		
		boolean contains = c.contains(new Object());
		System.out.println(contains);
		
		//通过iterator方法获取Iterator对象
		Iterator it = c.iterator();
		
		//通过对象的hasNext()方法判断有没有下一个元素，如果有就迭代
		while(it.hasNext()) {
			//只是判断有没有下一个，并没有取出
			Object next = it.next(); //这个才是真正取出元素
			System.out.println(next);
		}
		System.out.println(c);
	}
}
