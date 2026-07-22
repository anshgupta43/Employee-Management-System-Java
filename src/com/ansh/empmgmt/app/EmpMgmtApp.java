package com.ansh.empmgmt.app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.ansh.empmgmt.dao.EmpDAO;
import com.ansh.empmgmt.dbutil.DBConnection;
import com.ansh.empmgmt.pojo.EmpPojo;

public class EmpMgmtApp {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("Select an Operation : ");
			System.out.println("1. Add Emp \n2. Search Emp \n3. View All Emp \n4. Update Emp \n5. Delete Emp \n6. Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				addEmp();
				break;
			case 2 : 
				searchEmp();
				break;
			case 3 :
				viewAllEmp();
				break;
			case 4 :
				updateEmp();
				break;
			case 5 :
				deleteEmp();
				break;
			case 6 :
				DBConnection.closeConnection();
				System.out.println("Thank You Have a Nice Day..");
				break;
			default :
					System.out.println("Invalid Choice ..Try Again ");
			}
		}while(choice != 6);
     
	}
	
	//Add Employee
	public static void addEmp() {
		System.out.println("Entet Emp id : ");
		int id = sc.nextInt();
		
		System.out.println("Enter Emp name : ");
		String name = sc.next();
		
		System.out.println("Enter salary : ");
		double sal = sc.nextDouble();
		
		System.out.println("Enter dept no : ");
		int dno = sc.nextInt();
		
		EmpPojo e = new EmpPojo();
		e.setEmpno(id);
		e.setEname(name);
		e.setSal(sal);
		e.setDeptno(dno);
		
		boolean res = false;
		try {
			res = EmpDAO.addEmp(e);
		}catch(SQLException ex) {
			System.out.println("Error in inserting the record : " + ex.getMessage());
		}
		if(res == true) {
			System.out.println("Rec inserted..");
		}else{
			System.out.println("Rec Not inserted");
		}
	}
	
	//Search Employee
	public static void searchEmp() {
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		
		try {
			EmpPojo e = EmpDAO.searchById(id);
			if(e != null) {
				System.out.println(e);
			}else {
				System.out.println("Rec not found");
			}
		}catch(SQLException ex) {
			System.out.println("Errror in searching the rec : " + ex.getMessage());
		}
	}
	
	//View All Employee
	// View All Employee
	public static void viewAllEmp() {
	    try {
	        List<EmpPojo> empList = EmpDAO.getAllEmp();

	        if (empList.isEmpty()) {
	            System.out.println("\nNo Employee Found in Database.");
	        } else {

	            System.out.println("\n===================== EMPLOYEE RECORDS =====================");
	            System.out.printf("%-10s %-20s %-15s %-10s%n",
	                    "Emp ID", "Employee Name", "Salary", "Dept No");
	            System.out.println("------------------------------------------------------------");

	            for (EmpPojo e : empList) {
	                System.out.printf("%-10d %-20s %-15.2f %-10d%n",
	                        e.getEmpno(),
	                        e.getEname(),
	                        e.getSal(),
	                        e.getDeptno());
	            }

	            System.out.println("------------------------------------------------------------");
	            System.out.println("Total Employees : " + empList.size());
	        }

	    } catch (SQLException ex) {
	        System.out.println("Error in displaying records: " + ex.getMessage());
	    }
	}
	
	//Update Employee
	public static void updateEmp() {
		System.out.println("Enter Emp id : ");
		int id = sc.nextInt();
		
		System.out.println("Enter name of Emp : ");
		String name = sc.next();
		
		System.out.println("Enter sal of Emp : ");
		double sal = sc.nextDouble();
		
		System.out.println("Enter dept no : ");
		int dno = sc.nextInt();
		
		boolean res = false;
		try {
			EmpPojo e = new EmpPojo();
			e.setEmpno(id);
			e.setEname(name);
			e.setSal(sal);
			e.setDeptno(dno);
			
			res = EmpDAO.updateEmp(id, e);
		}catch(SQLException ex) {
			System.out.println("Error in Updatin the Rec : " + ex.getMessage());
		}
		if(res == true) {
			System.out.println("Rec Updated");
		}else {
			System.out.println("Rec Not Updated");
		}
	}
	
	//Delete Employee
	public static void deleteEmp() {
		System.out.println("Enter emp id : ");
		int id = sc.nextInt();
		boolean res = false;
		try {
			res = EmpDAO.deleteEmp(id);
		}catch(SQLException ex) {
			System.out.println("Error in deleting the Rec : " + ex.getMessage());
		}
		if(res == true) {
			System.out.println("Rec Deleted");
		}else {
			System.out.println("Rec Not Deleted");
		}
	}
}
