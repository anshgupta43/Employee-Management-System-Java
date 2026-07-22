package com.ansh.empmgmt.pojo;

public class EmpPojo {
   private int empno;
   private String ename;
   private double sal;
   private int deptno;
   
   public EmpPojo(int empno, String ename, double sal, int deptno) {
	   this.empno = empno;
	   this.ename = ename;
	   this.sal = sal;
	   this.deptno = deptno;
   }
   
   public EmpPojo() {
	   
   }
   
   //Geeter and Setter

   public int getEmpno() {
	return empno;
   }

   public void setEmpno(int empno) {
	this.empno = empno;
   }

   public String getEname() {
	return ename;
   }

   public void setEname(String ename) {
	this.ename = ename;
   }

   public double getSal() {
	return sal;
   }

   public void setSal(double sal) {
	this.sal = sal;
   }

   public int getDeptno() {
	return deptno;
   }

   public void setDeptno(int deptno) {
	this.deptno = deptno;
   }

   @Override
   public String toString() {
	return "EmpPojo [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", deptno=" + deptno + "]";
   }

}
