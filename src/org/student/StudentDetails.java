package org.student;
import java.util.Scanner;

public class StudentDetails {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student ID");
		long studentId=scan.nextLong();
		System.out.println("Student Id Number:"+studentIdNumber);
		
		System.out.println("Enter your Name");
		String studentName=scan.next();
		System.out.println("Student Name Is:"+studentName);
		
		System.out.println("Enter your Mark1");
		byte mark1=scan.nextByte();
		System.out.println("mark1:"+mark1);
		
		System.out.println("Enter your mark2");
		byte mark2=scan.nextByte();
		System.out.println("mark2:"+mark2);
		
		System.out.println("Enter your mark3");
		byte mark3=scan.nextByte();
		System.out.println("mark3:"+mark3);
		
		System.out.println("Enter your mark4");
		byte mark4=scan.nextByte();
		System.out.println("mark4:"+mark4);
		
		System.out.println("Enter your mark5");
		byte mark5=scan.nextByte();
		System.out.println("mark5:"+mark5);
		//finding Total
		
		long total=mark1+mark2+mark3+mark4+mark5;
		System.out.println("Total:"+total);
		
		//finding average
		float average=total/5;
		System.out.println("Average:"+average);
		//finding average
			//	float average=total/5;
				//System.out.println("Average:"+average);
						
		
		
	
		
		
		
	}
	

}
