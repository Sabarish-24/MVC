package DAO;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import Bean.loginBean;

public class loginDAO {
	public loginBean ua(loginBean l) {
		final String JDBC_DRIVER="com.mysql.jdbc.Driver";
		final String DB_URL="jdbc:mysql://localhost:3306/test";
		
		final String USER="root";
		final String PASS="";
		
		Connection conn=null;
		Statement stmt=null;
		
		String n=l.getUsername();
		String r=l.getPassword();
		loginBean l1=new loginBean();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt=conn.createStatement();
			String sql;
			sql="select * from mark";
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name=rs.getString("name");
				String regno =rs.getString("regno");
				int mark1 =rs.getInt("s1");
				int mark2 =rs.getInt("s2");
				int mark3 =rs.getInt("s3");
				if(r.equals(regno))
				{
					l1.sets1(mark1);
					l1.sets2(mark2);
					l1.sets3(mark3);
				
				}
			}
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			return l1;
			
		}

		}
