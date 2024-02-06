package loginassignmentproject.UI;

import java.util.Scanner;

import com.blueyonder.springmvcexample.exception.CustomerNotFoundException;

import loginassignmentproject.model.User;
import loginassignmentproject.service.UserService;
import loginassignmentproject.service.UserServiceImpl;

public class Demo {
	public static void main(String args[]) throws CustomerNotFoundException
	{
		boolean exit=true;
		while(exit)
		{ try {
			System.out.println("Choice one of this options 1.Login 2. Signup 3. Exit ");
		    int choice;
		    Scanner sc=new Scanner(System.in);
		    choice=sc.nextInt();
		    String name,email,password;
		    UserService userService=new UserServiceImpl();
		    
		    switch(choice)
		    {
		    
		    case 1:System.out.print("Enter the user name");
		           name=sc.next();
		           
		           System.out.println("Enter the user email");
		           //System.out.println();
		           email=sc.next();
		           System.out.println("Enter the password");
		           //System.out.println();
		           password=sc.next();
		        
		           User user=new User();
		           user.setEmail(email);
		           user.setUserName(name);
		           user.setPassword(password);
		           user.setUserId(5);
		           
		           userService.addUser(user);
		           break;
		           
		    case 2:
		    	System.out.println("Enter the email and pasword for Login");
		    	System.out.println("Email : ");
		    	email=sc.next();
		    	System.out.println("Passowrd : ");
		    	password=sc.next();
		    	boolean userVerfied=userService.verifyUser(email,password);
		    	if(userVerfied)
		    	{
		    		System.out.println("User is Logined sucessfully");
		    	}
		    	else {
		    		System.out.println("No user found with email "+email+" and password "+password);
				}
		    	break;
		    case 3:
		    	exit=false;
		    	break;
		    	default: System.out.println("Wrong choice");
		    
		           
		           
		    }
			
		} catch (CustomerNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
		}
		
	}

}
