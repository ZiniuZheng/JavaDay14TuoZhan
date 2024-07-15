package tuozhan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.security.auth.Subject;

public class Test2 {

	public static void main(String[] args) {
		Collection<Student> c = new ArrayList<Student>();
		
		c.add(new Student("张三", 16));
		c.add(new Student("李四", 17));
		c.add(new Student("王五", 18));
		c.add(new Student("苏六", 19));
		c.add(new Student("吴七", 20));
		Iterator<Student> it = c.iterator(); //获取迭代器
		//定义一个计时器
		int count = 0;
		//判断有没有下一个元素
		while(it.hasNext()) {
			//取出下一个元素
			Student next = it.next();
			if(next.getAge() > 18) {
				count++;
			}
		}
		
		Demo<Integer> demo = new Demo<Integer>();
		demo.setT(19);
		System.out.println(demo.getT());
	}
}

class Demo1<E>{
	public E getE(E e) {
		return e;
	}
}

class Demo<HELLO>{
	private HELLO t;
	
	public HELLO getT() {
		return t;
	}
	
	public void setT(HELLO t) {
		this.t = t;
	}
}

class Student{
	private String name;
	private int age;
	
	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

