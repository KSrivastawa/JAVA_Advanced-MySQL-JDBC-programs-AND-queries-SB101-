package com.masai.data.access.object;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.utility.DataBaseUtility;

public class Course_DAO_Impl implements Course_DAO {

	@Override
	public String registerCourse(String cname, int fee) {
		String status =  "Not Inserted";
		
		try(Connection conn = DataBaseUtility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into course(cname,fee) values(?,?)");
			
			ps.setString(1, cname);
			ps.setInt(2, fee);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				status = "Student Register Successfully...";
				
			}
			
			
			
		} catch (SQLException e) {
			status = e.getMessage();
		}
		
		
		
		
		
		return status;
	}

	
}
