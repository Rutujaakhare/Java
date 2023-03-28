package com.java;

public class MinimumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=20; int v2=30; int v3=40;
		if(v1<v2 && v1<v3)
		{
			System.out.println(v1 + "is the smallest number");
		}
		else if(v2<v1 && v2<v3)
		{
			System.out.println(v2 + "is the smallest number");
		}
		else
		{
			System.out.println(v3 + "is the smallest number");
		}

	}

}
