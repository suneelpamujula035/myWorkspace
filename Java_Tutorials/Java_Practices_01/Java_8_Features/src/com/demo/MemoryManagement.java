package com.demo;

public class MemoryManagement {

//	public void stactTest(int i)
//	{
//		System.out.println(i);//20532   //42281   
//		i++;
//		if(i<40000) {
//		stactTest(i);//-Xss4m
//		}
//	}
	
	public void heapTest(int n)
	{ int size = n;
		for(int i=0; i<Integer.MAX_VALUE; i++)//671088640 //1342177280
		{
			int a[] = new int[size];
			size = size*2;
			System.out.println(size);//-Xmx2000m
		}
	}
	public static void main(String[] args) {
		//new MemoryManagement().stactTest(1);
		new MemoryManagement().heapTest(10);
	}

}
