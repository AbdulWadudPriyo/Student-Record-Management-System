package Wadud_Project_Java;

public class StudentRecordManagement {
	private StudentNode head;
	public StudentRecordManagement() {
	this.head = null;
	}
	private boolean checkRecord(int RollNo) {
	StudentNode current = head;
	while (current != null) {
	if (current.RollNo == RollNo) {
	return true;
	}
	current = current.next;
	}
	return false;
	}
	public void createRecord(String Name, int RollNo, String Course, float TotalMarks) {
	if (checkRecord(RollNo)) {
	System.out.println("Record with roll number " + RollNo + " already exists.");
	return;
	}
	StudentNode newNode = new StudentNode(Name, RollNo, Course, TotalMarks, null);
	if (head == null || head.RollNo > RollNo) {
	newNode.next = head;
	head = newNode;
	}
	else {
	StudentNode current = head;
	while (current.next != null && current.next.RollNo < RollNo) {
	current = current.next;
	}
	newNode.next = current.next;
	current.next = newNode;
	}
	System.out.println("Record with roll number " + RollNo + " has been added.");
	}
	public void searchRecord(int RollNo) {
	StudentNode current = head;
	while (current != null) {
	if (current.RollNo == RollNo) {
	System.out.println("Record Found: Name: "+current.Name+" RollNo: "+current.RollNo+" Course: "+current.Course+" Total Marks: "+current.TotalMarks);
	return;
	}
	current = current.next;
	}
	System.out.println("Record with roll number " + RollNo + " not found");
	}
	public void deleteRecord(int RollNo) {
	if (head == null) {
	System.out.println("No records to delete.");
	return;
	}
	if (head.RollNo == RollNo){
	head = head.next;
	System.out.println("Record with roll number " + RollNo + " has been deleted.");
	return;
	}
	StudentNode current = head;
	while (current.next != null && current.next.RollNo != RollNo) {
	current = current.next;
	}
	if (current.next == null) {
	System.out.println("Record with roll number " + RollNo + " not found.");
	}
	else {
	current.next = current.next.next;
	System.out.println("Record with roll number " + RollNo + " has been deleted.");
	}
	}
	// Show all student records
	public void showRecords() {
	if (head == null) {
	System.out.println("No records found.");
	return;
	}
	StudentNode current = head;
	while (current != null) {
	System.out.println("Name: "+ current.Name +", Roll Number: "+ current.RollNo+", Course: "+ current.Course +", Total Marks: "+ current.TotalMarks); 
	current = current.next;
	}
	}
	
}
