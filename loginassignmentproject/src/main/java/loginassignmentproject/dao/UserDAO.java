package loginassignmentproject.dao;

import loginassignmentproject.model.User;

public interface UserDAO {
	public User addUser(User user);
	public User getUserByEmail(String email);
	public boolean deleteUser(String email);
	

}
