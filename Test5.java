package tuozhan;

import java.util.ArrayList;
import java.util.Random;

public class Test5 {

	public static void main(String[] args) {
		//通过随机数，生成8个偶数，偶数的范围在(1-20)之间
		//将生成的偶数添加到集合中
		//实现集合去重
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>(); //装备好容器，装随机产生的偶数
		
		while(true) {
			int ron = r.nextInt(20)+1;
			//证明是个偶数，我们需要添加到集合中
			if(ron%2 == 0) {
				list.add(ron);
				//当集合装了8个偶数的时候就不用再循环了
				if(list.size() == 8) {
					break;
				}
			}
		}
		
		//集合已经装满了8个元素
		System.out.println(list);
		
		//装备新的容器
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(Integer integer: list) {
			//将原集合中的元素放到新集合中，放的时候需要判断新集合是否包含了这个元素
			if(!al.contains(integer)) {
				al.add(integer);
			}
		}
		
		System.out.println(al);
	}
}
