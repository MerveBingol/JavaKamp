package eCommerceDemo.core.concretes;

import java.util.regex.Pattern;

import eCommerceDemo.core.abstracts.UserValidationService;
import eCommerceDemo.entities.concretes.User;

public class UserValidationManager implements UserValidationService {
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public UserValidationManager() {

	}

	
	boolean result=false;
	@Override
	public boolean userRegisterValidate(User user) {
		
		result= firstNameLengthValid(user.getFirstName())&& lastNameLengthValid(user.getLastName())
				&& eMailValid(user.geteMail())&& passwordLengthValid(user.getPassword());
		
		//System.out.println("Baþarýyla kayýt oldunuz :)");
		
		return result;
	}

	@Override
	public boolean logInValidate(String email, String password) {
		result=eMailValid(email) && passwordLengthValid(password);
		
		return result;
	}
	
	
	private boolean firstNameLengthValid(String firstName) {
		
		return firstName.length()>=2;
	}
	
    private boolean lastNameLengthValid(String lastName) {
		
		return lastName.length()>=2;
	}
    
    private boolean passwordLengthValid(String password) {
		
  		return password.length()>=6;
  	}
    
    private boolean eMailValid(String password) {
		
  		return VALID_EMAIL_ADDRESS_REGEX.matcher(password).find();
  	}
    
    
      
    
    
	
	

}
