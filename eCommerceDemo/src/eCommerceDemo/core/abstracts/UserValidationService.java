package eCommerceDemo.core.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserValidationService {
	
	boolean userRegisterValidate(User user);
	
	boolean logInValidate(String email,String password);

}
