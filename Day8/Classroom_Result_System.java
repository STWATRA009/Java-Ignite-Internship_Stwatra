/*
Medium – Classroom Result System

Create a program that:

Stores marks of 10 students in an array
Count:
Number of students who passed (marks >= 35)
Number of students who failed (marks < 35)
Output Example
Passed Students: 7
Failed Students: 3
*/
package JAVA_DAY_8;

import java.util.Scanner;

public class CLASSROOM_RESULT_SYSTEM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter the marks of 10 students out of 100:");
		for(int i =0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		int pass=0,fail=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=35)
			{
				pass++;
			}
			else
			{
				fail++;
			}
		}
		
		System.out.println("Passed students: "+pass);
		System.out.println("Failed students: "+fail);
		
		sc.close();
	}

}

