package com.Greatlarning.com.Driver;

import java.util.Scanner;

import com.Greatlarning.com.Service.*;
public class Statck_implementetion {

	public static void main(String[] args) {
		
//		Scanner input=new Scanner(System.in);
//		
//		System.out.println("Enter the Total Number of Floor That needs to be constructed ");
//		
//		int N=input.nextInt();
//		
//		int flor_size_arr[]=new int[N];
//		for(int i=0;i<N;i++) {
//			
//			int floor_size=input.nextInt();
//			
//			flor_size_arr[i]=floor_size;
//		}
//		stack_operetion.calculetefloors(flor_size_arr);
		System.out.println("Enter the total no of floors in the building : ");
		try (Scanner sc = new Scanner(System.in)) {
			int numberOfFloors = sc.nextInt();
			int[] listOfFloors = new int[numberOfFloors];
			for (int i = 0; i < numberOfFloors; i++) {
				System.out.println("Enter the floor size given on day : " + (i + 1));
				int floorSize = sc.nextInt();
				listOfFloors[i] = floorSize;
			}
			statck_Operetion.floorcalculetion(listOfFloors);
		
	}

}
}
