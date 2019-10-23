package com.hexaware.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.model.bean.User;

public class UserDAOJdbcImpl implements UserDAO {

	@Override
	public int store(User user) {
		int status = 0;
		try {
			Connection con = DBUtility.establishConnection();
			String query = "insert into user_details(name,password,dob) values(?,?,?)";
//			String oracleQuery = "insert into user_details values(user_seq.nextval,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPassword());
			pstmt.setDate(3, Date.valueOf(user.getDob()));
			status = pstmt.executeUpdate();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public User findById(int userId) {
		User user = null;
		try { 
			System.out.println("Y");
			Connection con = DBUtility.establishConnection();
			String query = "select * from user_details where userid = ?";
//			String oracleQuery = "insert into user_details values(user_seq.nextval,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4).toLocalDate());
			}
			//System.out.println(user);
			pstmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
						
		}
		return  user;
	}

	@Override
	public List<User> findAll() {
		List<User> user = new ArrayList<User>();
		try { 
			System.out.println("Y");
			Connection con = DBUtility.establishConnection();
			String query = "select * from user_details";
//			String oracleQuery = "insert into user_details values(user_seq.nextval,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				User u =  new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4).toLocalDate());
				user.add(u);
			}
			//System.out.println(user);
			pstmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
						
		}
		return  user;
	}
	

	@Override
	public User login(int userId, String password) {
		User user = null;
		
		try { 
			Connection con = DBUtility.establishConnection();
			String query = "select * from user_details where userid = ? and password = ?";
//			String oracleQuery = "insert into user_details values(user_seq.nextval,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, userId);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4).toLocalDate());
			}
			//System.out.println(user);
			pstmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
						
		}
		return  user;
	}

	@Override
	public int deleteById(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		
		//User user = new User(8, "Alex", "alex123", LocalDate.of(1998, 4, 12));
		UserDAO dao  = new UserDAOJdbcImpl();
		User user = dao.login(1, "alex123");
		System.out.println(user.getName());
		/*if(status == 0) {
			System.err.println("sorry");
		}
		else {
			System.out.println("done" + status);*/
		}
		
			
			
	

}
