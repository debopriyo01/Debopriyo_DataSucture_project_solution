package com.Greatlarning.com.Service;

import java.util.Arrays;
import java.util.Stack;
public class statck_Operetion {
	
	public  static void floorcalculetion(int listOfFloors[]) {
		boolean largest_element=true;
	Stack<Integer> stack=new Stack<>();
	for(int i=0;i<listOfFloors.length;i++) {
			int floor_i=listOfFloors[i];
			
			for(int j=i+1;j<listOfFloors.length;j++) {
			int floor_j=listOfFloors[j];
				// hear we will  be apply the condition:-
				if(floor_i>=floor_j) {
					largest_element=true;
					continue;
				}else {
				largest_element=false;
					stack.push(floor_j);// now the element which is present inside the statck which is not the largest elemnt :-
					break;
				}
			}
			if(largest_element==true) {
				Stack stacktemp=displayFloor(stack,floor_i,i,listOfFloors);
				stack.clear();
				stack=(Stack<Integer>)stacktemp.clone();
				stacktemp.clear();
			}else {
				
				System.out.println("The work on Day :"+(i+1)+" ");
			System.out.println();
			}
		}
		
	}
	public static Stack displayFloor(Stack stack,int floor_i,int index,int listOfFloors[]) {
		
		// In this methode the pop items will be displayed :-
	// lets take the arrey of pop items which will be the length of the listOfFloors:-
		boolean larget_value_in_statck=true;
		int arrOfPopvalues[]=new int[listOfFloors.length];
		int count=0;
		
		System.out.println("The work on Day"+(index+1)+floor_i);
		System.out.println();
		Stack<Integer> stackTmp = new Stack<Integer>();
		
		if(index==listOfFloors.length-1) {
			
			while(!stack.empty()) {
				
				int popFloor=(int )stack.pop();
				arrOfPopvalues[count++]=popFloor;
			}
			if(arrOfPopvalues!=null) {
				
				Arrays.sort(arrOfPopvalues);
				
				for(int  i=arrOfPopvalues.length-1;i>0;i--) {
					
					System.out.println(" "+arrOfPopvalues[i]);
				}
			}
			return stackTmp;
		}else {
			if(!stack.empty()) {
				
				while(!stack.empty()) {
					
					int popFloor=(int) stack.pop();
					
					for(int i=index;i<listOfFloors.length;i++) {
						
						if(i==index) {
							
							continue;
						}
						if(popFloor<listOfFloors[i]) {
							
							stackTmp.push(popFloor);
							larget_value_in_statck=false;
							break;
						}else {
							larget_value_in_statck=true;
						}
					}
					if(larget_value_in_statck==true) {
						
						arrOfPopvalues[count++]=popFloor;
					}
				}
			}
			if(arrOfPopvalues!=null) {
				
				Arrays.sort(arrOfPopvalues);
				
				for(int i=arrOfPopvalues.length-1;i>0;i--) {
					
					if(arrOfPopvalues[i]!=0) {
						System.out.println(" "+arrOfPopvalues[i]);
					}
				}
			}
			return stackTmp;
		}
		
		
	}
	
}
