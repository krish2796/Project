package com.wisdom.primefaces.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.wisdom.primefaces.model.Student;

public class StudentService {
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost/wisdom_prime";
	final String USER = "root";
	final String PASS = "";

	public boolean insertRecode(Student stud) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean state = false;
		try {
			Class.forName(JDBC_DRIVER);
			try {
				System.out.println("Connecting to Database...");
				con = DriverManager.getConnection(DB_URL, USER, PASS);
				System.out.println("Executing SQL...");

				String sql = "INSERT INTO student " + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, stud.getRegNo());
				pstmt.setString(2, stud.getFirstName());
				pstmt.setString(3, stud.getLastName());
				pstmt.setTimestamp(4, new java.sql.Timestamp(stud.getDob().getDate()));

				pstmt.setString(5, stud.getNic());
				pstmt.setString(6, stud.getEmail());
				pstmt.setString(7, stud.getPhoneNo());
				pstmt.setString(8, stud.getAddress());

				int affectedRows = pstmt.executeUpdate();

				System.out.println(affectedRows + " row(s) affected !!");
				System.out.println("Recode Insert successfully...");
				state = true;
			} catch (SQLException e) {

				e.printStackTrace();
			} catch (Exception e1) {
				System.out.println("Error:" + e1);
			} finally {
				try {
					if (null != pstmt)
						pstmt.close();
					if (null != con)
						con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return state;
	}

	public List<Student> getStudents() {

		List<Student> students = new ArrayList<Student>();

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(JDBC_DRIVER);
			try {
				System.out.println("Connecting to Database...");
				con = DriverManager.getConnection(DB_URL, USER, PASS);
				System.out.println("Creating Statement...");

				stmt = con.createStatement();
				System.out.println("Executing SQL...");

				String sql = "SELECT * FROM student";
				rs = stmt.executeQuery(sql);

				while (rs.next()) {
					Student st = new Student();
					st.setRegNo(rs.getInt("reg_no"));
					st.setFirstName(rs.getString("first_name"));
					st.setLastName(rs.getString("last_name"));
					st.setDob(rs.getDate("dob"));
					st.setNic(rs.getString("nic"));
					st.setEmail(rs.getString("email"));
					st.setPhoneNo(rs.getString("phone_no"));
					st.setAddress(rs.getString("address"));

					students.add(st);
				}
				System.out.println("Recode Selected Successfully...");
			} catch (SQLException e) {

				e.printStackTrace();
			} finally {
				try {
					if (null != rs)
						rs.close();
					if (null != stmt)
						stmt.close();
					if (null != con)
						con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return students;

	}
}