package Wadud_Project_Java;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		StudentRecordManagement srm = new StudentRecordManagement();
		Scanner sc = new Scanner(System.in);
		System.out.println("\t--------------Welcome to Student Management System Analysis--------------");
		while (true) {
            System.out.println("\nOptions: ");
            System.out.println("1. Create Record");
            System.out.println("2. Search Record");
            System.out.println("3. Delete Record");
            System.out.println("4. Show All Records");
            System.out.println("5. Exit");
            System.out.println("Enter option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Total Marks: ");
                    float marks = sc.nextFloat();
                    srm.createRecord(name, rollNo, course, marks);
                    break;
                case 2:
                    System.out.print("Enter Roll Number to Search: ");
                    rollNo = sc.nextInt();
                    srm.searchRecord(rollNo);
                    break;
                case 3:
                    System.out.print("Enter Roll Number to Delete: ");
                    rollNo = sc.nextInt();
                    srm.deleteRecord(rollNo);
                    break;
                case 4:
                    srm.showRecords();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
		
		
	}

}
