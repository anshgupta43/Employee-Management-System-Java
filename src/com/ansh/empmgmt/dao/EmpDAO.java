package com.ansh.empmgmt.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ansh.empmgmt.dbutil.DBConnection;
import com.ansh.empmgmt.pojo.EmpPojo;

public class EmpDAO {
	public static boolean addEmp(EmpPojo e)throws SQLException {
		Connection conn=DBConnection.getConnection();
		PreparedStatement ps=conn.prepareStatement("Insert into emp values(?,?,?,?)");
		ps.setInt(1,e.getEmpno());
		ps.setString(2,e.getEname());
		ps.setDouble(3,e.getSal());
		ps.setInt(4,e.getDeptno());
		return ps.executeUpdate()==1;
					
	}
	public static EmpPojo searchById(int empno) throws SQLException{
		Connection conn=DBConnection.getConnection();
		PreparedStatement ps=conn.prepareStatement("Select * from emp where empno=?");
		ps.setInt(1, empno);
		ResultSet rs=ps.executeQuery();
		EmpPojo e=null;
		if(rs.next()) {
			int eno=rs.getInt(1);
			String name=rs.getString(2);
			double sal=rs.getDouble(3);
			int dno=rs.getInt(4);
			e=new EmpPojo();
			e.setEmpno(eno);
			e.setEname(name);
			e.setSal(sal);
			e.setDeptno(dno);
			
		}
		return e;
		
	}
	public static List<EmpPojo> getAllEmp()throws SQLException{
		Connection conn=DBConnection.getConnection();
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("Select * from emp order by empno");
	    List<EmpPojo>empList=new ArrayList<>();
	    while(rs.next()) {
	    	int eno=rs.getInt(1);
			String name=rs.getString(2);
			double sal=rs.getDouble(3);
			int dno=rs.getInt(4);
			EmpPojo e=new EmpPojo();
			e.setEmpno(eno);
			e.setEname(name);
			e.setSal(sal);
			e.setDeptno(dno);
			empList.add(e);
	    }
	    return empList;
		
	}
	public static boolean updateEmp(int eno,EmpPojo e)throws SQLException{
		Connection conn=DBConnection.getConnection();
		PreparedStatement ps=conn.prepareStatement("Update emp set ename=?,sal=?,deptno=? where empno=?");
		ps.setString(1,e.getEname());
		ps.setDouble(2,e.getSal());
		ps.setInt(3,e.getDeptno());
		ps.setInt(4,eno);
		return ps.executeUpdate()==1;
	}
	public static boolean deleteEmp(int eno)throws SQLException{
		
		Connection conn=DBConnection.getConnection();
		PreparedStatement ps=conn.prepareStatement("Delete from emp where empno=?");
		ps.setInt(1,eno);
		return ps.executeUpdate()==1;
	}
}
