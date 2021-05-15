package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.ForAllService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.core.abstracts.UserValidationService;
import eCommerceDemo.entities.concretes.User;

public class AuthManager implements ForAllService{

	UserService userService;
	UserValidationService userValidationService;
	

	public AuthManager() {

	}

	public AuthManager(UserService userService, UserValidationService userValidationService) {
		this.userService = userService;
		this.userValidationService = userValidationService;
		
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		User userToRegister = new User(id, firstName, lastName, email, password);

		if (!this.userValidationService.userRegisterValidate(userToRegister)) {
			System.out.println("Kullanýcý bilgilerinizi kontrol ediniz!");
			return;
		}

		if (!checkIfUserExists(email)) {
			System.out.println("Kayýt olma iþlemi baþarsýz. Bu email ile bir baþka üye mevcut.");
			return;
		}

		

		userService.add(userToRegister);
	}

	@Override
	public void logIn(String email, String password) {

		if (!this.userValidationService.logInValidate(email, password)) {
			System.out.println("Kullanýcý bilgilerinizi kontrol ediniz!");
			return;
		}

		User userToLogin = userService.getByMailAndPassword(email, password);

		if (userToLogin == null) {
			System.out.println("Giriþ baþarýsýz. E-Posta veya þifre hatalýdýr.");
			return;
		}
		
		

		System.out.println("Giriþ baþarýlý  Hoþgeldin " + userToLogin.getFirstName() + " " + userToLogin.getLastName());

	}

	private boolean checkIfUserExists(String email) {
		return this.userService.getByMail(email) == null;
	}
}



