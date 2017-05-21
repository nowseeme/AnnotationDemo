package com.now;

import java.util.HashMap;
import java.util.Map;
class Temp{
	public static Map<String, Integer> map = new HashMap<String,Integer>();
	static{
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
	}	
}

public class MyTestThread extends Thread{
	
	private String name;
	public MyTestThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		synchronized (Temp.map) {
			Temp.map.put(name, Temp.map.get(name)+1);
		}
	}
	
	public static void main(String[] args) {
		MyTestThread[]  myTestThread1 = new MyTestThread[10];
		MyTestThread[]  myTestThread2 = new MyTestThread[10];
		MyTestThread[]  myTestThread3 = new MyTestThread[10];
		for(int i=0;i<10;i++){
			myTestThread1[i] = new MyTestThread("a");
			myTestThread2[i] = new MyTestThread("b");
			myTestThread3[i] = new MyTestThread("c");
			myTestThread1[i].start();
			myTestThread2[i].start();
			myTestThread3[i].start();
		}
		System.out.println(Temp.map);
		
	}

}
