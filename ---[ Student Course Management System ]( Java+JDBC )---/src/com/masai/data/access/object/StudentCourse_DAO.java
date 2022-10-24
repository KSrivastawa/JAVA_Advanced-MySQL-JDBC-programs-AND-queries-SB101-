package com.masai.data.access.object;

import java.util.List;

import com.masai.bean.StudentDataTransferObject;

public interface StudentCourse_DAO {

	public String registerStudfentIntoCousre(int roll, int cid)throws StudentException, CourseException;
	
	public List<StudentDataTransferObject> getAllDetailsByCourseName(String name) throws CourseException;
	
	
}
