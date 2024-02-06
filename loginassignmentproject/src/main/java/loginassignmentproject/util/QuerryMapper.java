package loginassignmentproject.util;

public interface QuerryMapper {
	public static final String INSERT_USER="Insert into users values(?,?,?,?)";
	public static final String GET_USER_BY_EMAIL="Select * from users where email=?";
	

}
