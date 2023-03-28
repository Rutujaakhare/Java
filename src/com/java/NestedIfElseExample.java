package com.java;

public class NestedIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=20; int v2=30; int v3=40;
		if(v1<v2)
		{
			if(v1<v2)
			{
				System.out.println(v1 + "is the smallest");
			}
		}
		else
		{
			if(v2<v1)
			{
				if(v2<v3)
				{
					System.out.println(v2 + "is the smallest");
				}
				else
				{
					System.out.println(v3 + "is the smallest");
				}
			}
		}
		

	}

}
