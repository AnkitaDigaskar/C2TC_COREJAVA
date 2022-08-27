package com.cg.Week1;

public class BreakForLoop11 {

	public static void main(String[] args) 
	{

		for(int i=1; i<=10;i++);
		{
			System.out.println("before breaking=" + i);
			if(i==6)
			break;
			System.out.println("after breaking=" + i);
		}
		System.out.println("for loop terminated");

	}

}
