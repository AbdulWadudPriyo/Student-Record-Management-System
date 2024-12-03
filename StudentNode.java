package Wadud_Project_Java;

public class StudentNode {
	String Name;
	int RollNo;
	String Course;
	float TotalMarks;
	StudentNode next;
	
	
	public StudentNode(String Name, int RollNo, String Course, float TotalMarks, StudentNode next) {
	this.Name = Name;
	this.RollNo = RollNo;
	this.Course = Course;
	this.TotalMarks = TotalMarks;
	this.next = null;
  }
}