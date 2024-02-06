package loginassignmentproject.service;

import loginassignmentproject.model.User;

import com.blueyonder.springmvcexample.exception.CustomerNotFoundException;

import loginassignmentproject.dao.*;

public class UserServiceImpl implements UserService{
	UserDAOImpl userImpl=new UserDAOImpl();
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		
		return userImpl.addUser(user);
	}

	@Override
	public boolean verifyUser(String email, String password) throws CustomerNotFoundException {
	    // TODO Auto-generated method stub
	    try {
	        User user = userImpl.getUserByEmail(email);
	        if (user == null) {
	             throw new CustomerNotFoundException("User Not Found");
	           
	        }
	        if (user.getPassword().equals(password)) {
	            System.out.println("User successfully logged in");
	            return true;
	        } else {
	            throw new CustomerNotFoundException("Wrong password Entered");
	        }
	    } catch (Exception e) {
	        // Handle exceptions appropriately
	        e.printStackTrace(); // or log the exception
	        throw new CustomerNotFoundException("Error verifying user");
	    }
	}


	@Override
	public boolean deleteUser(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

}
