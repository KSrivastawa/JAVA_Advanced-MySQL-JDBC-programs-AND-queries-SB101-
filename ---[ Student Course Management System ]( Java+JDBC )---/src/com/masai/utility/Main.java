package com.masai.utility;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		
		Connection conn = DataBaseUtility.provideConnection();
		
		System.out.println(conn);
		
		
		
	}

}