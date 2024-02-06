package loginassignmentproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter 
@Setter
@ToString
public class User{
private int userId;
private String userName;
private String password;
private String email;

}
