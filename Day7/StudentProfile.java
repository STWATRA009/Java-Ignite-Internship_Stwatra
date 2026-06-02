/*
(EASY)
Create a class Student:

Requirements:
name
age
marks
Tasks:
Initialize using constructor
Create 2 student objects
Display student details using method
Twist:

Marks should not be accessed directly.

Write your code below
----------------------------------------
*/
class Student
{
	String name;
	int age;
	private int marks;
	
	void setMarks (int marks)
	{
		this.marks=marks;
	}
	
	public int getMarks()
	{
		return marks;
	}
	
	Student (String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void display()
	{
		System.out.println("STUDENT DETAILES:");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Marks: "+getMarks());
		System.out.println("-------------------------");
	}
}
public class Student_profile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Stwatra",19);
		student1.setMarks(96);
		student1.display();
		Student student2 = new Student("Chetan",18);
		student2.setMarks(69);
		student2.display();
	}

}
