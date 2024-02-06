package loginassignmentproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static  loginassignmentproject.util.DBConnectionUtils.*;
import loginassignmentproject.model.User;
import loginassignmentproject.util.QuerryMapper;

public class UserDAOImpl implements UserDAO{
	 Connection conn=getDBConnection();

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pStmt=conn.prepareStatement(QuerryMapper.INSERT_USER);
			pStmt.setInt(1,user.getUserId());
			pStmt.setString(2,user.getUserName());
			pStmt.setString(3,user.getPassword());
			pStmt.setString(4,user.getEmail());
			if(pStmt.executeUpdate()==1) 
			{
				return user;
			}
			else {
				return null;
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
		//return null;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pStmt=conn.prepareStatement(QuerryMapper.GET_USER_BY_EMAIL);
			pStmt.setString(1,email);
			ResultSet rs=pStmt.executeQuery();
			
			if(rs.next())
			{
				User user=new User();
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString("user_name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				return user;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public boolean deleteUser(String email) {
		// TODO Auto-generated method stub
		return false;
	}



}
