package com.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SwitchExample{
	public static void main(String[]args) {
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(ins);
		
		System.out.println("Enter a number between 1 to 7:");
		int choice=Integer.parseInt(br.readLine());
		
		switch(choice)
		{
		case 1: System.out.println("sunday");
		break;
		case 2: System.out.println("monday");
		break;
		case 3: System.out.println("tuesday");
		break;
		case 4: System.out.println("weednesday");
		break;
		case 5: System.out.println("thursday");
		break;
		case 6: System.out.println("friday");
		break;
		case 7: System.out.println("saturday");
		break;
		default:System.out.println("Wrong choice");
		
		
		}
	}
	
}