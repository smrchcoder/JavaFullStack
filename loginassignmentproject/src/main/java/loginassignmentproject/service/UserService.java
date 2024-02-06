package loginassignmentproject.service;

import com.blueyonder.springmvcexample.exception.CustomerNotFoundException;

import loginassignmentproject.model.User;

public interface UserService {
	public User addUser(User user);
	//public boolean verfiyUser(String email,String password) throws CustomerNotFoundException;
	public boolean deleteUser(String email);
	public boolean verifyUser(String email, String password) throws CustomerNotFoundException;

}
